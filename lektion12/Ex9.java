import java.io.*;

public class Ex9 {
    private static void readFile(String name) throws IOException {
        InputStream is = new FileInputStream(name);
        is.read();
    }

    public static void main(String[] args) throws IOException {
        readFile("nofile.txt");
    }
}
