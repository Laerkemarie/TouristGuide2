package Class;

public class Cirkel {
    double radius;

    public Cirkel(double radius) {
        this.radius = radius;
    }

    public double beregnArealCirkel() {
        return Math.PI * radius * radius;
    }
}

