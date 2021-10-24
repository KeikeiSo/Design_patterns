package Strategy.Comparator;

public class Card {
    private Rank aRank;
    private Suit aSuit;

    public Card(Rank pRank, Suit pSuit){
        aRank = pRank;
        aSuit = pSuit;
    }

    public Rank getRank(){
        return aRank;
    }

    public Suit getSuit(){
        return aSuit;
    }

    @Override
    public String toString(){
        return aRank.toString() + "Of" + aSuit.toString();
    }
}
