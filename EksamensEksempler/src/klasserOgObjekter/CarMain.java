package klasserOgObjekter;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Volvo", 2000);
        Car car2 = new Car("Ford", 2010);
        Car car3 = new Car("BMW", 2003);

        car.carDescription();
        car2.carDescription();
        car3.carDescription();

        car2.setBrand("Honda");
        car2.setYear(2012);

        car2.carDescription();
    }
}
