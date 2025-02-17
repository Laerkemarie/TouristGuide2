package spaceExplorer;

public interface Moveable {
    // Konstant værdi, som kan bruges til tyngdekraft (dette er en konstant værdi, så den er final)
    double metersPerSecondSquared = 0.0;

    // Denne metode returnerer den tyngdekraft, der påvirker hastigheden for bevægelse (meter per sekund i anden potens)
    double getMetersPerSecondSquared();

    // Denne metode bruges til at opdatere positionen for væsnet (ændre x, y og z koordinater)
    void becomeMoved(int x, int y, int z);
}
