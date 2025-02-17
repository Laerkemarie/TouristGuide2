package arrayList;

import java.util.ArrayList;

public class ArrayListPerson {
    public static void main(String[] args) {

        ArrayList<String> person = new ArrayList<>();

        person.add("Sif");
        person.add("Stefan");
        person.add("Kris");

        System.out.println("Navne i listen: " + person);

        System.out.println("Antal personer i rækken: " + person.size());

        person.remove("Stefan");
        System.out.println("Navne i listen efter fjernelse: " + person);

        person.add("Mie");
        person.add("Hanne");
        System.out.println("Navne i listen efter tilføjelse af nye personer: " + person);
    }
}
