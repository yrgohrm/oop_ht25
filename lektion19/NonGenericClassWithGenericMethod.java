import java.io.*;
import java.util.*;

public class NonGenericClassWithGenericMethod {
    public static boolean sameSize(List<?> l1, List<?> l2) {
        return l1.size() == l2.size();
    }

    public static <T> boolean allSame(List<T> values, Comparator<T> comp) {
        if (values.isEmpty()) {
            return true;
        }

        T first = values.get(0);
        for (T val : values) {
            if (comp.compare(first, val) != 0) {
                return false;
            }
        }

        return true;
    }

    public static <T> T first(List<T> list) {
        return list.getFirst();
    }

    public static <T1, T2> String join(T1 v1, T2 v2) {
        return v1.toString() + v2.toString();
    }

    public static void addReader(List<? super Reader> list) {
        list.add(new BufferedReader(null));
    }

    public static void getReader(List<? extends Reader> list) {
        Reader r = list.get(0);
        System.out.println(r);
    }
}
