package klasserOgObjekter;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("Anne", 21);
        Person person2 = new Person("Ib", 31);

        System.out.println(person);
        System.out.println(person2);

        person.setName("Emma");
        System.out.println("Opdateret navn på person 1: " + person.getName());
    }
}
