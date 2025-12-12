import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Ex4_2 {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Ange EN fil.");
            return;
        }

        try (var stream = Files.lines(Path.of(args[0]))) {
            var words = stream.flatMap(l -> Arrays.stream(l.split("\\W+")))
                .filter(w -> !w.isBlank())
                .map(String::toLowerCase)
                .toList();

            System.out.println("word count: " + words.size());

            var wordCount = words.stream()
                .collect(Collectors.groupingBy(
                    word -> word,
                    Collectors.counting()
                ));

            var firstCharCount = wordCount.keySet().stream()
                .collect(Collectors.groupingBy(
                    word -> word.charAt(0),
                    Collectors.counting()
                ));

            Comparator<Map.Entry<String, Long>> comp = Map.Entry.comparingByValue();
            System.out.println(wordCount.entrySet().stream().sorted(comp).toList().getLast());
            System.out.println(firstCharCount.get('a'));
        }
    }
}
