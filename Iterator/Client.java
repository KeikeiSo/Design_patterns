package Iterator;

import Strategy.Comparator.Card;
import Strategy.Comparator.Rank;
import Strategy.Comparator.Suit;

public class Client {
    public static void main(String[] args) {
        Card c0 = new Card(Rank.ACE, Suit.CLUBS);
        Card c1 = new Card(Rank.ACE, Suit.DIAMONDS);
        Card c2 = new Card(Rank.ACE, Suit.HEARTS);
        Card c3 = new Card(Rank.ACE, Suit.SPADES);
        Card c4 = new Card(Rank.TWO, Suit.CLUBS);
        Card c5 = new Card(Rank.TWO, Suit.DIAMONDS);
        Card c6 = new Card(Rank.TWO, Suit.HEARTS);
        Card c7 = new Card(Rank.TWO, Suit.SPADES);
        Card c8 = new Card(Rank.THREE, Suit.CLUBS);
        Card c9 = new Card(Rank.FOUR, Suit.CLUBS);
        Card c10 = new Card(Rank.FIVE, Suit.CLUBS);
        Card c11 = new Card(Rank.SIX, Suit.CLUBS);
        Card c12 = new Card(Rank.SEVEN, Suit.CLUBS);
        Card c13 = new Card(Rank.EIGHT, Suit.CLUBS);
        ConcreteIterable cards = new ConcreteIterable(c0, c1, c2, c3, c4, c8, c9, c10, c11, c12, c13, c5, c6, c7);
        AbstractIterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
