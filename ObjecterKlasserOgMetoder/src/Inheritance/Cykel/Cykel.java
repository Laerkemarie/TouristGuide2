package Inheritance.Cykel;

public class Cykel {
    private String farve;
    private int antalHjul;
    private double nyPris;
    private double koerteKilometer;

    public Cykel(String farve, int antalHjul, double nyPris) {
        this.farve = farve;
        this.antalHjul = antalHjul;
        this.nyPris = nyPris;
        this.koerteKilometer = 0;
    }

    public String getFarve() {
        return farve;
    }
    public int getAntalHjul() {
        return antalHjul;
    }
    public double getNyPris() {
        return nyPris;
    }
    public double getKoerteKilometer() {
        return koerteKilometer;
    }
    public void setKoerteKilometer(double kilometer) {
        this.koerteKilometer = kilometer;
    }
    public String toString() {
        return "Cykel{" +
                "farve=' " + farve + '\'' +
                " , antal hjul=" + antalHjul +
                ", nypris=" + nyPris +
                ", kørte kilometer=" + koerteKilometer +
                '}';
    }
}
