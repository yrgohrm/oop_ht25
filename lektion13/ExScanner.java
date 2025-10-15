import java.util.*;

public class ExScanner {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            doAllTheStuff(input);
        }
    }

    private static void doAllTheStuff(Scanner input) {
        System.out.println("Skriv in ett tal:");
        int num = input.nextInt();
        if (num > 10000) {
            System.out.println("Oj det var ett stort tal!");
        }
    }
}
