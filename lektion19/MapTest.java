import java.io.*;
import java.nio.file.*;
import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Du måste ange argument!");
            return;
        }
        
        try {
            Path file = Path.of(args[0]);
            String data = Files.readString(file);

            Map<Character, Integer> counter = new TreeMap<>();

            for (char ch : data.toCharArray()) {
                // Integer count = counter.get(ch);
                // if (count == null) {
                //     counter.put(ch, 1);
                // }
                // else {
                //     counter.put(ch, count + 1);
                // }

                int count = counter.getOrDefault(ch, 0);
                counter.put(ch, count + 1);

                // counter.merge(ch, 1, Integer::sum);
            }

            for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        catch (IOException ex) {
            System.out.println("Fel uppstod. Ta en kaffe.");
        }


    }
}
