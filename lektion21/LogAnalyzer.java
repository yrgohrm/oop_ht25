import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.zip.*;

public class LogAnalyzer {

    private sealed interface LogRecord {
        record LogEntry(String timestamp, String level, String message) implements LogRecord {
        }

        record LogError(String message) implements LogRecord {
        }
    }

    private static final class LogStatsCollector {
        final AtomicLong totalEntries = new AtomicLong(0);
        final Map<String, Long> levelCounts = new ConcurrentHashMap<>();
        final Map<String, Long> messageCounts = new ConcurrentHashMap<>();
        final List<String> errors = Collections.synchronizedList(new ArrayList<>());

        void accept(LogRecord entry) {
            switch (entry) {
                case LogRecord.LogEntry(_, var level, var message) -> {
                    totalEntries.incrementAndGet();
                    levelCounts.merge(level, 1L, Long::sum);
                    messageCounts.merge(message, 1L, Long::sum);
                }
                case LogRecord.LogError(String message) -> {
                    errors.add(message);
                }
            }
        }

        LogStatsCollector combine(LogStatsCollector other) {
            this.totalEntries.addAndGet(other.totalEntries.get());
            other.levelCounts.forEach((k, v) -> this.levelCounts.merge(k, v, Long::sum));
            other.messageCounts.forEach((k, v) -> this.messageCounts.merge(k, v, Long::sum));
            return this;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Användning: java LogAnalyzer <loggfil1> [loggfil2 ...]");
            return;
        }

        System.out.println("Bearbetar " + args.length + " filer...");
        LogStatsCollector stats = Arrays.stream(args)
                .map(Path::of)
                .mapMulti(LogAnalyzer::fileToLines)
                .collect(Collector.of(
                        LogStatsCollector::new,
                        LogStatsCollector::accept,
                        LogStatsCollector::combine));

        if (stats.totalEntries.get() == 0) {
            System.out.println("\nInga giltiga loggdata hittades.");
        } else {
            printReport(stats);
        }
    }

    private static void fileToLines(Path path, Consumer<LogRecord> consumer) {
        if (!Files.exists(path)) {
            consumer.accept(new LogRecord.LogError("Filen hittades inte: " + path));
            return;
        }

        try (InputStream fis = Files.newInputStream(path);
                InputStream is = isGZip(path) ? new GZIPInputStream(fis) : fis;
                BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))) {
            String line;
            int row = 0;
            while ((line = br.readLine()) != null) {
                row++;
                consumer.accept(parseLine(line, path, row));
            }
        } catch (IOException ex) {
            consumer.accept(new LogRecord.LogError("Kunde inte läsa filen: " + path
                    + ": " + ex.getMessage()));
        }
    }

    private static boolean isGZip(Path path) throws IOException {
        return "application/x-gzip".equals(Files.probeContentType(path));
    }

    private static LogRecord parseLine(String line, Path path, int row) {
        String[] parts = line.split("\\s+", 3);

        if (parts.length < 3) {
            return new LogRecord.LogError("Loggrad har inte rätt format (" + path + ":" + row + ")");
        }

        return new LogRecord.LogEntry(parts[0], parts[1], parts[2]);
    }

    private static void printReport(LogStatsCollector stats) {
        stats.errors.forEach(err -> System.err.println("FEL: " + err));

        System.out.println("\nTotal log entries: " + stats.totalEntries.get());

        System.out.println("\nLog level distribution:");
        stats.levelCounts.forEach((level, count) -> System.out.println(level + ": " + count));

        System.out.println("\nTop 3 most frequent log messages:");
        stats.messageCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
