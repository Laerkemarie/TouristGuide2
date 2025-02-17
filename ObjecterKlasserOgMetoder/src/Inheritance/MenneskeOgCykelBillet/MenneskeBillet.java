package Inheritance.MenneskeOgCykelBillet;

public class MenneskeBillet extends Billet {

    public MenneskeBillet() {
        super(50);
    }

    public void printBillet() {
        System.out.println("##### MENNESKEBILLET #####");
        System.out.println(" Pris: " + billetPris + " kr");
        System.out.println("###########################");
    }
}
