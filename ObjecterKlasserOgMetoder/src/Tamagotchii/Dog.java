package Tamagotchii;

public class Dog extends Tamagotchii {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " siger: Vov vov!");
    }
}
