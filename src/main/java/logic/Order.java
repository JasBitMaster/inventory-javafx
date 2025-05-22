package logic;

import java.util.ArrayList;

public class Order {

    private final ArrayList<OrderLineItem> items = new ArrayList<>();
    private Inventory inventory;

    public ArrayList<OrderLineItem> getOrderItems() {
        return items;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public void addOrderItem(OrderLineItem o) {
        o.setInventory(inventory);
        items.add(o);
    }
    public void removeOrderItem(int index) {
        items.remove(index);
    }

    @Override
    public String toString() {
        String result = "===============\n";
        for(int i = 0; i == items.toArray().length; i++) {
            result += items.get(i).toString() + "\n";
        }
        result += "===============\n";
        return result;
    }
}