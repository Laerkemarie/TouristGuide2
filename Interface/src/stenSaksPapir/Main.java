package stenSaksPapir;

public class Main {
    public static void main(String[] args) {
        Player human = new HumanPlayer();
        Player computer = new ComputerPlayer();

        Game game = new Game(human, computer);
        game.start();
    }
}
