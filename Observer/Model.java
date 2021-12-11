package Observer;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int aNumber;
    private List<Observer> aObservers = new ArrayList<>();

    public Model(){
        aNumber = 0;
    }

    public int addOne(){
        aNumber ++;
        for (Observer o : aObservers){
            o.numberChanged(aNumber);
        }
        return aNumber;
    }

    public int minusOne(){
        aNumber --;
        for (Observer o : aObservers){
            o.numberChanged(aNumber);
        }
        return aNumber;
    }

    public void setNum(int num){
        aNumber = num;
        for (Observer o : aObservers){
            o.numberChanged(aNumber);
        }
    }

    public void addObserver(Observer pObserver){
        aObservers.add(pObserver);
    }

    public void removeObserver(Observer pObserver){
        aObservers.remove(pObserver);
    }
}