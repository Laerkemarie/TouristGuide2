package superOgSubKlasser;

public class Car extends Vehicle{

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println(getBrand() + " bilen kører");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Ford");
        vehicle.drive();

        Car car = new Car("BMW");
        car.drive();
    }
}
