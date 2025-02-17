package ObjectersState;

public class AirplaneMain {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane();
        Airplane plane2 = new Airplane();

        System.out.println(plane1.flightStatus());
        System.out.println(plane2.delay());
    }
}

