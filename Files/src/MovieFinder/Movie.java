package MovieFinder;

public class Movie {
    
    private int year;
    private double length;
    private String title;
    private String subject;
    private int popularity;
    private boolean wonAward;

    public Movie(int year, double length, String title, String subject, int popularity, boolean wonAward) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.popularity = popularity;
        this.wonAward = wonAward;
    }

    public Movie(String title, String subject, int year, double length, int popularity, boolean wonAward) {
        this.title = title;
        this.subject = subject;
        this.year = year;
        this.length = length;
        this.popularity = popularity;
        this.wonAward = wonAward;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public boolean hasWonAward() {
        return wonAward;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") - Length: " + length + " hours, Popularity: " + popularity + ", Award: " + wonAward;
    }
}
