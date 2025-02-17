package Music;
import Music.Genres.Genre;

public class MusicTracks {
    private String title;
    private String artist;
    private Genre genre;
    private int rank;

    public MusicTracks (String title, String artist, Genre genre, int rank) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.rank = rank;
    }

    public String toString() {
        return "Titel: " + title + "\n" +
                "Artist: " + artist + "\n" +
                "Genre: " + genre + "\n" +
                "Beskrivelse: " + genre.getDescription() + "\n" +
                "Rank: " + rank;
    }
}
