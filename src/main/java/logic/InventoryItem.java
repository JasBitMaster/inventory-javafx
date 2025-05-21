package logic;

public class InventoryItem implements Comparable<InventoryItem> {

    private final int id;
    private String name;
    private String quality;
    private int stock;
    
    public InventoryItem() {
        this.name = "Error";
        this.quality = "Error";
        this.stock = -1;
        this.id = -1;
    }
    public InventoryItem(String name, String quality, int stock, int id) {
        this.name = name;
        this.quality = quality;
        this.stock = stock;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public String getQuality() {
        return quality;
    }
    public int getStock() {
        return stock;
    }
    public int getID() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    

    public void addStock(int newStock) {
        changeStock(newStock);
    }
    public void removeStock(int soldStock) {
        changeStock(-1 * soldStock);
    }
    private void changeStock(int stockChanged) {
        this.stock += stockChanged;
    }

    @Override
    public int compareTo(InventoryItem o) {
        return this.name.compareTo(o.name);
    }
}
