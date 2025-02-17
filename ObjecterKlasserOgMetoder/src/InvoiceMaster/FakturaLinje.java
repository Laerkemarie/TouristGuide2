package InvoiceMaster;

public class FakturaLinje {
    private String beskrivelse;
    private int antal;
    private String enhed;
    private double pris;

    public FakturaLinje(String beskrivelse, int antal, String enhed, double pris) {
        this.beskrivelse = beskrivelse;
        this.antal = antal;
        this.enhed = enhed;
        this.pris = pris;
    }

    public double getBeløb() {
        return antal * pris;
    }

    @Override
    public String toString() {
        return "Fakturalinje{" +
                "beskrivelse='" + beskrivelse + '\'' +
                ", antal=" + antal +
                ", enhed='" + enhed + '\'' +
                ", pris=" + pris +
                ", beløb=" + getBeløb() +
                '}';
    }
}
