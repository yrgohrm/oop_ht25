import java.io.*;
import java.nio.file.*;

public class Ex5 {
    public static void main(String[] args) throws IOException {
        // Java 11+
        Path theFile11 = Path.of("foo/bar.txt");
        if (!Files.isReadable(theFile11)) {
            System.out.println("No such file exists!");
            System.exit(-1);
        }

        try (BufferedReader reader = Files.newBufferedReader(theFile11)) {
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toLowerCase());
            }
        }
    }
}
