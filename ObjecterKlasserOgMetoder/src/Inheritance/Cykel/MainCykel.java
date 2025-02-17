package Inheritance.Cykel;

public class MainCykel {
    public static void main(String[] args) {
        // opret en ladcykel
        LadCykel ladCykel = new LadCykel("Grøn", 3, 20.000, 3);
        System.out.println(ladCykel);

        // opret en cyklist
        Cyklist cyklist = new Cyklist("David");

        if (ladCykel.enCyklistSaetterSig(cyklist)) {
            System.out.println(cyklist.getNavn() + " satte sig i ladcyklen");
        } else {
            System.out.println(cyklist.getNavn() + " kunnw ikke sætte sig i ladcyklen");
        }

        System.out.println("Cyklisten der kører ladcyklen: " + ladCykel.hvemKoererLadcyklen().getNavn());

        // cyklisten stiger af cyklen
        Cyklist cyklistSomStiggerUd = ladCykel.cyklistenStigerUd();
        if (cyklistSomStiggerUd != null) {
            System.out.println(cyklistSomStiggerUd.getNavn() + " steg af ladcyklen");
        }

        Unbike unbike = new Unbike("Rød", 1, 3000);
        System.out.println(unbike);
    }
}
