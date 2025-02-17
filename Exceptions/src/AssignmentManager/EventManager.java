package AssignmentManager;

import java.util.ArrayList;
import java.util.Collections;

public class EventManager {
    private ArrayList<Event> assignments;

    public EventManager() {
        assignments = new ArrayList<>();
    }

    public void addAssignment(Event event) {
        assignments.add(event);
        Collections.sort(assignments, (event1, event2) -> {
            int subjectComparison = event1.getSubject().compareTo(event2.getSubject());
            if (subjectComparison != 0) {
                return subjectComparison;
            }

            return event1.getTaskType().compareTo(event2.getTaskType());
        });

        }

    public void printAssignment() {
        for (Event event : assignments) {
            System.out.println(event);
        }
    }
}
