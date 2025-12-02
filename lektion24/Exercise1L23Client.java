import java.io.*;
import java.net.*;
import java.util.random.*;

public class Exercise1L23Client {
    public static void main(String[] args) throws IOException {
        try (var server = new Socket("localhost", 5678)) {
            System.out.println("connected: " + server);

            RandomGenerator rand = RandomGenerator.getDefault();

            try (var out = new DataOutputStream(server.getOutputStream());
                    var in = new DataInputStream(server.getInputStream())) {

                int n = rand.nextInt(0, 100);
                out.writeInt(n);
                out.flush();
                
                int n2 = in.readInt();

                if (n + 1 == n2) {
                    System.out.println("Det gick bra");
                }
                else {
                    System.out.println("Det blev fel!");
                }
            }

        }
    }
}
