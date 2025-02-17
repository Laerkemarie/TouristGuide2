package Inheritance.Bankkonto;

public class Konto {
    private String kontoNummer;
    private String ejerNavn;
    private double saldo;

    public Konto(String kontoNummer, String ejerNavn, double saldo) {
        this.kontoNummer = kontoNummer;
        this.ejerNavn = ejerNavn;
        this.saldo = saldo;
    }
    public String getKontoNummer() {
        return kontoNummer;
    }
    public String getEjerNavn() {
        return ejerNavn;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setKontoNummer(String newKontoNummer) {
        this.kontoNummer = newKontoNummer;
    }
    public void setEjerNavn(String newEjerNavn) {
        this.ejerNavn = newEjerNavn;
    }

    public double indsaet(double beloeb) {
        if(beloeb > 0) {
            saldo += beloeb;
        } else {
            System.out.println("Du kan kun indsætte et positivt beløb");
        }
        return saldo;
    }

    public double haev(double beloeb) {
        if(beloeb > saldo) {
            System.out.println("Du kan ikke hæve flere penge end der er på kontoen");
            return -1;
        } else if(beloeb > 0) {
            saldo -= beloeb;
        } else {
            System.out.println("Beløbet skal være positivt");
        }
        return saldo;
    }

    public String toString() {
        return "Konto med kontonummer: " + kontoNummer + " er ejet af: " + ejerNavn + ". Kontoen har " + saldo + " kr stående.";
    }
}
