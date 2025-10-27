public class PatMatch {
    public static void main(String[] args) {
        record Pair(Object x, Object y) {
        }

        Pair p = new Pair(42, 42);

        if (p instanceof Pair(String s, String t)) {
            System.out.println(s + ", " + t);
        } else {
            System.out.println("Not a pair of strings");
        }

        switch (p) {
            case Pair(String s, Integer i) -> System.out.println("s i");
            case Pair(String s1, String s2) -> System.out.println("s s");
            case Pair(Integer i1, Integer i2) -> System.out.println("i i" + i1 + i2);
            default -> System.out.println("unknown");
        }
    }
}
