package superOgSubKlasser;

public class AnimalMain {
    public static void main(String[] args) {

        Animal myAnimal = new Animal("generisk dyr", 10);
        System.out.println(myAnimal);
        myAnimal.makeSound();

        Dog dog = new Dog("Buller", 3);
        System.out.println(dog);
        dog.makeSound();

        Cat cat = new Cat("Kisser", 11);
        System.out.println(cat);
        cat.makeSound();
    }

}
