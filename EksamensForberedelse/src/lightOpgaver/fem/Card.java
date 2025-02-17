package lightOpgaver.fem;

import java.util.List;

public class Card {
    private String suit;
    private int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean beats(Card other) {
        if (this.value > other.value) {
            return true;
        } else if (this.value == other.value) {
            return suitBeats(other.suit);
        } else {
            return false;
        }
    }

    public boolean suitBeats(String otherSuit) {
        List<String> suitOrder = List.of("hearts", "diamonds", "clubs", "spades");
        return suitOrder.indexOf(this.suit) < suitOrder.indexOf(otherSuit);
    }
}
