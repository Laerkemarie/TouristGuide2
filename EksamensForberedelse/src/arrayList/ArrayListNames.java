package arrayList;

import java.util.ArrayList;

public class ArrayListNames {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Brian");
        names.add("Carl");
        names.add("Simone");

        System.out.println("Navne i listen: " + names);

        names.remove("Brian");
        System.out.println("Efter fjernelse af navn: " + names);

        names.add("Liv");
        System.out.println("Navne efter tilføjelse af navn: " + names);

        System.out.println("Antal elementer i listen: " + names.size());
    }
}
