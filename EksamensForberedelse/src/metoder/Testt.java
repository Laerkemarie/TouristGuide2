package metoder;

public class Testt {
        public static void main(String[] args) {
            Person person = new Person("Alice");
            changeReference(person); // Sender en kopi af referencen
            System.out.println("Efter metoden: " + person.getName()); // Udskriver: Alice
        }

//        public static void changeReference(Person person) {
//            person = new Person("Charlie"); // Ændrer kun den lokale reference
//        }

        public static void changeReference(Person person) {
            person.setName("Charlie");
        }
    }

