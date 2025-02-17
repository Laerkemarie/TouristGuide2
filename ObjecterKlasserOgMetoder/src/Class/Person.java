package Class;

public class Person {
        String firstName;
        String lastName;
        String middleName;
        int age;

        public Person(String firstName, String lastName, String middleName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.age = age;
        }

        public String toString() {
            return firstName + " " + middleName + " " + lastName + " " + age + " år gammel";
        }
    }

