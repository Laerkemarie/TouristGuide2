package marsvin;

public class Marsvin implements Comparable<Marsvin> {
    private String navn;
    private String race;
    private int foder;

    //constructor
    public Marsvin(String navn, String race, int foder) {
        this.navn = navn;
        this.race = race;
        this.foder = foder;
    }

    public String getNavn() {
        return navn;
    }
    public String getRace() {
        return race;
    }
    public int getFoder() {
        return foder;
    }

    // toString metode for nem output
    @Override
    public String toString() {
        return navn + " - " + race + " - " + foder + "g - ";
    }

    // Implementer Comparable (standard: sorter efter navn)
    @Override
    public int compareTo(Marsvin o) {
        return this.navn.compareTo(o.navn);
    }
}
