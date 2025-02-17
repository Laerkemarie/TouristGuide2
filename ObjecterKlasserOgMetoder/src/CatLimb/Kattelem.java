package CatLimb;

import java.util.ArrayList;

public class Kattelem {
    private enum Mode { KUN_IND, KUN_UD, IND_UD, LUKKET }
    private Mode currentMode;
    private ArrayList<Kat> registreredeKatte;

    public Kattelem() {
        this.currentMode = Mode.LUKKET;
        this.registreredeKatte = new ArrayList<>();
    }

    public void setMode(String mode) {
        switch (mode.toUpperCase()) {
            case "KUN_IND":
                currentMode = Mode.KUN_IND;
                break;
            case "KUN_UD":
                currentMode = Mode.KUN_UD;
                break;
            case "IND_UD":
                currentMode = Mode.IND_UD;
                break;
            case "LUKKET":
                currentMode = Mode.LUKKET;
                break;
            default:
                System.out.println("Ugyldigt valg");
        }
    }
    public boolean registrerKat(Kat kat) {
        if (registreredeKatte.size() < 5) {
            registreredeKatte.add(kat);
            return true;
        } else {
            System.out.println("Max antal katte er registreret");
            return false;
        }
    }
    public void fjernAlleKatte() {
        registreredeKatte.clear();
    }
    public boolean kanKatKommeInd(Kat kat) {
        if (currentMode == Mode.KUN_IND || currentMode == Mode.IND_UD) {
            for (Kat registreretKat : registreredeKatte) {
                if (registreretKat.getChipNummer().equals(kat.getChipNummer())) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean kanKatKommeUd(Kat kat) {
        return currentMode == Mode.KUN_UD || currentMode == Mode.IND_UD;
        }

        public void visMode() {
        System.out.println("Kattelemmen er nu i mode: " + currentMode);
    }
}
