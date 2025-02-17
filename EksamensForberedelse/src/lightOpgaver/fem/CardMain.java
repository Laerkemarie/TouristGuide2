package lightOpgaver.fem;

public class CardMain {
    public static void main(String[] args) {

        Card card = new Card("hearts", 10);
        Card card2 = new Card("spades", 10);
        Card card3 = new Card("diamond", 9);
        Card card4 = new Card("hearts", 4);

        System.out.println("Card 1 beats Card 2: " + card.beats(card2));
        System.out.println("Card 2 beats Card 3: " + card2.beats(card3));
        System.out.println("Card 4 beats Card 2: " + card4.beats(card2));
        System.out.println("Card 3 beats Card 4: " + card3.beats(card4));
    }
}
