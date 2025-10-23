import java.util.*;

public class RectangleMain {
    public static void main(String[] args) {
        List<Rectangle> rects = new ArrayList<>(List.of(
            new Rectangle(100, 100),
            new Rectangle(10, 1), // a=10, c=22
            new Rectangle(4, 3),  // a=12, c=14
            new Rectangle(1000, 1000),
            new Rectangle(1, 1)
        ));

        Collections.sort(rects);
        // Collections.sort(rects, new CircumferenceComparator());

        for (Rectangle r : rects) {
            System.out.println(r);
        }

        Rectangle r1 = new Rectangle(100, 100);
        Rectangle r2 = new Rectangle(12, 2);

        if (r1.compareTo(r2) > 0) {
            System.out.println("r1 är större!");
        }
    }
    
}
