package Geometri;

public class Circle implements GeometricShape{

    // attributter
   private double radius;

   public Circle(double radius) {
       this.radius = radius;
    }

    //implementer calculate perimeter
    @Override
    public double calculatePerimeter() {
       return 2 *  PI * radius;
    }

    //implementer calculate area
    @Override
    public double calculateArea() {
       return PI * radius * radius;
    }

}
