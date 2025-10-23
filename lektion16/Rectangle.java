public class Rectangle implements Comparable<Rectangle> {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Rectangle o) {
        int thisArea = width * height;
        int thatArea = o.width * o.height;

        return thisArea - thatArea;
        
        // if (thisArea == thatArea) {
        //     return 0;
        // } else if (thisArea > thatArea) {
        //     return -1;
        // } else {
        //     return 1;
        // }
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + width;
        result = prime * result + height;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rectangle other = (Rectangle) obj;
        if (width != other.width)
            return false;
        if (height != other.height)
            return false;
        return true;
    }

    
}
