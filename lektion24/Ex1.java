import java.text.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        // Locale locale = Locale.forLanguageTag("sv-SE");
        // Locale locale = Locale.forLanguageTag("sr-Latn-RS");
        Locale locale = Locale.forLanguageTag("en-US");

        NumberFormat nf = NumberFormat.getInstance(locale);
        String pi = nf.format(StrictMath.PI);
        System.out.println(pi);

        DateTimeFormatter df = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT).withLocale(locale);
        LocalDateTime dt = LocalDateTime.now();
        String date = dt.format(df);
        System.out.println(date);

        String misc = String.format(locale, "%d %.5f", Integer.MAX_VALUE, StrictMath.PI);
        System.out.println(misc);

        System.out.printf(locale, "%.2f%n", StrictMath.PI);
    }
}
