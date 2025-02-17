package InvoiceMaster;

import java.util.Date;
import java.util.ArrayList;

public class Faktura {
    private String fakturanummer;
    private Date fakturadato;
    private Date forfaldsdato;
    private Virksomhed fakturaudsteder;
    private Virksomhed fakturamodtager;
    private ArrayList<FakturaLinje> fakturalinjer;

    public Faktura(String fakturanummer, Virksomhed fakturamodtager, Virksomhed fakturaudsteder) {
        this.fakturanummer = fakturanummer;
        this.fakturamodtager = fakturamodtager;
        this.fakturaudsteder = fakturaudsteder;
        this.fakturalinjer = new ArrayList<>();
    }

    public void addFakturalinje(FakturaLinje fakturaLinje) {
        this.fakturalinjer.add(fakturaLinje);
    }

    public double getSubtotal() {
        return fakturalinjer.stream().mapToDouble(FakturaLinje::getBeløb).sum();
    }

    public double getMomsbeløb() {
        return getSubtotal() * 0.25;
    }

    public double getFakturatotal() {
        return getSubtotal() + getMomsbeløb();
    }

    @Override
    public String toString() {
        return "Faktura:\n" +
                "Fakturanummer: " + fakturanummer + "\n" +
                "Fakturadato: " + fakturadato + "\n" +
                "Forfaldsdato: " + forfaldsdato + "\n" +
                "Fakturaudsteder: " + fakturaudsteder + "\n" +
                "Fakturamodtager: " + fakturamodtager + "\n" +
                "Fakturalinjer: \n" + getFakturalinjerAsString() + // Metoden der håndterer linjerne
                "Subtotal: " + getSubtotal() + "\n" +
                "Momsbeløb: " + getMomsbeløb() + "\n" +
                "Fakturatotal: " + getFakturatotal() + "\n";
    }

    private String getFakturalinjerAsString() {
        StringBuilder sb = new StringBuilder();
        for (FakturaLinje linje : fakturalinjer) {
            sb.append(linje.toString()).append("\n");
        }
        return sb.toString();
    }

    public void setFakturadato(Date fakturadato) {
        this.fakturadato = fakturadato;
    }

    public void setForfaldsdato(Date forfaldsdato) {
        this.fakturadato = forfaldsdato;
    }
}
