import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Ange EN fil.");
            return;
        }

        List<String> allWords = new ArrayList<>();

        try (var br = Files.newBufferedReader(Path.of(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                allWords.addAll(Arrays.asList(words));
            }
        }
        catch (IOException ex) {
            System.out.println("Det där gick sådär... ta en kopp te...");
        }

        allWords = allWords.stream().filter(w -> !w.isBlank()).toList();

        System.out.println("Totalt antal ord: " + allWords.size());

        Map<String, Integer> wordCount = new TreeMap<>();
        for (String word : allWords) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        var wordCountList = new ArrayList<>(wordCount.entrySet());
        Comparator<Map.Entry<String, Integer>> comp = Map.Entry.comparingByValue();
        wordCountList.sort(comp);

        System.out.println(wordCountList.getLast());

        int countAs = 0;
        for (var word : wordCount.keySet()) {
            if (!word.startsWith("a")) {
                break;
            }

            countAs++;
        }

        System.out.println("Unika ord på A: " + countAs);
    }
}
