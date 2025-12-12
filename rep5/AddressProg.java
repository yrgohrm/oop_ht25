import java.util.*;

public class AddressProg {
    record Address(String name, String street, String zip, String city, String country) {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Skriv in din fulla adress:");
            String address = scanner.nextLine();

            String[] parts = address.split(",");
            if (parts.length != 5) {
                System.out.println("Skriv rätt!");
                return;
            }

            String name = parts[0].strip();
            String street = parts[1].strip();
            String zip = parts[2].strip();
            String city = parts[3].strip();
            String country = parts[4].strip();

            Address addr = new Address(name, street, zip, city, country);
            System.out.println(addr);
        }
    }
}
