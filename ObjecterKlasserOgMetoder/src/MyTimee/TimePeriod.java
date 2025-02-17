package MyTimee;

import java.time.temporal.ChronoUnit;

public class TimePeriod {
    private MyTime startTime;
    private MyTime endTime;

    // Konstruktør, der tager start- og sluttidspunkt og sikrer, at starttidspunktet er tidligst
    public TimePeriod(MyTime startTime, MyTime endTime) {
        if (startTime.toLocalDateTime().isAfter(endTime.toLocalDateTime())) {
            this.startTime = endTime;
            this.endTime = startTime;
        } else {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }

    public MyTime getStartTime() {
        return startTime;
    }

    public MyTime getEndTime() {
        return endTime;
    }

    public void setStartTime(MyTime startTime) {
        if (startTime.toLocalDateTime().isBefore(endTime.toLocalDateTime())) {
            this.startTime = startTime;
        } else {
            throw new IllegalArgumentException("Starttidspunktet kan ikke være senere end sluttidspunktet.");
        }
    }

    public void setEndTime(MyTime endTime) {
        if (startTime.toLocalDateTime().isBefore(endTime.toLocalDateTime())) {
            this.endTime = endTime;
        } else {
            throw new IllegalArgumentException("Sluttidspunktet kan ikke være tidligere end starttidspunktet.");
        }
    }

    // Beregner varigheden mellem start- og sluttidspunkt
    public MyTime duration() {
        // Få varigheden i minutter mellem de to tidspunkter
        long durationMinutes = ChronoUnit.MINUTES.between(startTime.toLocalDateTime(), endTime.toLocalDateTime());

        // Beregn dage, timer og minutter
        int days = (int) (durationMinutes / (24 * 60));
        int hours = (int) ((durationMinutes % (24 * 60)) / 60);
        int minutes = (int) (durationMinutes % 60);

        return new MyTime(days, hours, minutes);
    }

    public static void main(String[] args) {
        try {
            MyTime startTime = new MyTime(2020, 10, 1, 10, 0);
            MyTime endTime = new MyTime(2020, 10, 2, 11, 30);

            TimePeriod period = new TimePeriod(startTime, endTime);
            System.out.println("Start Time: " + period.getStartTime().timeAsString());
            System.out.println("End Time: " + period.getEndTime().timeAsString());
            System.out.println("Duration: " + period.duration().timeAsString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

