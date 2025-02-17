package InvoiceMaster;

public class Virksomhed {
    private String virksomhedsnavn;
    private String adresse;
    private String telefonnummer;
    private String email;

    public Virksomhed(String virksomhedsnavn, String adresse, String telefonnummer, String email) {
        this.virksomhedsnavn = virksomhedsnavn;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Virksomhed{" +
                "virksomhedsnavn='" + virksomhedsnavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
