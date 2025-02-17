package stenSaksPapir;

import java.util.Scanner;

public class Game {
    private Player humanPlayer;
    private Player computerPlayer;
    private int humanScore = 0;
    private int computerScore = 0;
    private Scanner scanner = new Scanner(System.in);
    private int roundNumber = 1;

    public Game(Player humanPlayer, Player computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    public void start() {
        while (humanScore < 2 && computerScore < 2) {
            System.out.println("Runde " + roundNumber + ":");
            playRound();
            roundNumber++;
        }

        if (humanScore > computerScore) {
            System.out.println("Du har vundet");
        } else if (computerScore > humanScore) {
            System.out.println("Computeren har vundet!");
        } else {
            System.out.println("Det blev uafgjort!");
        }

        System.out.println("\nSamlet score:");
        System.out.println("Menneskespiller: " + humanScore);
        System.out.println("Computeren: " + computerScore);
    }

    private void playRound() {
        Choice humanChoice = humanPlayer.makeChoice();
        Choice computerChoice = computerPlayer.makeChoice();

        System.out.println("Menneskespiller valgte: " + humanChoice);
        System.out.println("Computeren valgte: " + computerChoice);

        if (humanChoice == computerChoice) {
            System.out.println("Uafgjort!");
        } else if (isHumanWinner(humanChoice, computerChoice)) {
            System.out.println("Menneskespiller vinder denne runde!");
            humanScore++;
        } else {
            System.out.println("Computeren vinder denne runde!");
            computerScore++;
        }
    }

    private boolean isHumanWinner(Choice humanChoice, Choice computerChoice) {
        return (humanChoice == Choice.STEN && computerChoice == Choice.SAKS) ||
                (humanChoice == Choice.SAKS && computerChoice == Choice.PAPIR) ||
                (humanChoice == Choice.PAPIR && computerChoice == Choice.STEN);
    }
}
