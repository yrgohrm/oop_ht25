public class Ex8 {
    private static void foo() {
        // does something that produces an error
        throw new IllegalArgumentException("some error");
    }

    private static void bar() {
        try {
            foo();
        }
        catch (IllegalArgumentException ex) {
            // make into another exception
            throw new IllegalCallerException("another error", ex);
        }
    }

    public static void main(String[] args) {
        bar();
    }
}
