public class Ex1Fac {
    // calculates the facutly 1*2*...*n
    /**
     * Calculate the faculty of a number.
     * Must be 0 or greater.
     * 
     * @param n the number
     * @return the result
     */
    public static int fac(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must not be negative");
        }

        if (n == 0) {
            return 1;
        } else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(1));
    }
}
