package superOgSubKlasser;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " siger: vov vov");
    }
    @Override
    public String toString() {
        return "Hunden hedder " + getName() + " og er " + getAge() + " år gammel";
    }
}
