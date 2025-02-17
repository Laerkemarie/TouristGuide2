package interfaceAndPolymorphism;

public class ShapeMain {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Cirklens areal: " + circle.calculateArea());
        System.out.println("Rektanglets areal: " + rectangle.calculateArea());

        //polymorfisme med en liste

        Shape[] shapes = { circle, rectangle };
        for (Shape shape : shapes) {
            System.out.println("Areal: " + shape.calculateArea());
        }
    }
}
