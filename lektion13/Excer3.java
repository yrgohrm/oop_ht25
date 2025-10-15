import java.util.*;

public class Excer3 {
    @SuppressWarnings("java:S2140")
    public static int imBadYouKnowIt(int value) {
        Integer[] arr = { Integer.valueOf(0), null, Integer.valueOf(2) };
        int i = (int) (Math.random() * 5);
        return value / arr[i];
    }

    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 0; i < 10000; ++i) {
            try {
                imBadYouKnowIt(rand.nextInt());
            }
            catch (Exception ex) {
                System.out.println(ex.getClass().getSimpleName());
            }
        }
    }
}
