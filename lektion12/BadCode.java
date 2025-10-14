import java.util.*;

public class BadCode {
    public void doSpaBooking(int age) {
        // stuff
    }

    public void bookSpa() {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("How old are you?");
            int n = input.nextInt();
            if (n < 18) {
                throw new IllegalArgumentException();
            }

            doSpaBooking(n);
        } catch (IllegalArgumentException ex) {
            System.err.println("You must be over 18 years old to book a spa");
        }
    }

    public void betterBookSpa() {
        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int n = input.nextInt();
        if (n < 18) {
            System.err.println("You must be over 18 years old to book a spa");
            return;
        }

        doSpaBooking(n);
    }

}
