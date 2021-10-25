package Command;

public interface Drink {
    public static final Drink NULL = new Drink(){
        @Override
        public String getName(){
            return "Not a Drink";
        }
        @Override
        public int getPrice(){
            return 0;
        }
    };
    public String getName();
    public int getPrice();
}
