import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag(args[0]);
        ResourceBundle bundle = ResourceBundle.getBundle("translations", locale);

        System.out.println(bundle.getString("hello"));

        String text = String.format(locale, bundle.getString("numbers"), 22, Math.PI);
        System.out.println(text);


        System.out.printf("%d %.2f", 1, 23.56);
    }
}
