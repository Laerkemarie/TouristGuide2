package superOgSubKlasser;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " siger: miav miav");
    }

    @Override
    public String toString() {
        return "Katten hedder " + getName() + " og er " + getAge() + " år gammel";
    }
}
