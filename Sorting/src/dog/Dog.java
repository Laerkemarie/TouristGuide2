package dog;

public class Dog {
        int age;
        String name;

        public Dog(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return this.age * 7;
        }


        public String getName() {
            return name;
        }

    }
