package CarsSorting;

public class Cars implements Comparable<Cars> {
    private String plate;

    public Cars(String plate) {
        this.plate = plate;
    }

    @Override
    public int compareTo(Cars other) {
        return this.plate.compareTo(other.plate);
    }

    public String getPlate() {
        return plate;
    }
}
