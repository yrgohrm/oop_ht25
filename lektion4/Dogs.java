import java.util.*;

public class Dogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vilken hundras är bäst?");
        String breed = scanner.nextLine();

        breed = breed.toLowerCase();

        if (breed.equals("collie")) {
            System.out.println("Helt korrekt!");
        }
        else if (breed.equals("amstaff")) {
            System.out.println("Ett bra val");
        }
        else {
            System.out.println("Det är ett bra val det med!");
        }

    }
}
