package spaceExplorer;

public class Alien extends Being implements Moveable, Attackable {
    // Hvilken type alien er det?
    private AlienType type;

    public Alien(String name, AlienType type) {
        super(name);
        this.type = type;
    }

    // Returner typen af alien
    public AlienType getAlienType() {
        return type;
    }

    // Returner tyngdekraften for alienen
    @Override
    public double getMetersPerSecondSquared() {
        return metersPerSecondSquared;
    }

    // Flyt alienen til de nye koordinater
    @Override
    public void becomeMoved(int x, int y, int z) {

    }

    // Returner det atmosfæriske tryk for alienen
    @Override
    public int getAtmosphericPressureInMilibars() {
        return atmosphericPressureInMilibars;
    }

    // Logik for at alienen bliver angrebet
    @Override
    public void becomeAttacked(int attackPower) {

    }

    // Logik for at alienen angriber et andet væsen
    @Override
    public void attack(Being victim) {

    }
}
