import java.util.*;

public class Main {
    public static int readSmallInt(Scanner scanner) {
        System.out.println("Enter a number below 10:");
        int num = scanner.nextInt();
        if (num >= 10) {
            throw new TooLargeException(num + " is 10 or larger");
        }

        return num;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 3 small numbers.");

        try (Scanner input = new Scanner(System.in)) {
            mainLoop(numbers, input);
        }

        System.out.println("The sum of your numbers:");
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    private static void mainLoop(List<Integer> numbers, Scanner input) {
        do {
            try {
                int res = readSmallInt(input);
                numbers.add(res);
            }
            catch (TooLargeException ex) {
                System.err.println("Number is too large. Try again.");
            }
            catch (InputMismatchException ex) {
                System.err.println("Please enter a small number.");
            }
            catch (RuntimeException ex) {
                System.err.println("Unknown bad things happened: " + ex.getMessage());
                System.exit(-1);
            }
        } while (numbers.size() < 3);
    }
}
