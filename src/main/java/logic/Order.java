package logic;

import java.util.ArrayList;

public class Order {

    private final ArrayList<OrderLineItem> items = new ArrayList<>();

    public ArrayList<OrderLineItem> getOrderItems() {
        return items;
    }
    public void addOrderItem(OrderLineItem o) {
        items.add(o);
    }
    public void removeOrderItem(int index) {
        items.remove(index);
    }
}