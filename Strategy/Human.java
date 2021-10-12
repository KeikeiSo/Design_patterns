package Strategy;

public class Human {
    boolean hungry;
    public boolean solveHunger(Eatable food){
        return food.eat();
    }
}
