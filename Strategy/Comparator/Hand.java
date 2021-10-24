package Strategy.Comparator;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Hand {
    private List<Card> aCards = new ArrayList<Card>();

    public Hand(Card... pCards){
        if (pCards.length == 10){
            aCards.addAll(Arrays.asList(pCards));
        }
    }

    public static Comparator<Hand> getComparatorBy(Rank rank){
        return new Comparator<Hand> () {
            @Override
            public int compare(Hand o1, Hand o2) {
                int counto1 = 0;
                for (Card card : o1.aCards){
                    if (card.getRank() == rank) counto1++;
                }
                int counto2 = 0;
                for (Card card : o2.aCards){
                    if (card.getRank() == rank) counto2++;
                }
                return counto1 - counto2;
            }
        };
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        for (Card card : aCards){
            result.append(card.toString());
            result.append("; ");
        }
        result.append("] ");
        return result.toString();
    }
}
