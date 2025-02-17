package useradmin;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Konstant for filnavnet
    private final String FILENAME = "useradmin/users.txt";

    // ArrayList til at gemme User objekter
    private ArrayList<User> users;

    // Menu objekt
    private Menu menu;

    // Konstruktor
    public Main() {
        users = new ArrayList<>();
        menu = new Menu(); // Initialiser menuen
        readFile(); // Læs brugere fra filen ved opstart
    }

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    // Run-metoden til at vise menuen og håndtere brugerens valg
    public void run() {
        boolean running = true;

        while (running) {
            int choice = menu.showMenu(); // Brug Menu-klassen til at få brugerens valg

            switch (choice) {
                case 1:
                    createNewUser();
                    break;
                case 2:
                    viewUserList();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 9:
                    running = false;
                    System.out.println("Program afsluttes");
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen");

            }
        }
    }

    // Metode til at oprette en ny bruger
    public void createNewUser() {
        Scanner scanner = new Scanner(System.in);
        int userId = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Indtast bruger ID (heltal): ");
            try {
                userId = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ugyldigt input! ID skal være heltal. Prøv igen.");
            }
        }

        System.out.println("Indtast navn: ");
        String userName = scanner.nextLine();

        System.out.println("Indtast password: ");
        String password = scanner.nextLine();

        User newUser = new User(userId, userName, password);
        users.add(newUser);

        saveFile();
            System.out.println("Ny bruger er oprettet og gemt.");
        }

    // Metode til at vise listen af brugere
        public void viewUserList() {
        System.out.println("\nListe af brugere:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + " - " + users.get(i).toString());
        }
    }

    // Metode til at slette en bruger
    public void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Indtast element-nummer for bruger der skal slettes: ");
            try {
                index = Integer.parseInt(scanner.nextLine());
                if (index >= 0 && index < users.size()) {
                    validInput = true;
                } else {
                    System.out.println("Ugyldigt element-nummer. Prøv igen.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ugyldigt input! Element-nummer skal være heltal. Prøv igen.");
            }
        }
            users.remove(index);
            System.out.println("Bruger slettet");
            saveFile();
    }

    // Metode til at gemme brugere i en fil
    public void saveFile() {
        File directory = new File("useradmin");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try (FileWriter writer = new FileWriter(FILENAME)) {
            for (User user : users) {
                writer.write(user.getUserID() + "\n");
                writer.write(user.getUserName() + "\n");
                writer.write(user.getPassword() + "\n");
            }
            System.out.println("Brugere gemt til fil.");
        } catch (IOException e) {
            System.out.println("Fejl ved skrivning til fil: " + e.getMessage());
        }
    }

    // Metode til at læse brugere fra en fil
    public void readFile() {
        users.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int userId = Integer.parseInt(line);
                String userName = reader.readLine();
                String password = reader.readLine();
                users.add(new User(userId, userName, password));
            }
        } catch (IOException e) {
            System.out.println("Fejl ved læsning af fil: " + e.getMessage());

        }
    }
}

