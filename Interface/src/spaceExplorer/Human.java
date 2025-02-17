package spaceExplorer;

public class Human extends Being implements Moveable {
    public Human(String name) {
        super(name);
    }

    // Returner den konstante tyngdekraftværdi
    @Override
    public double getMetersPerSecondSquared() {
        return metersPerSecondSquared;
    }

    // Her implementeres logikken for at flytte en human til en ny position
    @Override
    public void becomeMoved(int x, int y, int z) {

    }

    // Her implementeres logikken for, hvordan en Human angriber et andet væsen
    @Override
    public void attack(Being victim) {

    }
}
