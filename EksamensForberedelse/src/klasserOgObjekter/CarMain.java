package klasserOgObjekter;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car("Ford", 1999);
        Car car2 = new Car("Mazda", 2009);
        Car car3 = new Car("BMW", 2005);

        car.printCarDetails();
        car2.printCarDetails();
        car3.printCarDetails();

        car2.setBrand("Honda");
        car2.setYear(2015);
        car2.printCarDetails();
    }
}
