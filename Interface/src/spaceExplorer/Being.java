package spaceExplorer;

public abstract class Being {
    protected String name;

    //Konstruktøren sætter navnet
    public Being(String name) {
        this.name = name;
    }

    //metode til at retunere navnet
    public String getName() {
        return name;
    }

    // Angrebsmetoden skal implementeres af konkrete væsner
    public abstract void attack(Being victim);
}
