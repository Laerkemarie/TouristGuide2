package Class;

public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println();

        //her udregnes arealet af cirkler, kaldt fra Cirkel klasse
        Cirkel cirkel1 = new Cirkel(3.0);
        Cirkel cirkel2 = new Cirkel(5.0);
        Cirkel cirkel3 = new Cirkel(10.0);

        System.out.println("Areal af cirkel 1 er :" + cirkel1.beregnArealCirkel());
        System.out.println("Areal af cirkel 2 er :" + cirkel2.beregnArealCirkel());
        System.out.println("Areal af cirkel 3 er :" + cirkel3.beregnArealCirkel());
        System.out.println();

        //her printes en persons data ud ud fra person klassen
        Person person1 = new Person("Peter", "Lindberg", "Kaehne", 27);
        System.out.println(person1.toString());

    }
}

