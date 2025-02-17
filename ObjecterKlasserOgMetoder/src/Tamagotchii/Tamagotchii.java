package Tamagotchii;

public class Tamagotchii {
    protected String name;
    protected int energy = 10;
    protected int mood = 10;

    public Tamagotchii(String name) {
        this.name = name;
    }

    public void sleep(int hours) {
        System.out.println(name + " sover i " + hours + " timer.");
        energy += hours;
    }

    public void feed() {
        System.out.println(name + " spiser og er glad. Nu er " + name + " s energiniveau på " + energy);
        energy += 2;
    }

    public void play() {
        if (energy <= 3) {
            System.out.println(name + " kan ikke lege, da han er for træt. Put ham til lur");
            return;
        }

        System.out.println(name + " leger og har det sjovt.");
        mood += 2;
        energy -= 3;

        if (energy <= 0) {
        System.out.println(name + " er blevet træt efter at have leget og har nu " + energy + " på sin energikonto");
    } else {
            System.out.println(name + " har nu " + energy + " på sin energikonto efter at have leget");
        }
    }

    public void medicine(boolean needsMedicine) {
        if (needsMedicine) {
            System.out.println(name + " får medicin.");
        }
    }

    public void clean(int fresh) {
        System.out.println(name + " får et bad.");
    }

    public void makeSound() {
        System.out.println(name + " laver en lyd.");
    }
}

