package logic;

public class OrderLineItem implements Comparable<OrderLineItem> {

    private final int id;
    private Inventory inventory;
    private int itemID;
    private int quantity;
    
    public OrderLineItem() {
        this.id = -1;
        this.itemID = -1;
        this.quantity = -1;
    }
    public OrderLineItem(int id, int itemID, int quantity) {
        this.id = id;
        this.itemID = itemID;
        this.quantity = quantity;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public int getItemID() {
        return itemID;
    }
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        String result = inventory.getInventory().get(id).getName();
        result += ", " + inventory.getInventory().get(id).getQuality() + " Grade";
        result += "X" + quantity;
        return result;
    }
    @Override
    public int compareTo(OrderLineItem o) {
        return Integer.compare(id, o.id);
    }
}
