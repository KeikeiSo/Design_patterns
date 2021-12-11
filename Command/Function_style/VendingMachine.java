package Command.Function_style;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Drink> aDrinks = new ArrayList<Drink>();
    private Drink aSelectedDrink = Drink.NULL;
    private int aBalance = 0;
    
    public void selectDrink(String pNameOfDrink){
       Command c = new Command(() -> this.select(pNameOfDrink));
       c.execute();
    }

    public void insertCoins(int pAmount){
       Command c = new Command(() -> this.insert(pAmount));
       c.execute();
    }

    public int getBalance(){
        return aBalance;
    }

    private void select(String pNameOfDrink){
        aSelectedDrink = aDrinks.stream()
        .filter(drink -> drink.getName() == pNameOfDrink)
        .findAny().get();
    }

    private void insert(int amount){
        aBalance += amount;
        if (aBalance >= aSelectedDrink.getPrice()) {
            aBalance -= aSelectedDrink.getPrice();
            aSelectedDrink = Drink.NULL;
        }
    }

}   
