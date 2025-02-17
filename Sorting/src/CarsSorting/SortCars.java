package CarsSorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortCars {

    public static void main(String[] args) {
        new SortCars().run();
    }

    public void run() {
        ArrayList<Cars> cars = new ArrayList<>();

        cars.add(new Cars("LGU875"));
        cars.add(new Cars("QJU984"));
        cars.add(new Cars("HYD653"));

        Collections.sort(cars);

        for (Cars car : cars) {
            System.out.println(car.getPlate());
        }
    }
}
