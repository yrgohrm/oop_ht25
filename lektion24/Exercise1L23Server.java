import java.io.*;
import java.net.*;

public class Exercise1L23Server {
    public static void main(String[] args) throws IOException {
        try (var server = new ServerSocket(5678)) {

            try (var client = server.accept()) {

                try (var out = new DataOutputStream(client.getOutputStream());
                        var in = new DataInputStream(client.getInputStream())) {

                    int n = in.readInt();
                    System.out.println(n);

                    out.writeInt(n+1);
                    out.flush();
                }

            }

        }
    }
}
