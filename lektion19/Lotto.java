import java.util.*;
import java.util.random.*;

public class Lotto {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            Collection<String> names = new HashSet<>();

            while (true) {
                System.out.println("Skriv in ett namn ett avsluta med tomrad.");
                String name = input.nextLine();

                if (name.isBlank()) {
                    break;
                }

                if (!names.add(name)) {
                    System.out.println("Personen har redan en lott.");
                }
            }

            RandomGenerator rand = RandomGenerator.getDefault();
            List<String> orderedNames = new ArrayList<>(names);
            int winnerNumber = rand.nextInt(orderedNames.size());
            String winner = orderedNames.get(winnerNumber);

            System.out.println("The winner is: " + winner);
        }
    }
}
