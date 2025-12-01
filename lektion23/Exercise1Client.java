import java.io.*;
import java.net.*;
import java.util.concurrent.*;

public class Exercise1Client {
    public static void main(String[] args) throws IOException {
        try (Socket conn = new Socket("localhost", 45765)) {
            var input = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            var output = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));

            int rand = ThreadLocalRandom.current().nextInt(0, 100);
            output.write(Integer.toString(rand));
            output.write("\n");
            output.flush();

            String onePlusAsString = input.readLine();
            int onePlus = Integer.parseInt(onePlusAsString);

            if (rand + 1 == onePlus) {
                System.out.println("allt gick bra!");
            }
            else {
                System.out.println("Det gick åt skogen!");
            }
        }
    }
}
