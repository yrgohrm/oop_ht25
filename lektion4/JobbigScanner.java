import java.util.Scanner;

public class JobbigScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hur gammal är du?");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Vad heter du?");
        String name = scanner.nextLine();

        System.out.printf("Hej %s, du är %d år gammal.", name, age);
    }
}
