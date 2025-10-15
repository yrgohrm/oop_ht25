import java.io.*;
import java.nio.file.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("xx.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException ex) {
            System.err.println("Något gick snett: " + ex.getMessage());
        }
    }
}
