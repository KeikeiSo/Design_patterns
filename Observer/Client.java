package Observer;

public class Client {
    public static void main(String[] args) {
        Model m = new Model();
        m.addObserver(new Observer() {
            @Override
            public void numberChanged(int num) {
                System.out.println(num);
            }
        });
        m.addOne();
        m.setNum(10);
        m.minusOne();
    }
}
