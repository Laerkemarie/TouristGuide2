package Tamagotchii;

public class Cat extends Tamagotchii {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " siger: Miav!");
    }
}

