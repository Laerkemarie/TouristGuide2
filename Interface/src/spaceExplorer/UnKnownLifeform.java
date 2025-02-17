package spaceExplorer;

public class UnKnownLifeform extends Being implements Attackable {
    // Superkræfter for ukendte livsformer
    private SuperPower superPower;

    public UnKnownLifeform(String name, SuperPower superPower) {
        super(name);
        this.superPower = superPower;
    }
    //Returner superkraften
    public SuperPower getSuperPower() {
        return superPower;
    }

    // Returner trykket for ukendt livsform
    @Override
    public int getAtmosphericPressureInMilibars() {
        return atmosphericPressureInMilibars;
    }

    // Logik for at den ukendte livsform bliver angrebet
    @Override
    public void becomeAttacked(int attackPower) {

    }

    // Logik for at den ukendte livsform angriber et andet væsen
    @Override
    public void attack(Being victim) {

    }
}
