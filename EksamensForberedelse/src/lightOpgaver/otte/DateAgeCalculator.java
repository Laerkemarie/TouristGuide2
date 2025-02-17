package lightOpgaver.otte;

public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int getYourAge() {
        return yourAge;
    }
    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }

    public int getDateAge() {
        return dateAge;
    }

    public void setDateAge(int dateAge) {
        this.dateAge = dateAge;
    }

    public int calculateAge() {
        return yourAge / 2 + 7;
    }

    public boolean isDateTooYoung() {
        return dateAge < calculateAge();
    }
}
