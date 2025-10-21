public class Card {
    private Suit suit;
    private int value;

    private void foo() {
        switch (suit) {
            case CLUBS: 
                System.out.println("klöver");
                break;
            case SPADES:
                System.out.println("spader");
                break;
            case HEARTS:
                System.out.println("hjärter");
                break;
        }
    }
}
