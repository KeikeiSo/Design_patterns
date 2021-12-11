package Iterator;

import Strategy.Comparator.Card;

public class ConcreteIterable implements AbstractIterable<Card> {
    private Card[] aCards;
    private int pointer = 0;

    public ConcreteIterable(Card...pCards){
        aCards = pCards;
    }

    @Override
    public AbstractIterator<Card> iterator() {
        return new AbstractIterator<Card>() {

            @Override
            public boolean hasNext() {
                return pointer < aCards.length;
            }

            @Override
            public Card next() {
                Card c;
                if (hasNext()) {
                    c = aCards[pointer];
                    pointer ++;
                } else {
                    pointer = 0;
                    c = aCards[pointer];
                    pointer ++;
                }
                return c;
            }
            
        };
    }
}
