package Inheritance.MenneskeOgCykelBillet;

public abstract class Billet {
    protected int billetPris;

    public Billet (int pris) {
        this.billetPris = pris;
    }

    public int getBilletPris() {
        return billetPris;
    }
    public abstract void printBillet();
}
