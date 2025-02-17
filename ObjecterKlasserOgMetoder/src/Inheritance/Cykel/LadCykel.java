package Inheritance.Cykel;

public class LadCykel extends Cykel {
    private int antalPassagerer;
    private Cyklist cyklist;

    public LadCykel(String farve, int antalHjul, double nyPris, int antalPassagerer) {
        super(farve, antalHjul,nyPris);
        this.antalPassagerer = antalPassagerer;
        this.cyklist = null;
    }

    public double newPrice() {
        return getNyPris();
    }

    public boolean enCyklistSaetterSig(Cyklist c) {
        if (cyklist == null) {
            cyklist = c;
            return true;
        }
        return false;
    }

    public Cyklist hvemKoererLadcyklen() {
        return cyklist;
    }
    public Cyklist cyklistenStigerUd() {
        Cyklist temp = cyklist;
        cyklist = null;
        return temp;
    }

    public String toString() {
        return "LadCykel: " +
                "farve = " + getFarve() +
                ", antalHjul = " + getAntalHjul() +
                ", nypris = " + newPrice() +
                ", antalPassagerer = " + antalPassagerer +
                ", cyklist = " + (cyklist != null ? cyklist.getNavn() : "Ingen");
    }
    }
