package lightOpgaver.et;

import java.util.ArrayList;
import java.util.List;

public class Tekst {
    private List<String> tekstlinjer;

    public Tekst() {
        this.tekstlinjer = new ArrayList<>();
    }

    public void tilføj(String linje) {
        tekstlinjer.add(linje);
    }

    public int findAntalUnikke() {
        List<String> unikkeLinjer = new ArrayList<>();
        for (String linje : tekstlinjer) {
            if (!unikkeLinjer.contains(linje)) {
                unikkeLinjer.add(linje);
            }
        }
        return unikkeLinjer.size();
    }

    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.tilføj("Hej");
        tekst.tilføj("med");
        tekst.tilføj("dig");
        tekst.tilføj("Hej");

        System.out.println("Antal unikke linjer: " + tekst.findAntalUnikke());
    }
}
