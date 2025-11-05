public class PairMain {
    public record Pair<T1, T2>(T1 value1, T2 value2) {
    }

    public static Pair<String, Integer> returnSI() {
        return new Pair<>("hej", 1);
    }

    public static Pair<String, String> returnSS() {
        return new Pair<>("hej", "hopp");
    }

    public static void main(String[] args) {
        Pair<String, Integer> p = returnSI();

        String str = p.value1();
        Integer i = p.value2();

        System.out.println(str + " " + i);
    }
}
