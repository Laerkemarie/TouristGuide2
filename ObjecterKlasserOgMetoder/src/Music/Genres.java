package Music;

public class Genres {
        public enum Genre {
            POP("Populær musik der er karakteriseret ved fængende melodier og rytmer"),
            ROCK("Rockmusik med tung brug af elektrisk guitar og trommer"),
            HIP_HOP("En musikgenre med fokus på rap og rytmisk tale"),
            R_AND_B("Rytmisk og bluesmusik, ofte med fokus på vokal og følelsesmæssig dybde"),
            COUNTRY("Musik med rødder i amerikansk folkemusik, præget af akustiske instrumenter");

            private final String description;

            Genre(String description) {
                this.description = description;
            }

            public String getDescription() {
                return description;
            }
        }
    }

