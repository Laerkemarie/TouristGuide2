package miniOpgaver.NummerFire;

public class Movie {
    private String title;
    private String director;
    private int rating;

    public Movie(String title, String director, int rating) {
        this.title = title;
        this.director = director;
        setRating(rating);
    }
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    public void setRating(int rating) {
        if (rating >= 1 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating skal være mellem 1 og 10");
        }
    }

    public String toString() {
        return "Movie: " + title + " , Instruktør: " + director + " , Rating: " + rating;
    }
}
