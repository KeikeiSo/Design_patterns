package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeOrder implements Order{
    private List<Order> aOrders = new ArrayList<Order>();
    @Override
    public int getPrice() {
        int total = 0;
        for (Order order : aOrders){
            total += order.getPrice();
        }
        return total;
    }
}
