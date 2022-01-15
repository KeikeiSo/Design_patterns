package TemplateMethod;
import Flyweight.Drink;
import java.util.List;
import java.util.ArrayList;


public abstract class AbstractVendingMachine {
    private List<Drink> aDrinks = new ArrayList<Drink>();
    private Drink aSelectedDrink;
    private int aBalance = 0;
    
    protected AbstractVendingMachine(){
        aDrinks = Drink.getAllDrinks();
        aBalance = 0;
    }

    public final boolean sell(Drink pDrink, int amount){
        select(pDrink);
        pay(amount);
        if (isSufficient()) {
            aDrinks.remove(pDrink);
            return true;
        }
        return false;
    }

    public void select(Drink pDrink){
        aSelectedDrink = pDrink;
    }

    public void pay(int amount){
        aBalance = amount;
    }

    public Drink showSelecteDrink(){
        return aSelectedDrink;
    }

    public int showCurrentBalance(){
        return aBalance;
    }

    public boolean isEmpty(){
        return aDrinks.isEmpty();
    }

    public int size(){
        return aDrinks.size();
    }

    protected abstract boolean isSufficient();
}
