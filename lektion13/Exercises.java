import java.io.*;
import java.nio.file.*;

public class Exercises {
    public static void main(String[] args) {
        
        try (BufferedWriter bw = Files.newBufferedWriter(Path.of("hello.txt"), StandardOpenOption.APPEND)) {
            bw.write("Hello, world!\n");
        }
        catch (IOException ex) {
            System.err.println("Could not write properly to the file.");
        }
    }
}