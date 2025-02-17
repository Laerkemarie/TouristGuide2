package superOgSubKlasser;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
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

    public void makeSound() {
        System.out.println(name + " siger en lyd");
    }

    public String toString() {
        return "Dyret hedder " + name + " og er " + age + " år gammel";
    }
}
