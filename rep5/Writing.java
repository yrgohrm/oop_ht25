import java.io.*;
import java.nio.file.*;

public class Writing {
    public static void main(String[] args) {
        try (var out = Files.newBufferedWriter(Path.of("output.txt"),
                StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            for (int i = 0; i < 4; i++) {
                out.write("Hello World\n");
            }
        } catch (IOException ex) {
            System.out.println("Det gick tyvärr fel, försök igen.");
        }
    }
}
