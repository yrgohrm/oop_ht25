import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett heltal:");
        int num = scanner.nextInt();

        int count = 0;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (startsWithOne(i)) {
                    count++;
                }
            }
        }
        else {
            for (int i = -1; i >= num; i--) {
                if (startsWithOne(i)) {
                    count++;
                }
            }
        }

        System.out.println(count);

        scanner.close();
    }

    /**
     * Returns true if the first digit in the number is a one.
     * 
     * 234 is false
     * -12 is true
     * 100 is true
     * 
     * @param i the number to check
     * @return true if the first digit is one, false otherwise
     */
    private static boolean startsWithOne(int i) {
        int pos = (i >= 0) ? 0 : 1;
        String num = String.valueOf(i);
        return num.charAt(pos) == '1';
    }
}
