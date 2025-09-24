public class ExerciseSeven {
    public static void main(String[] args) {
        // wait for someone to press enter
        System.console().readLine();

        // create lots of objects and print them
        for (int i = 0; i < 1_000_000; ++i) {
            Rectangle r = new Rectangle();
            System.out.println(r);
        }

        // wait for someone to press enter
        System.console().readLine();
    }
}