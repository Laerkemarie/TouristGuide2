package Logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class LoggingThoseActions {

    // Attribut til at gemme linjerne
    private ArrayList<String> lines;

    // Filnavn for loggen
    private static final String LOG_FILE = "actions_log.txt";

    //konstruktor
    public LoggingThoseActions() {
        lines = new ArrayList<>();
    }

    // Metode til at få det nuværende tidsstempel
    private String getTimetamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(new Date());
    }

    // Metode til at tilføje en linje
    public void addLine(String line) {
        lines.add(line);
        logAction("Adding line: \"" + line + "\"");
    }

    // Metode til at vise alle linjer
    public void viewLine() {
        if (lines.isEmpty()) {
            System.out.println("Ingen linjer at vise");
        } else {
            for (int i = 0; i < lines.size(); i++) {
                System.out.println(i + ": " + lines.get(i));
            }
        }
        logAction("Viewing lines");
    }

    // Metode til at slette en linje
    public void deleteLinje(int index) {
        if (index >= 0 && index < lines.size()) {
            String removedLine = lines.remove(index);
            logAction("Deleting line #" + index + ": \"" + removedLine + "\"");
        } else {
            System.out.println("Ugyldigt indeks.");
        }
    }

    // Metode til at logge en handling
    private void logAction(String action) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter logWriter = new PrintWriter(fileWriter)) {
            logWriter.println(getTimetamp() + ": " + action);
        } catch (IOException e) {
            System.out.println("Der opstod en fejl ved skrivning til log filen: " + e.getMessage());
        }
    }
    // Hovedmetode, der styrer programflowet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoggingThoseActions loggingActions = new LoggingThoseActions();

        // Logge at programmet er startet
        loggingActions.logAction("Program started");

        while (true) {
            // Vis menuen til brugeren
            System.out.println("\nVælg en mulighed:");
            System.out.println("1. Add line");
            System.out.println("2. View lines");
            System.out.println("3. Delete line");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Indtast linje");
                    String line = scanner.nextLine();
                    loggingActions.addLine(line);
                    break;
                case 2:
                    loggingActions.viewLine();
                    break;
                case 3:
                    System.out.println("Indtast indeks på linje som skal slettes: ");
                    int index = scanner.nextInt();
                    loggingActions.deleteLinje(index);
                    break;
                case 4:
                    System.out.println("Afslutter programmet");
                    loggingActions.logAction("Program exited");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        }
    }
}
