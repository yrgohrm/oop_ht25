import java.awt.geom.Point2D;

public class Ex1Arr {
    public static void main(String[] args) {
        int[] intArray = new int[100];
        int[] intArray2 = {1, 2, 3, 4};
        Point2D[] pointArray = new Point2D[5];

        for (int i = 0; i < intArray2.length; ++i) {
            System.out.println("" + intArray2[i]);
        }

        for (Point2D point : pointArray) {
            System.out.println("" + point); // skriver ut null
        }

    }
}
