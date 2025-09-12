import java.util.*;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett heltal:");
        int number;
        do {
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Skriv in ett positivt heltal!");
            }
        } while (number < 0);


        for (int i = 1; i <= number; ++i) {
            System.out.println(i);
        }

        // if (number < 0) {
        //     System.out.println("Skriv in ett vettigt tal...");
        // }

        // for (int i = 1; i <= number; ++i) {
        //     System.out.println(i);
        // }

        // if (number > 0) {
        // for (int i = 1; i <= number; ++i) {
        // System.out.println(i);
        // }
        // }
        // else {
        // System.out.println("Skriv in ett vettigt tal...");
        // }
    }
}
