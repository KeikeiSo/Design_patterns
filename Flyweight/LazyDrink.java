package Flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LazyDrink {
    private Temperature aTemp;
    private Taste aTaste;
    private static final Map<Temperature, Map<Taste, LazyDrink>> aDrinks = new HashMap<Temperature, Map<Taste, LazyDrink>>();

    private LazyDrink(){}

    private LazyDrink(Temperature pTemp, Taste pTaste){
        assert pTemp != null && pTaste != null;
        aTemp = pTemp;
        aTaste = pTaste;
    }

    public static LazyDrink get(Temperature pTemp, Taste pTaste){
        if (!aDrinks.containsKey(pTemp)){
            aDrinks.put(pTemp, new HashMap<Taste, LazyDrink>());
        }
        if (!aDrinks.get(pTemp).containsKey(pTaste)){
            aDrinks.get(pTemp).put(pTaste, new LazyDrink(pTemp, pTaste));
        }
        return aDrinks.get(pTemp).get(pTaste);
    }

    public Taste getTaste() {
        return aTaste;
    }

    public Temperature getTemp() {
        return aTemp;
    }

    public static List<LazyDrink> getAllDrinks(){
        List<LazyDrink> result = new ArrayList<LazyDrink>();
        for (Map<Taste, LazyDrink> map : aDrinks.values()){
            result.addAll(map.values());
        }
        return result;
    }
}
