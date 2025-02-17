package Inheritance;

public class Menneske {
    private String name;
    private int age;
    private String gender;
    private Menneske married;

    // constructor
    public Menneske(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.married = null; //start uden ægtefælle

        //getter og sætter for ægtefælle
    }
    public Menneske getMarried() {
        return married;
    }
    public void setMarried(Menneske married) {
        this.married = married;
    }

    //metode til at gifte sig med en anden
    public void gifterSigMed(Menneske andenPerson) {
        if (this == andenPerson) {
            System.out.println(this.name + " kan ikke gifte sig med sig selv");
            return;
        }
        //tjek om personen allerede er gift
        if (this.married != null) {
            System.out.println(this.name + " er allerede gift med " + this.married.name);
            return;
        }
        if (andenPerson.getMarried() != null) {
            System.out.println(andenPerson.name + " er allerede gift med " + andenPerson.getMarried().name);
        }
        //gifte begge parter med hinanden
        this.married = andenPerson;
        andenPerson.setMarried(this);
        System.out.println(this.name + " er nu gift med " + andenPerson.name);
    }

    //metode til at blive skilt
    public void bliverSkilt() {
        //tjek om personen faktsik er gift
        if(this.married != null) {
            System.out.println(this.name + " bliver skilt fra " + this.married.name);
            Menneske tidligerePartner = this.married;
            this.married.setMarried(null);
            this.married = null;
        } else {
            System.out.println(this.name + " er ikke gift, så kan ikke blive skilt");
        }
    }
    public String toString() {
        String status = (married != null) ? "gift med " + married.name : "ikke gift";
        return name + " (" + age + ", " + gender + "), " + status;
    }

    public static void main(String[] args) {
        Menneske person1 = new Menneske("Karen", 28, "kvinde");
        Menneske person2 = new Menneske("Søren", 33, "mand");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        person1.gifterSigMed(person2);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        person1.bliverSkilt();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println();

        person1.gifterSigMed(person1);
        System.out.println();

        person2.bliverSkilt();
    }
}




/*
Skriv en Menneske-klasse. Et menneske kan have en ægtefælle.
Det vil sige at der skal være en instans-variabel af typen Menneske (men at denne evt.
kan være tom hvis mennesket ikke har en ægtefælle).
Lav en metode i Menneske der hedder gifterSigMed, som tager et andet Menneske-objekt
(det skal ikke være muligt at gifte sig med sig selv). Sørg for at når et Menneske gifter sig med
et andet mennske bliver dette menneske samtidig det andet menneskes ægtefælle
(sørg for at have en setter og getter-metoder til ægtefælle-attributten).
HINT: man kan give et objekt med i et metodekald, og man kan give “sig selv”
med som objekt ved at bruge this som parameter i stedet for en objektreference.
B: det er nemt at komme til at lave et uendeligt loop når metoderne kalder hinanden.
Lav en metode der hedder bliverSkilt som sætter ægtefælle-instansvariablen til null,
og sørger for at den man er gift med også bliver skilt fra én.
 */