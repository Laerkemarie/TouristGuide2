package metoder;

public class PassByObjekter {
    private String name;

    public PassByObjekter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        PassByObjekter person = new PassByObjekter("Alice");
        System.out.println("Navn før metoden: " + person.getName());
        changeName(person);
        System.out.println("Navn efter metoden: " + person.getName());

    }

    //ændrer ikke værdi
//    public static void changeName(PassByObjekter person) {
//        person = new PassByObjekter("Brian");

    //værdi bliver ændret grundet setName
    public static void changeName(PassByObjekter person) {
        person.setName("Brian");
    }
}
