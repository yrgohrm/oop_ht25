import java.util.*;
import java.util.function.*;

public class Ex1 {
    public static void main(String[] args) {
        List<String> names = List.of("Hampus", "   ", "Nahid", "Anders", "Eva");

        names.stream()
                .filter(Predicate.not(String::isBlank))
                .filter(Ex1::notH)
                .map(String::toUpperCase)
                // .limit(2)
                // .map(String::length)
                .sorted()
                .forEach(System.out::println);
    }

    private static boolean notH(String str) {
        return str == null || str.isEmpty() || str.charAt(0) != 'H';
    }
}
