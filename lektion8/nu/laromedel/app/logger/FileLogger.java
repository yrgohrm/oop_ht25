package nu.laromedel.app.logger;

import java.io.*;
import java.nio.file.*;
import java.time.*;

/**
 * Logger that logs everything to a file. 
 *
 */
public class FileLogger implements Logger {

    // Please be aware that this is a very simple example
    // and this class contains several problems when used
    // in a real life situation.

    // Also, ignore that it contains quite a lot of things
    // we have yet to talk about.

    private BufferedWriter writer;

    public FileLogger() {
        try {
            writer = Files.newBufferedWriter(Path.of("program.log"), StandardOpenOption.APPEND);
        }
        catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }

    @Override
    public void info(String message) {
        log("INFO", message);
    }

    @Override
    public void warn(String message) {
        log("WARN", message);
    }

    @Override
    public void error(String message) {
        log("ERROR", message);
    }
    
    // this is a helper method. A private method that makes the other
    // methods easier to write and with less duplicated code
    // this is not part of the logger interface and does not need to be
    private void log(String level, String message) {
        try {
            String date = LocalDateTime.now().toString();
            writer.write(String.format("%s [%s] - %s%n", date, level, message));
            writer.flush();
        }
        catch (IOException ex) {
            throw new UncheckedIOException(ex);
        }
    }
}
