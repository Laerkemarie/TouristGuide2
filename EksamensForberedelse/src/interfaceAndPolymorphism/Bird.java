package interfaceAndPolymorphism;

public class Bird implements InterfaceAnimal, Flyable {
    @Override
    public void makeSound() {
        System.out.println("Fulgen siger: pip pip");
    }

    @Override
    public void fly() {
        System.out.println("Fuglen flyver højt på himlen");
    }

    public static void main(String[] args) {

        Bird bird = new Bird();

        InterfaceAnimal interfaceAnimal = bird;
        interfaceAnimal.makeSound();

        Flyable flyable = bird;
        flyable.fly();
    }

}
