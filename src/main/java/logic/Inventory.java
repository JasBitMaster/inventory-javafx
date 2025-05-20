package logic;

import java.util.Collection;
import java.util.TreeMap;

/* 
final class InventorySort implements Comparator<InventoryItem> {

    @Override
    public int compare(InventoryItem o1, InventoryItem o2) {
        return o1.getName().compareTo(o2.getName());
    }
} */

public class Inventory {
    
    private final TreeMap<String, InventoryItem> inventory = new TreeMap<>();
    //private final LinkedList<InventoryItem> inventorySorted = new LinkedList<>();

    public void addItem(InventoryItem item) {
        inventory.put(item.getName(), item);
    }
    public void removeItem(InventoryItem item) {
        inventory.remove(item.getName());
    }
    public Collection<InventoryItem> getInventory() {
        return inventory.values();
    }

    /* 
    public void sortByName() {
        InventorySort sorter = new InventorySort();
        sort(sorter);
    }

    private void sort(Comparator<InventoryItem> comp) {
        inventorySorted.clear();
        inventorySorted.addAll(inventory.values());
        inventorySorted.sort(comp);
    } */

}