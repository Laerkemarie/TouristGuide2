package AssignmentManager;

import java.time.LocalDateTime;

public class Event {
    private LocalDateTime deadline;
    private String subject;
    private String taskType;

    public Event(LocalDateTime deadline, String subject, String taskType) {
        this.deadline = deadline;
        this.subject = subject;
        this.taskType = taskType;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public String getSubject() {
        return subject;
    }

    public String getTaskType() {
        return taskType;
    }

    @Override
    public String toString() {
        return "Deadline: " + deadline + ": " + subject + ": " + taskType;
    }
}
