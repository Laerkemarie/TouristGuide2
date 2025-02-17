package Kids;

public class Kid implements Comparable<Kid> {
    private int heightInCm;
    private String name;

    public Kid(int heightInCm, String name) {
        this.heightInCm = heightInCm;
        this.name = name;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Kid other) {
        return Integer.compare(this.heightInCm, other.heightInCm);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Height: " + heightInCm;
    }
}
