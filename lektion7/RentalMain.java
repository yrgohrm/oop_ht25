public class RentalMain {
    public static void main(String[] args) {
        // RentalItem hammer = new RentalItem(10);
        // RentalItem drill = new RentalItem(20);

        RentalItem.setBasePrice(20);

        // System.out.println(hammer.pricePerDay());
        // System.out.println(drill.pricePerDay());

        System.out.println("base price: " + RentalItem.getBasePrice());
    }
}
