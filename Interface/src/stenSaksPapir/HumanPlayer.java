package stenSaksPapir;

import java.util.Scanner;

public class HumanPlayer implements Player {
    @Override
    public Choice makeChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg mellem sten, saks og papir: ");
        String userChoice = scanner.nextLine().toUpperCase();

        switch (userChoice) {
            case "STEN": return Choice.STEN;
            case "SAKS": return Choice.SAKS;
            case "PAPIR": return Choice.PAPIR;
            default: return makeChoice();
        }
    }
}
