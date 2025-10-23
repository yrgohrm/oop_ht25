import java.util.*;

public class CircumferenceComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        int c1 = o1.getWidth() * 2 + o1.getHeight() * 2;
        int c2 = o2.getWidth() * 2 + o2.getHeight() * 2;

        return c1 - c2;
    }
    
}
