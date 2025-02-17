package lightOpgaver.seks;

public class Main {
    public static void main(String[] args) {

        Bil bil = new Bil(1100.50, true);
        Trailer trailer = new Trailer(100);

        System.out.println("Kan trailer tilkobles? " + bil.setTrailer(trailer));
        System.out.println("Totalvægten er: " + bil.totalVægt());
    }
}
