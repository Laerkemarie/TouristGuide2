package superOgSubKlasser;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Random dyr", 10);
        System.out.println(animal);
        animal.makeSound();
        System.out.println();

        Dog dog = new Dog("Buller", 4);
        System.out.println(dog);
        dog.makeSound();
        System.out.println();

        Animal myAnimal = new Dog("King", 10);
        System.out.println(myAnimal);
        myAnimal.makeSound();
        System.out.println();

        Cat cat = new Cat("Kitty", 12);
        System.out.println(cat);
        cat.makeSound();
    }
}
