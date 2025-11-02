import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> data = new TreeSet<>();
        data.add("Hejsan");
        data.add("Hoppsan");
        data.add("Hejsan");
        data.add("Ojsan");
        data.add("????");

        for (String value : data) {
            System.out.println(value);
        }

        if (data.contains("Hejsan")) {
            System.out.println("Innehåller hejsan");
        }
    }
}
