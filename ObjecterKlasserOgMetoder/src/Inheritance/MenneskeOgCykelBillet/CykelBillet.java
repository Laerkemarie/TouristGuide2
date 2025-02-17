package Inheritance.MenneskeOgCykelBillet;

public class CykelBillet extends Billet {

    public CykelBillet() {
        super(25);
    }

    @Override
    public void printBillet() {
        System.out.println("##### CYKELBIILET #####");
        System.out.println(" Pris: " + billetPris + " kr");
        System.out.println("###########################");
    }
}

