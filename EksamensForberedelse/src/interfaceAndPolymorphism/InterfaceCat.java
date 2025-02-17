package interfaceAndPolymorphism;

public class InterfaceCat implements InterfaceAnimal {
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
    public void makeSound(){
        System.out.println("Miav miav");
    }

    public static void main(String[] args) {
        InterfaceCat cat = new InterfaceCat("Mille", 12);
        InterfaceCat cat2 = new InterfaceCat("Anton", 7);
        InterfaceCat cat3 = new InterfaceCat("Sif", 2);

        System.out.print(cat); cat.makeSound();
        System.out.print(cat2); cat2.makeSound();
        System.out.print(cat3); cat3.makeSound();

    }
}
