package Inheritance.MenneskeOgCykelBillet;

public class MainBillet {
    public static void main(String[] args) {
        BilletAutomat2 automat = new BilletAutomat2();

        MenneskeBillet menneskeBillet = new MenneskeBillet();
        CykelBillet cykelBillet = new CykelBillet();

        automat.indbetal(30);
        automat.købBillet(menneskeBillet);

        automat.indbetal(50);
        automat.købBillet(menneskeBillet);

        automat.købBillet(cykelBillet);
    }
}
