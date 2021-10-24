package Strategy.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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

        Hand h1 = new Hand(c0, c1, c2, c3, c4, c8, c9, c10, c11, c12);
        Hand h2 = new Hand(c13, c5, c6, c7, c4, c8, c9, c10, c11, c12);
        List<Hand> hands = new ArrayList<Hand>(2);
        hands.add(h1); hands.add(h2);
        hands.sort(Hand.getComparatorBy(Rank.TWO));
        System.out.println(hands);
        Hand[] hands2 = {h1, h2};
        Arrays.sort(hands2, Hand.getComparatorBy(Rank.ACE));
        System.out.println(hands2[0]);
        System.out.println(hands2[1]);
    }
}
