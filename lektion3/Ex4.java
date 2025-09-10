import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett tal:");
        int num = scanner.nextInt();

        if (num > 100 && num <= 1000 ) {
            System.out.println("Det är ganska stort.");
        }
        else if (num > 1000) {
            System.out.println("Det är jättestort!");
        }
        else {
            System.out.println("Det är ett litet tal!");
        }
    }
}
