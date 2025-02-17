package MoccaMaster;

public class CoffeeMachine {
    public Cup serve(String drinkType, String size, boolean hasWhippedCream) {
        Drink drink;

        switch (drinkType.toLowerCase()) {
            case "sort kaffe":
                drink = new SortKaffe();
                break;
            case "espresso":
                drink = new Espresso();
                break;
            case "dobble espresso":
                drink = new DobbeltEspresso();
                break;
            case "tripple espresso":
                drink = new TrippleEspresso();
                break;
            case "kakaomælk":
                drink = new KakaoMaelk();
                break;
            case "chokoladedrik":
                drink = new Chokoladedrik();
                break;
            default:
                throw new IllegalArgumentException("Ukendt type af drik: " + drinkType);
        }

        if (size == null) size = "Medium";
        return new Cup(drink, size, hasWhippedCream);
    }
}

