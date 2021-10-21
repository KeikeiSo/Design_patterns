package Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Drink {
    private Temperature aTemp;
    private Taste aTaste;
    private static final Map<Temperature, Map<Taste, Drink>> aDrinks = new HashMap<Temperature, Map<Taste, Drink>>();

    static {
        for (Temperature temperature : Temperature.values()){
            Map<Taste, Drink> curr = new HashMap<Taste, Drink>();
            for (Taste taste : Taste.values()){
                curr.put(taste, new Drink(temperature, taste));
            }
            aDrinks.put(temperature, curr);
        }
    }

    private Drink(){}

    private Drink(Temperature pTemp, Taste pTaste){
        assert pTemp != null && pTaste != null;
        aTemp = pTemp;
        aTaste = pTaste;
    }

    public static Drink get(Temperature pTemp, Taste pTaste){
        return aDrinks.get(pTemp).get(pTaste);
    }

    public Taste getTaste() {
        return aTaste;
    }

    public Temperature getTemp() {
        return aTemp;
    }

    public static List<Drink> getAllDrinks(){
        List<Drink> result = new ArrayList<Drink>();
        for (Map<Taste, Drink> map : aDrinks.values()){
            result.addAll(map.values());
        }
        return result;
    }
}
