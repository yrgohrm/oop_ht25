import java.util.*;

public class Coll {
    public static void fancyPrint(Collection<?> stuff) {
        for (Object thing : stuff) {
            System.out.println("Sak: " + thing);
        }
    }


    public static void main(String[] args) {
        List<String> strList = List.of("hej", "Hallå");
        Set<Integer> intSet = Set.of(1, 2, 3);

        fancyPrint(strList);
        fancyPrint(intSet);
    }
}
