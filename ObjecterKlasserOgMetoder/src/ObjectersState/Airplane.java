package ObjectersState;

public class Airplane {
    private int flightNumber;
    private String destination;
    private String departureTime;
    private boolean onTime;

    // Default constructor
    public Airplane() {
        this.flightNumber = 12345;
        this.destination = "Bangkok Airport";
        this.departureTime = "00:00";
        this.onTime = true;
    }

    // Parameterized constructor
    public Airplane(int flightNumber, String destination, String departureTime, boolean onTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.onTime = onTime;
    }

    // Method to get flight status
    public String flightStatus() {
        if (onTime) {
            return "Your flight with flight number " + flightNumber + " to " + destination + " at " + departureTime + " is on schedule.";
        } else {
            return delay();
        }
    }

    // Method to return delay message
    public String delay() {
        return "Your flight with flight number " + flightNumber + " to " + destination + " at " + departureTime + " is delayed by 30 minutes.";
    }
}

