/**
 * This class represents a simple credit card bla bla bla....
 * 
 * This is for use in games, not for real purchases.
 */
public class CreditCard {
    private String cardNumber;
    private double balance;
    private int limit;

    /**
     * Create a new credit card with 0 balance.
     * 
     * @param cardNumber the credit cards number
     * @param limit the maximum limit on the balance
     */
    public CreditCard(String cardNumber, int limit) {
        this.balance = 0;
        this.cardNumber = cardNumber;
        this.limit = limit;
    }

    /**
     * nfdjbhdfbjhsdfhsdfh
     * 
     * The price must not be below zero.
     * 
     * @param price the price that will be paid
     * @return true if the buy goes through, false otherwise
     * 
     */
    public boolean buy(double price) {
        if (price < 0) {
            return false;
        }

        if (balance + price > limit) {
            return false;
        }

        balance += price; // balance = balance + price;
        return true;
    }

    public boolean payBack(double amount) {
        if (amount < 0) {
            return false;
        }

        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "CreditCard [cardNumber=" + cardNumber + ", balance=" + balance + ", limit=" + limit + "]";
    }
}
