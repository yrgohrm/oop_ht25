public class Ex1Thread {
    private record PrintRunner(String text) implements Runnable {
        public void run() {
            for (int i = 0; i < 200; ++i) {
                System.out.print(text + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintRunner pr1 = new PrintRunner("Hello");
        PrintRunner pr2 = new PrintRunner("World");

        Thread t1 = new Thread(pr1, "the-best-thread"); // vilken kod vi skall köra
        Thread t2 = new Thread(pr2); // vilken kod vi skall köra
        Thread t3 = new Thread(() -> System.out.println("XXXXXXXX"));

        t1.start(); // och kör den! startar första tråden
        t2.start(); // och kör den! startar andra tråden
        t3.start();
    }
}



