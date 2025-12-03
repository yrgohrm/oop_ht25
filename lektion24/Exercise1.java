import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("sv-SE");
        ResourceBundle textBundle = ResourceBundle.getBundle("exercise1", locale);

        try (var input = new Scanner(System.in).useLocale(locale)) {

            double[] numbers = new double[3];
            for (int i = 0; i < numbers.length; ++i) {
                System.out.println(textBundle.getString("enter_number"));
                numbers[i] = input.nextDouble();
            }

            double sum = Arrays.stream(numbers).sum();
            double mean = sum / numbers.length;

            System.out.printf(locale, "%.3f%n", mean);
        }
    }
}
