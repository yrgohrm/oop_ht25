import java.util.*;
import java.util.stream.*;

public class Exercises {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            List<String> names = new ArrayList<>();

            System.out.println("Skriv in några namn, avsluta med tomrad:");
            while (true) {
                String name = input.nextLine();
                if (name.isBlank()) {
                    break;
                }

                names.add(name);
            }

            // for (String name : names) {
            // System.out.println(name);
            // }

            var stream = names.stream()
                    .map(String::strip)
                    .filter(s -> s.length() >= 2)
                    .map(String::toLowerCase);

            var filteredNames = stream
                    .filter(s -> s.charAt(1) != 'a')
                    .toList();

            for (String name : filteredNames) {
                System.out.println(name);
            }
        }
    }
}
