package collections;

public class Test {
    private String name;
    private int age;
    private char gender;
    private int height;

    public Test(String name, int age, char gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        return "Barnets navn er " + getName()
        + "\nBarnet er " + getAge() + " år gammel" +
                "\nEr banet m eller k? " + getGender() +
                "\nBarnet er " + getHeight() + " cm høj\n";
    }
}
