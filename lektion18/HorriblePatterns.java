public class HorriblePatterns {
    record Box<T>(T t) {
    }

    record Pair<F, S>(F first, S second) {
    }

    public static void main(String[] args) {
        //var foo = new Box<>(1);
        var foo = new Box<>(new Pair<>(new Box<>(1), new Box<>(2)));
        
        stuff(foo);
    }

    private static void stuff(Box<?> foo) {
        if (foo instanceof Box(Pair(Box(Integer a), var b))) {
            System.out.println(a + " " + b);
        }
        else if (foo instanceof Box(Integer i)) {
            System.out.println("int " + i);
        }
    }
}