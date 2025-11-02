import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ColorCounter {
    public static void main(String[] args) throws IOException {
        // läs filen
        // dela upp den i ord
        // identifera färgnamn
        // räkna dem
        // skriva ut dem

        String file = Files.readString(Path.of("summer.txt"));
        String[] words = file.split("\\W+");

        Map<String, Integer> colorCount = new TreeMap<>();

        for (String word : words) {
            String lcWord = word.toLowerCase();
            if (isColorName(lcWord)) {
                colorCount.merge(lcWord, 1, Integer::sum);

                // if (colorCount.containsKey(lcWord)) {
                //     int count = colorCount.get(lcWord);
                //     colorCount.put(lcWord, count + 1);
                // }
                // else {
                //     colorCount.put(lcWord, 1);
                // }
            }
        }

        for (Map.Entry<String, Integer> entry : colorCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static boolean isColorName(String word) {
        return switch (word.toLowerCase()) {
            case "blue", "green", "orange", "red", "white", "black", "yellow" -> true;
            default -> false;
        };
    }
}
