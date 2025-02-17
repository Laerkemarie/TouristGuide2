package FishTank;

import java.time.LocalDate;

public class FishTank {
    private LocalDate lastWaterChangeDate;
    private String lastWaterChangeNote;
    private WaterQuality lastWaterQuality;

    public FishTank() {
        this.lastWaterChangeDate = null;
        this.lastWaterChangeNote = null;
        this.lastWaterQuality = null;
    }

    public void changeWater(String note, WaterQuality quality) {
        if (note.length() <= 60) {
            this.lastWaterChangeDate = LocalDate.now();
            this.lastWaterChangeNote = note;
            this.lastWaterQuality = quality;
        } else {
            System.out.println("Bemærkning skal højest være 60 tegn.");
        }
    }

    public String getLastWaterChangeInfo() {
        if (lastWaterChangeDate == null) {
            return "Ingen vandskifte registeret.";
        }
        return "Dato: " + lastWaterChangeDate + ", Bemærkning: " + lastWaterChangeNote + ", Kvalitet: " + lastWaterQuality;
    }

    public enum WaterQuality {
        PERFEKT, GODT, OKAY, DÅRLIGT
    }
}
