package collectionsSort;

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

    @Override
    public int compareTo(ComparablePerson other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return  name + ", " + age + " år";
    }

    public static void main(String[] args) {
        ArrayList<ComparablePerson> person = new ArrayList<>();
        person.add(new ComparablePerson("Hanne", 61));
        person.add(new ComparablePerson("Kim", 43));
        person.add(new ComparablePerson("Mads", 21));
        person.add(new ComparablePerson("Lene", 37));

        System.out.println("Før sortering: " + person);
        Collections.sort(person);
        System.out.println("Efter sortering: " + person);
    }
}
