import java.util.*;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;

        while (!quit) {
            System.out.println("Är det dags att sluta nu?");
            String answer = scanner.nextLine();

            if (answer.equals("ja")) {
                quit = true;
            }
        }
    }
}
