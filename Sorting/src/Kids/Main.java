package Kids;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        ArrayList<Kid> kids = new ArrayList<>();

        kids.add(new Kid(115, "Kim"));
        kids.add(new Kid(110, "Mia"));
        kids.add(new Kid(135, "Mark"));
        kids.add(new Kid(122, "Liv"));

        Collections.sort(kids);

        System.out.println("Børn fra lavest til højest:");
        for (Kid kid : kids) {
            System.out.println(kid);

        }

        Kid shortest = kids.get(0);
        Kid tallest = kids.get(kids.size() - 1);

        System.out.println("\nLaveste barn er: " + shortest);
        System.out.println("Højeste barn er: " + tallest);

        }
    }

