package AssignmentManager;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Random random = new Random();

        String[] subjects = {
                "Programming", "System Development", "Organization", "Technology"
        };

        String[] taskTypes = {
                "Solve assignment", "Prepare presentation", "Study curriculum",
                "Solve challenge", "Projectwork"
        };

        for (int i = 0; i < 10000; i++) {
            int year = random.nextInt(2) + 2023;
            int month = random.nextInt(12) + 1;
            int day = random.nextInt(28) + 1;
            int hour = random.nextInt(24);
            int minute = random.nextInt(60);

            LocalDateTime deadline = LocalDateTime.of(year, month, day, hour, minute);

            String subject = subjects[random.nextInt(subjects.length)];
            String taskType = taskTypes[random.nextInt(taskTypes.length)];

            Event event = new Event(deadline, subject, taskType);
            eventManager.addAssignment(event);
        }

        eventManager.printAssignment();
    }
}
