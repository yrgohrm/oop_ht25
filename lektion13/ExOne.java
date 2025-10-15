import java.io.*;
import java.nio.file.*;

public class ExOne {
    public static void main(String[] args) throws IOException {
        Path theFile = Path.of("thefile.txt");

        try (BufferedWriter bw = Files.newBufferedWriter(theFile, StandardOpenOption.APPEND)) {
            bw.write("Hello, World! åäöåäö");
        }

        BufferedReader br = Files.newBufferedReader(theFile);

        String firstLine = br.readLine();
        System.out.println(firstLine);

        br.close();
    }
}
