import java.util.ArrayList;
import java.util.List;

public class Indkøbskurv {
    private List<Ordrelinje> ordrelinjer;

    public Indkøbskurv() {
        this.ordrelinjer = new ArrayList<>();
    }

    public void tilføjVare(Vare vare, int antal) {
        Ordrelinje ordrelinje = new Ordrelinje(vare, antal);
        ordrelinjer.add(ordrelinje);
    }

    public double beregnSamletPris() {
        double samletPris = 0;
        for (Ordrelinje ordrelinje : ordrelinjer) {
            samletPris += ordrelinje.beregnPris();
        }
        return samletPris;
    }

    public String toString() {
        String result = "";
        for (Ordrelinje ordrelinje : ordrelinjer) {
            result += ordrelinje + "\n";
        }
        result += "Samlet pris: " + beregnSamletPris() + " kr";
        return result;
    }
}