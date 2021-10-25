package Command;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Drink> aDrinks = new ArrayList<Drink>();
    private Drink aSelectedDrink = Drink.NULL;
    private int aBalance = 0;
    private CommandProcessor aProcessor = new CommandProcessor();
    
    public void selectDrink(String pNameOfDrink){
        aProcessor.executeCommand(this.createSelectCommand(pNameOfDrink));
    }

    public void insertCoins(int pAmount){
        aProcessor.executeCommand(this.createInsertCommand(pAmount));
    }

    public void undo(){
        aProcessor.undoLastCommand();
    }

    public void redo(){
        aProcessor.redoCommand();
    }

    public int getBalance(){
        return aBalance;
    }

    private Command createSelectCommand(String pNameOfDrink){
        return new Command(){
            @Override
            public boolean execute() {
                for (Drink drink : aDrinks){
                    if (drink.getName() == pNameOfDrink) {
                        aSelectedDrink = aDrinks.remove(aDrinks.indexOf(drink));
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void undo() {
                aDrinks.add(aSelectedDrink);
                aSelectedDrink = Drink.NULL;
            }  
        };
    }

    private Command createInsertCommand(int pAmount){
        return new Command(){
            @Override
            public boolean execute() {
                if (pAmount < 0) return false;
                aBalance += pAmount;
                return true;
            }

            @Override
            public void undo() {
                aBalance -= pAmount;
            }
        };
    }
}
