package toy;

public class Toy {
    private String name;
    private int minumumAge;
    private int popularityScore;

    public Toy(String name, int minumumAge, int popularityScore) {
        this.name = name;
        this.minumumAge = minumumAge;
        this.popularityScore = popularityScore;
    }

    public String getName() {
        return name;
    }

    public int getMinumumAge(){
        return minumumAge;
    }

    public int getPopularityScore() {
        return popularityScore;

        }
    }
