package miniOpgaver.NummerTre;

import java.util.List;

public class Prices {
    public static Product findMostExpensive (List<Product> products) {
        if (products.isEmpty()) {
            return null;
        }

        Product mostExpensive = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }
}
