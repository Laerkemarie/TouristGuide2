package Inheritance.Billetautomat;

public class BilletAutomat {
    private int pris;
    private int saldo;
    private int total;

    public BilletAutomat(int billetpris){
        this.pris = billetpris;
        this.saldo = 0;
        this.total = 0;
    }

    public int getPris() {
        return pris;
    }
    public int getSaldo() {
        return saldo;
    }

    public void indbetal(int kroner) {
        if (kroner > 0) {
            saldo += kroner;
            System.out.println("Du har indsat " + kroner + " kr. Din nye saldo er: " + saldo + " kr");
        } else {
            System.out.println("Du skal indsætte et plusbeløb før du kan købe en billet");
        }
    }

    public void printBillet() {
        if (saldo >= pris) {
            System.out.println("##### BILLET #####");
            System.out.println("# Pris: " + pris + " kr #");
            System.out.println("###################");
            System.out.println();

            saldo -= pris;
            total += pris;
            System.out.println("Din resterende saldo er: " + saldo + " kr");
        } else {
            int manglendeBeløb = pris - saldo;
            System.out.println("Du har ikke nok penge til at købe en billet");
            System.out.println("Du mangler " + manglendeBeløb + " kr");
        }
    }
}
