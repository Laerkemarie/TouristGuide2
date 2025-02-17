package Music;
import Music.Genres.Genre;

public class MusicExample {
    public static void main(String[] args) {

        MusicTracks musicTrack1 = new MusicTracks("Barndommens Gade", "Anne Linnet", Genres.Genre.POP, 1);
        MusicTracks musicTrack2 = new MusicTracks("Sleeping My Day Away", "D-A-D", Genres.Genre.ROCK, 2);
        MusicTracks musicTrack3 = new MusicTracks("Love The Way You Lie", "Eminem", Genres.Genre.HIP_HOP, 3);
        MusicTracks musicTrack4 = new MusicTracks("Beautiful Monster", "Ne-Yo", Genres.Genre.R_AND_B, 4);
        MusicTracks musicTrack5 = new MusicTracks("TEXAS HOLD 'EM", "Beyoncé", Genres.Genre.COUNTRY, 5);

        System.out.println("-------------------------");
        System.out.println(musicTrack1);
        System.out.println("-------------------------");
        System.out.println(musicTrack2);
        System.out.println("-------------------------");
        System.out.println(musicTrack3);
        System.out.println("-------------------------");
        System.out.println(musicTrack4);
        System.out.println("-------------------------");
        System.out.println(musicTrack5);
    }
}
