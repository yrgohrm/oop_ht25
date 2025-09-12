import java.util.*;

public class Dogs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vilken hundras är bäst?");
        String breed = scanner.nextLine();

        breed = breed.toLowerCase();

        switch (breed) {
            case "collie" -> {
                System.out.println("Helt korrekt!");
                System.out.println("Kul");
            }
            case "amstaff" -> System.out.println("Ett bra val");
            default -> System.out.println("Det är ett bra val med.");
        }
    }
}
