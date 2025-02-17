package Class;

public class TerningSpil {
    public static void main(String[] args) {
        //terningespil ud fra terning klassen

        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        terning1.roll();
        terning2.roll();
        //System.out.println("Terning 1 slog en " + terning1.getFaceValue() + "'er");
        //System.out.println("Terning 2 slog " + terning2.getFaceValue() + "'er");

        boolean afslutSpil = false;
        int antalKast = 0;

        while (!afslutSpil) {
            terning1.roll();
            terning2.roll();
            antalKast++;

            System.out.println("Terning 1 slog: " + terning1.getFaceValue() + " og terning 2 slog: " + terning2.getFaceValue());

            if (terning1.getFaceValue() == 1 && terning2.getFaceValue() == 1) {
                System.out.println("Snake Eyes! Du har vundet spillet efter " + antalKast + " kast!");

                afslutSpil = true;
            }
        }
    }
}

