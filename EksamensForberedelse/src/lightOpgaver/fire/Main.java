package lightOpgaver.fire;

public class Main {
    public static void main(String[] args) {

        Keyword java = new Keyword("Java", "Et populært programmeringssprog");
        Keyword python = new Keyword("Python", "Et alsidigt programmeringssprog");
        Keyword oop = new Keyword("OOP", "Objekt orientreret programmering");

        java.addSeeAlso(python);
        java.addSeeAlso(oop);

        System.out.println("Matcher 'Java': " + java.matches("java"));
        System.out.println("Matcher 'C++': " + java.matches("C++"));

        System.out.println("Relaterede til java:");
        for (Keyword related : java.getSeeAlso()) {
            System.out.println(" - " + related.getWord() + ": " + related.getDefinition());
        }
    }
}
