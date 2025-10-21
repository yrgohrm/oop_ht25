public class Annot {
    public static void main(String[] args) {
        foo();
    }

    @SuppressWarnings({"java:S1488", "java:S2140"})
    private static int foo() {
        int data = (int)Math.random();
        return data;
    }
}
