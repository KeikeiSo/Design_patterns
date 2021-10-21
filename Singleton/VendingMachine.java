package Singleton;

import Flyweight.Drink;
import java.util.List;
import java.util.ArrayList;

public class VendingMachine {
    private static final VendingMachine INSTANCE = new VendingMachine();
    private final List<Drink> aDrinks = new ArrayList<Drink>();
    
    private VendingMachine(){
        aDrinks.addAll(Drink.getAllDrinks());
    }
    public static VendingMachine instance(){
        return INSTANCE;
    }
}
