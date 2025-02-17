package Inheritance.Cykel;

public class Unbike extends Cykel {
    public Unbike(String farve, int antalHjul, double nyPris) {
        super(farve, antalHjul, nyPris);
    }

    public String toString() {
        return "Unibike: " +
                "farve = " + getFarve() +
                ", antalHjul = " + getAntalHjul() +
                ", nypris = " + getNyPris();
    }
    }
