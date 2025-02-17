package EksamensTræning.To;

public class Dog extends Animal {

    public Dog(String name) {
        super(name); // Kald til Animal's constructor
    }

    @Override
    public String makeSound() {
        return "Vov vov";
    }
}


