package Strategy.Functional_style;

import Strategy.Comparator.Hand;
import Strategy.Comparator.Rank;

public interface ComparingStrategy {
    
    /**
    * Compare the two hand
    * @param h1 Hand 1
    * @param h2 Hand 2
    * @pre h1 != null && h2 != null
    * @post int if it == 0, h1 == h2, if it > 0, h1 > h2
    */
    int compare(Hand h1, Hand h2);

    public static int compareBySize(Hand h1, Hand h2){
        return h1.size() - h2.size();
    }

    public static int compareByNumAce(Hand h1, Hand h2){
        return h1.getNumRank(Rank.ACE) - h2.getNumRank(Rank.ACE);
    }

}
