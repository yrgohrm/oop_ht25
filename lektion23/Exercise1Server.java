import java.io.*;
import java.net.*;

public class Exercise1Server {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(45765)) {
            while (true) {
                try (Socket client = server.accept()) {
                    handleClient(client);
                }
            }
        }
    }

    private static void handleClient(Socket client) throws IOException {
        var input = new BufferedReader(new InputStreamReader(client.getInputStream()));
        var output = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

        String randAsString = input.readLine();
        int rand = Integer.parseInt(randAsString);

        System.out.println(rand);

        output.write(Integer.toString(rand+1));
        output.write("\n");
        output.flush();
    }
}
