package stenSaksPapir;

import java.util.Random;

public class ComputerPlayer implements Player {
    @Override
    public Choice makeChoice() {
        Random random = new Random();
        int randomChoice = random.nextInt(3);
        return Choice.values()[randomChoice];
    }
}
