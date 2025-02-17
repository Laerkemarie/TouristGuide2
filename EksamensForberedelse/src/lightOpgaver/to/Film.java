package lightOpgaver.to;

import java.time.Year;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private Producer producer;

    public Film(String filmtitel, int udgivelsesår) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film(String filmtitel) {
        this.filmtitel = filmtitel;
        this.udgivelsesår = Year.now().getValue();
    }

    public String getFilmtitel()  {
        return filmtitel;
    }

    public void setFilmtitel(String filmtitel) {
        this.filmtitel = filmtitel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}

