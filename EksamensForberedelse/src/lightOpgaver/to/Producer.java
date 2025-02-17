package lightOpgaver.to;

public class Producer {
    private String name;

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Film film1 = new Film("Ternet ninja", 2019);
        Film film2 = new Film("Ternet ninja2", 2021);

        Producer producer = new Producer("Anders Matthesen");

        film1.setProducer(producer);
        film2.setProducer(producer);

        System.out.println("Film 1: " + film1.getFilmtitel() + ", ugivelsesår: " + film1.getUdgivelsesår() + ", producer: " + film1.getProducer().getName());
        System.out.println("Film 2: " + film2.getFilmtitel() + ", ugivelsesår: " + film2.getUdgivelsesår() + ", producer: " + film2.getProducer().getName());
    }

    }

