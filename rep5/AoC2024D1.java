import java.io.*;
import java.nio.file.*;
import java.util.*;

public class AoC2024D1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Path.of("input.txt"));

            for (String line : lines) {
                String[] parts = line.split("\\s+");
                int v1 = Integer.parseInt(parts[0]);
                int v2 = Integer.parseInt(parts[1]);

                list1.add(v1);
                list2.add(v2);
            }

            // System.out.println(list1);
            // System.out.println(list2);

            Collections.sort(list1);
            Collections.sort(list2);

            long total = 0;
            for (int i = 0; i < list1.size(); i++) {
                int v1 = list1.get(i);
                int v2 = list2.get(i);

                int diff = Math.abs(v1 - v2);
                total += diff;
            }

            System.out.println(total);
        }
        catch (IOException ex) {
            System.out.println("Något gick fel med I/O: " + ex.getMessage());
        }
    }
}
