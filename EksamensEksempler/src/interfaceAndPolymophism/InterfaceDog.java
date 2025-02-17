package interfaceAndPolymophism;

public class InterfaceDog implements InterfaceAnimal {
    @Override
    public void makeSound() {
        System.out.println("Vov vov");
    }
}
