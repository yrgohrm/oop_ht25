import java.io.PrintStream;

public class Rectangle {
    private double height;
    private double width;
    private String stuff;
    private String stuff2;

    public Rectangle() {
        height = 100;
        width = 100;
        stuff = String.valueOf(Math.random());
        stuff2 = String.valueOf(Math.random());
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("print()");
        print(System.out);
    }

    private void print(PrintStream ps) {
        ps.printf("w: %.2f, h: %.2f%n", width, height);
        ps.printf("%s %s", stuff, stuff2);
    }

    public void print(int num) {
        System.out.println("print(int)");
        for (int i = 0; i < num; ++i) {
            print();
        }
    }
}

