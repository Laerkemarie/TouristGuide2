package Geometri;

public class Main {
    public static void main(String[] args) {

        //opret cirkel
        Circle circle = new Circle(5);
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        System.out.println("Circle area: " + circle.calculateArea() + "\n");

        //opret rektangel
        Rectangle rectangle = new Rectangle(3, 8);
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea() + "\n");

        //opret trekant
        Triangle triangle = new Triangle(2, 4, 2);
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea());

    }
}
