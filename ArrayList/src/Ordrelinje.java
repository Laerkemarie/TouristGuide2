public class Ordrelinje {

    // klasse som repræsenterer en kundes ønske om at købe en vare i et bestemt antal

    private Vare vare;
    private int antal;

    public Ordrelinje(Vare vare, int antal) {
        this.vare = vare;
        this.antal = antal;
    }

    public double beregnPris() {
        return vare.getPris() * antal;
    }

    public Vare getVare() {
        return vare;
    }

    public int getAntal() {
        return antal;
    }

    public String toString() {
        return antal + " x " + vare.getNavn() + " - " + beregnPris() + " kr";
    }
}
