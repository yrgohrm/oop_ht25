public class UglyPairMain {
    public record UglyPair(Object first, Object second) {

    }

    public static UglyPair returnStringAndInteger() {
        return new UglyPair("Hej", 12);
    }

    public static UglyPair returnStringAndString() {
        return new UglyPair("hej", "hopp");
    }

    public static void main(String[] args) {
        UglyPair ret1 = returnStringAndString();

        String str = (String) ret1.first();
        Integer i = (Integer) ret1.second();

        System.out.println(str + " " + i);
    }
}
