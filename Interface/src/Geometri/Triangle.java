package Geometri;

public class Triangle implements GeometricShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //implementer calculate perimeter
    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    //implementer calculate area
    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s * sideB) * (s - sideC));
    }
}
