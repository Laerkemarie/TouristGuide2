package miniOpgaver.NummerTre;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 12000, 10));
        products.add(new Product("Smartphone", 8000, 15));
        products.add(new Product("Tablet", 6000, 25));
        products.add(new Product("Watch", 5000, 19));

        Product laptop = products.get(0);
        laptop.reduceStockQuantity(3);
        System.out.println("Ny lagerbeholdning for " + laptop.getName() + ": " + laptop.getStockQuantity());

        Product mostExpensive = Prices.findMostExpensive(products);
        if (mostExpensive != null) {
            System.out.println("Det dyreste produkt er: " + mostExpensive.getName() +
                    " med en pris på: " + mostExpensive.getPrice() + " kr.");
        }

    }
}
