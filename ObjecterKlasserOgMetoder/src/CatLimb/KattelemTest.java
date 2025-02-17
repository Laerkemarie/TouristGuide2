package CatLimb;

public class KattelemTest {
    public static void main(String[] args) {
        // Opret kattelem og katte
        Kattelem kattelem = new Kattelem();
        Kat c1 = new Kat("c1");
        Kat c2 = new Kat("c2");
        Kat c3 = new Kat("c3");
        Kat c4 = new Kat("c4");
        Kat c5 = new Kat("c5");
        Kat c6 = new Kat("c6");

        // Registrer katte i kattelemmen
        System.out.println("Registrering af katte:");
        System.out.println("c1 registreret: " + kattelem.registrerKat(c1)); // true
        System.out.println("c2 registreret: " + kattelem.registrerKat(c2)); // true
        System.out.println("c3 registreret: " + kattelem.registrerKat(c3)); // true
        System.out.println("c4 registreret: " + kattelem.registrerKat(c4)); // true
        System.out.println("c5 registreret: " + kattelem.registrerKat(c5)); // true
        System.out.println("c6 registreret: " + kattelem.registrerKat(c6)); // false

//        // Vis registrerede katte
//        System.out.println("\nRegistrerede katte:");
//        kattelem.visRegistreredeKatte();

        // Test Mode: IN/OUT
        System.out.println("\nMode IN/OUT:");
        kattelem.setMode("IND_UD");
        kattelem.visMode();
        System.out.println("c1 kan komme ind: " + kattelem.kanKatKommeInd(c1)); // true
        System.out.println("c5 kan komme ind: " + kattelem.kanKatKommeInd(c5)); // true
        System.out.println("c6 kan komme ind: " + kattelem.kanKatKommeInd(c6)); // false

        // Test Mode: ONLY IN
        System.out.println("\nMode ONLY IN:");
        kattelem.setMode("KUN_IND");
        kattelem.visMode();
        System.out.println("c1 kan komme ind: " + kattelem.kanKatKommeInd(c1)); // true
        System.out.println("c5 kan komme ind: " + kattelem.kanKatKommeInd(c5)); // true
        System.out.println("c6 kan komme ind: " + kattelem.kanKatKommeInd(c6)); // false

        // Test Mode: ONLY OUT
        System.out.println("\nMode ONLY OUT:");
        kattelem.setMode("KUN_UD");
        kattelem.visMode();
        System.out.println("c1 kan komme ud: " + kattelem.kanKatKommeUd(c1)); // true
        System.out.println("c5 kan komme ud: " + kattelem.kanKatKommeUd(c5)); // true
        System.out.println("c6 kan komme ud: " + kattelem.kanKatKommeUd(c6)); // true

        // Test Mode: CLOSED
        System.out.println("\nMode CLOSED:");
        kattelem.setMode("LUKKET");
        kattelem.visMode();
        System.out.println("c1 kan komme ind: " + kattelem.kanKatKommeInd(c1)); // false
        System.out.println("c5 kan komme ind: " + kattelem.kanKatKommeInd(c5)); // false
        System.out.println("c6 kan komme ind: " + kattelem.kanKatKommeInd(c6)); // false
    }
}
