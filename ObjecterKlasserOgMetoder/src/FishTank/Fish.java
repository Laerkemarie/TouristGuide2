package FishTank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Fish {
    private String name;
    private String gender;
    private List<HealthNote> healthNotes;

    public Fish(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.healthNotes = new ArrayList<>();
    }

    public void addHealthNote(String note) {
        if (note.length() <= 30) {
            healthNotes.add(new HealthNote(LocalDate.now(), note));
        } else {
            System.out.println("Bemærkning skal højest være 30 tegn.");
        }
    }

    public String getLatestHealthNote() {
        if (healthNotes.isEmpty()) {
            return "Ingen sundhedsnotater tilgængelige.";
        }
        HealthNote latest = healthNotes.get(healthNotes.size() - 1);
        return latest.toString();
    }

    @Override
    public String toString() {
        return name + " (" + gender + ")";
    }

    private static class HealthNote { // Korrekt navn
        private LocalDate date;
        private String note;

        public HealthNote(LocalDate date, String note) { // Korrekt stavet her
            this.date = date;
            this.note = note;
        }

        @Override
        public String toString() {
            return date + ": " + note;
        }
    }
}

