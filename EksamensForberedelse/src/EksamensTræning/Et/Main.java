package EksamensTræning.Et;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            persons.add(new Person("User" + i));
        }

        System.out.println("Oprindelig liste af brugere;");
        for (Person person : persons) {
            System.out.println(person);
        }

        persons.get(0).setName("Hans");
        persons.get(1).setName("Allan");

        Collections.sort(persons);

        System.out.println("Brugere efter sortering:");
        for (Person person : persons) {
            System.out.println(person);
        }

        persons.remove(2);

        System.out.println("Brugere opdateret efter fjernelse af tredje bruger:");
        for (Person person : persons) {
            System.out.println(person);
        }

        persons.set(0, new Person("Poul"));

        System.out.println("Brugere efter erstatning af første bruger med PouL:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
