import java.util.*;

public class Stuff {
    public static void main(String[] args) {
        
        List<String> arrList = new ArrayList<>();
        List<String> linkList = new LinkedList<>();

        second(arrList);
        second(linkList);
    }

    public static String second(List<String> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("must be at least two");
        }

        return list.get(2);
    }
}
