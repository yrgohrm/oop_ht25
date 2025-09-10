import java.util.*;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mata in bredden på din rektangel:");
        double width = scanner.nextDouble();

        System.out.println("Mata in höjden på din rektangel.");
        double height = scanner.nextDouble();

        double circumference = 2 * width + 2 * height;
        double area = width * height;

        System.out.printf("Omkretsen är: %.2f%n", circumference);
        System.out.printf("Arean är: %.2f%n", area);

        scanner.close();
    }
}
