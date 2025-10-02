import java.util.*;

public class ArrayPrint {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        int[][] marr = { { 1, 2}, { 3, 4 }};

        for (int i = 0; i < marr.length; i++) {
            System.out.println(Arrays.toString(marr[i]));
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
