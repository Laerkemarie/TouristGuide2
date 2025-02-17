public class Vare {

// klasse som repræsenterer den ting man vil købe

    private String navn;
    private double pris;

    public Vare (String navn, double pris) {
        this.navn = navn;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public double getPris() {
        return pris;
    }

    public String toString() {
        return navn + " - " + pris + " kr";
    }
}
