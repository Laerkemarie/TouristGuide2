package WhileLoop;

public class Livssimulatorbot {
    public static void main(String[] args) {
        //livssimulatorbot fra 0 til 99 år, indsæt vigtige begivenheder ud fra alder
        for (int i = 0; i <= 99;i++) {
            if (i == 1) {
                System.out.println(i + " :vuggestuestart");
            } else if (i == 3) {
                System.out.println(i + " :børnehavestart");
            } else if (i == 6) {
                System.out.println(i + " :skolestart");
            } else if (i == 15) {
                System.out.println(i + " :færdig med 9. klasse");
            } else {
                System.out.println(i);
            }
        }
    }
}

