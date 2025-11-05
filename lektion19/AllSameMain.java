import java.util.*;

public class AllSameMain {
    public static void main(String[] args) {
        
        // List<String> strList = List.of("hej", "hej", "hopp");
        // List<Integer> intList = List.of(1, 1, 1, 1);

        // boolean isStrSame = NonGenericClassWithGenericMethod.allSame(strList, Comparator.naturalOrder());
        // boolean isIntSame = NonGenericClassWithGenericMethod.allSame(intList, Comparator.naturalOrder());

        var strList = List.of("hej", "hej", "hopp");
        var intList = List.of(1, 1, 1, 1);

        var isStrSame = NonGenericClassWithGenericMethod.allSame(strList, Comparator.naturalOrder());
        var isIntSame = NonGenericClassWithGenericMethod.allSame(intList, Comparator.naturalOrder());


        var someList = new ArrayList<String>();

        System.out.println(isStrSame);
        System.out.println(isIntSame);


    }
}
