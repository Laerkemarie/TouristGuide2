package sortingPeople;

import java.util.Arrays;

public class SortPeople {
    public static void main(String[] args) {
        Person[] people = {
                // Tilføj flere personer, som deler nogle af de samme egenskaber f.eks. samme fornavn, men hvor deres andre egenskaber er unikke.
                new Person("Hans", "Filipson", 30, 1.70),
                new Person("Merete", "Poulsen", 12, 1.22),
                new Person("Ibsen", "Poulsen", 55, 1.20),
                new Person("Sixten", "Ottesen", 15, 1.90),
                new Person("Sixten", "Jensen", 16, 1.10),
                new Person("Iben", "Ottesen", 11, 1.30),
                new Person("Hanne", "Olesen", 15, 1.90)
        };

        System.out.println("Usorteret liste af personer:");
        for (Person person : people) {
            System.out.println(person);
        }

        // skriv kode herunder
//        Arrays.sort(people, Comparator.comparing(Person::getAge));
//
//        System.out.println("\nSortering efter alder:");
//        for (Person person : people) {
//            System.out.println(person);
//        }

        Arrays.sort(people);

        System.out.println("\nSortering efter alder:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, new LastNameThenFirstNameComparator());

        System.out.println("\nSortering efter efternavn:");
        for (Person person : people) {
            System.out.println(person);
        }

    }


}
