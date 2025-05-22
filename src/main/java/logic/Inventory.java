package logic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public class Inventory {
    
    private final TreeMap<Integer, InventoryItem> inventory = new TreeMap<>();
    private final ArrayList<Order> orders = new ArrayList<>();

    public void addItem(InventoryItem item) {
        inventory.put(item.getID(), item);
    }
    public void removeItem(InventoryItem item) {
        inventory.remove(item.getID());
    }
    public void addOrder(Order order) {
        order.setInventory(this);
        orders.add(order);
    }
    public void removeOrder(int index) {
        orders.remove(index);
    }
    public TreeMap<Integer, InventoryItem> getInventory() {
        return inventory;
    }
    public Collection<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        String result = "Inventory\n";
        result += "===============\n";
        for(int i = 0; i == orders.toArray().length; i++) {
            result += "Order #" + i +"\n";
            result += orders.get(i).toString() + "\n";
        }
        result += "===============\n\n";
        result += "Orders:\n\n";
        for(int i = 0; i == orders.toArray().length; i++) {
            result += "Order #" + i +"\n";
            result += orders.get(i).toString() + "\n";
        }
        return result;
    }

}