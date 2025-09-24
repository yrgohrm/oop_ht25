public class Overload {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(100, 400);

        rect.print();
        rect.print(100);   
        rect.print(System.err);
    }
}
