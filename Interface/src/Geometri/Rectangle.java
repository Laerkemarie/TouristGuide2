package Geometri;

public class Rectangle implements GeometricShape{
    //attributter
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //implementer calculate perimeter
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    //implementer calculate area
    @Override
    public double calculateArea() {
        return length * width;
    }

}
