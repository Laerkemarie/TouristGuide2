package miniOpgaver.NummerTre;

public class Product {
    private String name;
    private int price;
    private int stockQuantity;

    public Product(String name, int price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity() {
        this.stockQuantity = stockQuantity;
    }

    public int reduceStockQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Lagerbeholdningen kan ikke være under 0!");
        }
        this.stockQuantity = Math.max(this.stockQuantity - quantity, 0);
        return this.stockQuantity;
    }
}
