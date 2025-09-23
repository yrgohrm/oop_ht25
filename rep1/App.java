public class App {
    public static void main(String[] args) {
        CreditCard card = new CreditCard("123456789", 10_000);

        int count = buyAsManyMollysAsPossible(card);
        System.out.printf("Du kunde köpa %d stycken!%n", count);        
    }

    private static int buyAsManyMollysAsPossible(CreditCard card) {
        int count = 0;
        while (card.buy(2650)) {
            count++;
        }

        return count;
    }
}
