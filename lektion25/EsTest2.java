import java.util.concurrent.*;

public class EsTest2 {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newCachedThreadPool()) {
            for (String filename : args) {
                service.submit(() -> handleFile(filename));
            }
        }
    }

    private static void handleFile(String filename) {
        // ...
    }

    private static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
