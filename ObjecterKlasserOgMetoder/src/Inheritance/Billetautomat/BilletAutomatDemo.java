package Inheritance.Billetautomat;

public class BilletAutomatDemo {
    public static void main(String[] args) {
        BilletAutomat automat = new BilletAutomat(50);

        System.out.println("Billetprisen er " + automat.getPris() + " kr");
        System.out.println("Din saldo er " + automat.getSaldo() + " kr");
        System.out.println();

        automat.indbetal(30);
        automat.printBillet();
        System.out.println();

        automat.indbetal(0);
        automat.printBillet();
        System.out.println();

        automat.indbetal(55);
        automat.printBillet();
        System.out.println();

        automat.indbetal(80);
        automat.printBillet();
        System.out.println();

        automat.printBillet();
        System.out.println();

        System.out.println("Din saldo er nu: " + automat.getSaldo() + " kr");
    }
}
