package metoder;

public class ParameteroverførselString {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        modifyObject(person); // Sender en kopi af referencen
        System.out.println("Efter metoden: " + person.getName()); // Udskriver: Bob
    }

    public static void modifyObject(Person person) {
        person.setName("Bob"); // Ændrer objektets indhold
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
