public class MathFunctions {
    private MathFunctions() {}
    
    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static double mean(double a, double b) {
        return (a + b) / 2.0;
    }

    public static int mean(int a, int b) {
        return (a + b) / 2;
    }
}
