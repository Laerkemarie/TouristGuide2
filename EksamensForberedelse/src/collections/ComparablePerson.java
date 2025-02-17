package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablePerson implements Comparable<ComparablePerson> {
    private String name;
    private int age;

    public ComparablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void personDescription() {
        System.out.println("Personen hedder " + name + " og er " + age + " år gammel");
    }

    @Override
    public int compareTo(ComparablePerson other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {

        ArrayList<ComparablePerson> person = new ArrayList<>();

        person.add(new ComparablePerson("Hannah", 22));
        person.add(new ComparablePerson("Tom", 19));
        person.add(new ComparablePerson("Mia", 23));
        person.add(new ComparablePerson("Kim", 27));

        System.out.println("Før sortering: " + person);
        Collections.sort(person);
        System.out.println("Efter sortering: " + person);
    }
}
