import java.util.*;

public class ClassTest {
    private static void stuff(List<String> list) {
        System.out.println(list.getClass().getName());
    }

    public static void main(String[] args) {
        stuff(new ArrayList<>());
        stuff(new LinkedList<>());
    }
}
