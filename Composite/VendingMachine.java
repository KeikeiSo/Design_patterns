package Composite;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Order> aOrders = new ArrayList<Order>();

    public void createOrder(Order pOrder){
        aOrders.add(pOrder);
    }

    public Order getLastOrder(){
        return aOrders.get(aOrders.size() - 1);
    }
}
