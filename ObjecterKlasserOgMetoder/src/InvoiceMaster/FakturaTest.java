package InvoiceMaster;

import java.util.Date;

public class FakturaTest {
    public static void main(String[] args) {
        // Opret fakturaudsteder og modtager
        Virksomhed udsteder = new Virksomhed("Udsteder A/S", "Hovedgade 1", "12345678", "udsteder@example.com");
        Virksomhed modtager = new Virksomhed("Modtager ApS", "Bakkevej 2", "87654321", "modtager@example.com");

        // Opret faktura
        Faktura faktura = new Faktura("F12345", udsteder, modtager);
        faktura.setFakturadato(new Date());
        faktura.setForfaldsdato(new Date(System.currentTimeMillis() + (7L * 24 * 60 * 60 * 1000))); // 7 dage senere

        // Tilføj fakturalinjer
        faktura.addFakturalinje(new FakturaLinje("Produkt A", 10, "stk", 25.0));
        faktura.addFakturalinje(new FakturaLinje("Service B", 5, "timer", 100.0));

        // Udskriv faktura
        System.out.println(faktura);
    }
}
