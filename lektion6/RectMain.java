public class RectMain {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 345);

        rect.print();

        rect.setColor("brown");

        rect.print();

        Rectangle rect2 = new Rectangle(201);
        rect2.print();
    }
}
