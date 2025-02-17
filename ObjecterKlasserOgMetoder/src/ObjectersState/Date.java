package ObjectersState;

public class Date {
    int year;
    int month;
    int day;

    public Date() {
        this.year = 1970;
        this.month = 1;
        this.day = 1;

    }

    public Date(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public static void main(String[] args) {
        Date birthday = new Date(1999, 9, 23);

        System.out.println(birthday);

        Date defaultDate = new Date();

        System.out.println(defaultDate);
    }
}
