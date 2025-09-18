public class Ex1 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.setHeight(22);
        rect1.setWidth(100);
        rect1.setColor("blue");
        rect1.print();

        boolean isSmaller = rect1.isSmallerThan(20);
        System.out.println(isSmaller);

        if (rect1.isSmallerThan(100_000)) {
            System.out.println("Den är halvliten.");
        }

        rect1.printShort();

        double area = rect1.area();
        System.out.println("arean är: " + area);
    }
}
