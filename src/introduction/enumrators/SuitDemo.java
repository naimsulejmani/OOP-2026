package introduction.enumrators;

public class SuitDemo {
    static void main() {

        drawCardOnSuit(Suit.CLUBS);
        drawCardOnSuit(Suit.DIAMONDS);
        drawCardOnSuit(Suit.HEARTS);
        drawCardOnSuit(Suit.SPADES);

        Suit suit = Suit.CLUBS;
        Suit suit1 = Suit.valueOf("HEARTS");


        drawCardOnSuit(1);
    }

    static int drawCardOnSuit(int suit) {
        return 1;
    }

    static int drawCardOnSuit(Suit suit) {
        return 10;
    }
}
