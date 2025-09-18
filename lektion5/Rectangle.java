public class Rectangle {
    private double height;
    private double width;
    private String color;

    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }

    public void printShort() {
        System.out.printf("(%.2f, %.2f, %s)", height, width, color);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets the color.
     * 
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSmallerThan(double area) {
        return (width * height) < area;
    }

    /**
     * Calculate the rectangles area.
     * 
     * @return the area of the rectangle.
     */
    public double area() {
        double area = width * height;
        return area;
    }
}
