package lightOpgaver.tre;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private List<Integer> terningØjne;

    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        this.terningØjne = new ArrayList<>();
    }

    public int ryst() {
        Random random = new Random();
        terningØjne.clear();
        int samlet = 0;
        for (int i = 0; i < antalTerninger; i++) {
            int øjne = random.nextInt(6) + 1;
            terningØjne.add(øjne);
            samlet += øjne;
        }
        return samlet;
    }

    public List<Integer> se() {
        return new ArrayList<>(terningØjne);
    }

    public static void main(String[] args) {
        Raflebæger raflebæger = new Raflebæger(5);

        int samledeØjne = raflebæger.ryst();
        System.out.println("Samlet antal øjne efter ryst: " + samledeØjne);
        System.out.println("Terningernes øjne: " + raflebæger.se());
    }
}
