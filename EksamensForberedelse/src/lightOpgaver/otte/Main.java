package lightOpgaver.otte;

public class Main {
    public static void main(String[] args) {
        DateAgeCalculator dateAgeCalculator = new DateAgeCalculator(30, 20);
        System.out.println("Laveste acceptable alder for date: " + dateAgeCalculator.calculateAge());
        System.out.println("Er daten for ung? " + dateAgeCalculator.isDateTooYoung());

        DateAgeCalculator dateAgeCalculator1 = new DateAgeCalculator(59, 45);
        System.out.println("Laveste acceptable alder for date: " + dateAgeCalculator1.calculateAge());
        System.out.println("Er daten for ung? " + dateAgeCalculator1.isDateTooYoung());
    }
}
