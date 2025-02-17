package enums;

public class Weekdays {
    public static void printDayToday(Day day) {
        //enum med switch
        switch (day) {
            case SATURDAY, SUNDAY:
                System.out.println(day + " is a weekend!");
            default:
                System.out.println(day + " is a weekday..");
        }
    }

    public static void main(String[] args) {
        Day today = Day.WENSDAY;
        System.out.println("Today is " + today);

//        printDayType(today);

        //for each loop
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
