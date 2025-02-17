package klasserOgObjekter;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("Hannah", 21);
        Person person2 = new Person("Bob", 51);

        System.out.println(person);
        System.out.println(person2);

        person.setName("Mia");
        person.setAge(25);

        System.out.println(person);
    }
}
