package lightOpgaver.seks;

public class Bil {
    private double weight;
    private Trailer trailer;

    public Bil(double weight, boolean trailer) {
        this.weight = weight;
        this.trailer = null;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Trailer getTrailer() {
        return trailer;
    }


    public double totalVægt() {
        if (trailer != null) {
            return this.weight + trailer.getWeight();
        }
        return this.weight;
    }

    public boolean setTrailer(Trailer trailer) {
        if (this.weight + trailer.getWeight() >= 3500) {
            this.trailer = trailer;
            return true;
        }
        return false;
    }
}
