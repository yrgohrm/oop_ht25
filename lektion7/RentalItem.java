public class RentalItem {
    private static double basePrice = 40;
    private double itemPrice;

    public RentalItem(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double pricePerDay() {
        return basePrice + itemPrice;
    }

    public static void setBasePrice(double basePrice) {
        RentalItem.basePrice = basePrice;
    }

    public static double getBasePrice() {
        return basePrice;
    }
}
