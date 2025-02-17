package MoccaMaster;

public class Cup {
    private Drink drink;
    private String size;
    private boolean hasWhippedCream;

    public Cup(Drink drink, String size, boolean hasWhippedCream) {
        this.drink = drink;
        this.size = size;
        this.hasWhippedCream = hasWhippedCream;
    }

    public String getDescription() {
        String description = size + " " + drink.getName();
        if(hasWhippedCream) {
            description += " with whipped cream";
        }
        return description;
    }
    @Override
    public String toString() {
        return getDescription();
    }
}
