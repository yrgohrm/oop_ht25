import java.util.concurrent.*;

public class EsTest {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 5; ++i) {
                service.submit(() -> {
                    for (int j = 0; j < 5; ++j) {
                        sleep(1000);
                        System.out.println(Thread.currentThread().getName());
                    }
                });
            }
        }
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
