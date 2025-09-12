import java.util.Scanner;

public class Ex2Multiplication {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Vilken gångertabell vill du se?");
        int table = scanner.nextInt();

        for (int i = 10; i > 0; i--) {
            int product = i * table;
            System.out.printf("%2d x %2d = %3d%n", table, i, product);
        }

    }
}
