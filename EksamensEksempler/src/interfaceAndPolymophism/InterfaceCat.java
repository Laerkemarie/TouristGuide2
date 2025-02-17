package interfaceAndPolymophism;

public class InterfaceCat implements InterfaceAnimal{
    private String name;
    private int age;

    public InterfaceCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Katten hedder " + name + " og er " + age + " år gammel og den siger: ";
    }

    @Override
    public void makeSound() {
        System.out.println("Miav miav");
    }

    public static void main(String[] args) {
        InterfaceCat cat = new InterfaceCat("Kisser", 10);
        InterfaceCat cat2 = new InterfaceCat("Mille", 8);
        InterfaceCat cat3 = new InterfaceCat("Henning", 11);

        System.out.print(cat); cat.makeSound();
        System.out.print(cat2); cat2.makeSound();
        System.out.print(cat3); cat3.makeSound();
    }
}
