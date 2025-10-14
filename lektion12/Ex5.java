public class Ex5 {
    private static int lightSpeedPerUnit(int val) {
        if (val == 0) {
            throw new IllegalArgumentException("can't divide by zero");
        }

        return 299_792_458 / val;
    }

    private static int lightSpeedPerKm() {
        try {
            return lightSpeedPerUnit(0); // oops...
        }
        catch (IllegalArgumentException ex) {
            System.err.println("First: " + ex.getMessage());
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            int speed = lightSpeedPerKm();
            System.out.println("Speed: " + speed);
        }
        catch (ArithmeticException ex) {
            System.err.println("Second: " + ex.getMessage());
        }
    }
}
