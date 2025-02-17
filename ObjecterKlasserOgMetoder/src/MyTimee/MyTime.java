package MyTimee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyTime {
    private int year;
    private int month;
    private int day;
    private int hours;
    private int minutes;

    public MyTime(int days, int hours, int minutes) {
    }

    public LocalDateTime toLocalDateTime() {
        return LocalDateTime.of(year, month, day, hours, minutes);
    }

    // Enum for ugedage
    public enum DayOfWeek {
        MANDAG, TIRSDAG, ONSDAG, TORSDAG, FREDAG, LØRDAG, SØNDAG
    }

    // Konstruktør
    public MyTime(int year, int month, int day, int hours, int minutes) {

        // Tjek for gyldige år, måned, dag, timer og minutter
        if (year < 0) {
            throw new IllegalArgumentException("År skal være et positivt tal");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Måned skal være mellem 1 og 12");
        }
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Dagen skal være mellem 1 og 31");
        }
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("Timer skal være melle 0 og 23");
        }
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Minutter skal være mellem 0 og 59");
        }

        // Hvis alle værdier er gyldige, gem dem som attributter
        this.year = year;
        this.month = month;
        this.day = day;
        this.hours = hours;
        this.minutes = minutes;
    }
    public String timeAsString() {
        return String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);
    }

    // Metode, der tjekker om året er et skudår
    public boolean isLeapYear() {
        // Et år er skudår, hvis det er deleligt med 4, men ikke med 100, medmindre det også er deleligt med 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    // Metode, der returnerer ugedagen for den specifikke dato
    public DayOfWeek dayOfWeek() {
        LocalDate date = LocalDate.of(year, month, day);
        java.time.DayOfWeek javaDayOfWeek = date.getDayOfWeek();
        return DayOfWeek.values()[javaDayOfWeek.getValue() - 1];
    }

    // Metode, der tjekker om det er en arbejdsdag (mandag til fredag)
    public boolean isWorkDay() {
        DayOfWeek dayOfWeek = dayOfWeek();
        return dayOfWeek != DayOfWeek.LØRDAG && dayOfWeek != DayOfWeek.SØNDAG;
    }

    public static void main(String[] args) {
        try {
            MyTime time1 = new MyTime(2024, 6, 21, 11, 23);
            System.out.println(time1.timeAsString());
            System.out.println("Er skudår: " + time1.isLeapYear());
            System.out.println("Ugedag: " + time1.dayOfWeek());
            System.out.println("Er det arbejdsdag?: " + time1.isWorkDay());

            MyTime time2 = new MyTime(2021, 11, 9, 10, 11);
            System.out.println(time2.timeAsString());
            System.out.println("Er skudår:" + time2.isLeapYear());
            System.out.println("Ugedag: " + time2.dayOfWeek());
            System.out.println("Er det arbejdsdag? " + time2.isWorkDay());

            MyTime time3 = new MyTime(2025, 13, 10, 23, 12);
            System.out.println(time3.timeAsString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
