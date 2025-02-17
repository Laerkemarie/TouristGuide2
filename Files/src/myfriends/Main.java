package myfriends;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Attribut til at holde en liste over venner
    private ArrayList<Friend> friends;

    public Main() {
        friends = new ArrayList<>();
    }

    public static void main(String[] args) {
        Main program = new Main();

        // Kalder run-metoden
        program.run();
    }

    public void run() {
        // Opretter Menu-instansen
        String[] menuItems = {
                "1. Show list of friends",
                "2. Enter new friend",
                "3. Delete friend",
                "4. Save list",
                "5. Load list",
                "9. Quit"
        };
        Menu menu = new Menu("MENU", "Choose option: ", menuItems);

        // Kører menuen, indtil brugeren vælger at afslutte
        boolean running = true;
        while (running) {
            menu.printMenu();
            int choice = menu.readChoice();

            switch (choice) {
                case 1:
                    showList();
                    break;
                case 2:
                    enterNewFriend();
                    break;
                case 3:
                    deleteFriend();
                    break;
                case 4:
                    saveList();
                    break;
                case 5:
                    loadList();
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                }
            }
        }
    // Metode til at vise listen af venner
        public void showList() {
        if (friends.isEmpty()) {
            System.out.println("No friends found");
        } else {
            for (Friend friend : friends) {
                System.out.println("Name: " + friend.getName());
                System.out.println("Phone number: " + friend.getPhoneNumber());
                System.out.println("Email: " + friend.getEmail());
                System.out.println();
            }
        }
    }

    // Metode til at tilføje en ny ven
    public void enterNewFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter friend's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter friend's phone number: ");
        String phonenumber = scanner.nextLine();

        System.out.println("Enter friend's email: ");
        String email = scanner.nextLine();

        // Opretter og tilføjer en ny ven til listen
        friends.add(new Friend(name, phonenumber, email));
        System.out.println("Friend added successfully");
    }

    // Metode til at slette en ven (baseret på navn)
    public void deleteFriend() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of friend to delete: ");
        String name = scanner.nextLine();

        // Søger efter ven og fjerner den
        boolean found = false;
        for (Friend friend : friends) {
            if (friend.getName().equalsIgnoreCase(name)) {
                friends.remove(friend);
                System.out.println("Friend removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Friend not found");
        }
    }

    // Metode til at gemme listen til en fil (dummy-metode for nu)
    public void saveList() {
        String filename = "friends_list.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
                for (Friend friend : friends) {
                    writer.write(friend.getName() + "," + friend.getPhoneNumber() + "," + friend.getEmail());
                    writer.newLine();
                }
                System.out.println("List saved successfully to " + filename);
            } catch (IOException e) {
            System.out.println("An error occured while saving the list.");
            e.printStackTrace();
        }
    }

    // Metode til at indlæse listen fra en fil (dummy-metode for nu)
    public void loadList() {
        String filename = "friends_list.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            friends.clear();

            while((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    friends.add(new Friend(data[0], data[1], data[2]));
                }
            }
            System.out.println("List loaded successfully from: " + filename);
        } catch (IOException e) {
            System.out.println("An error occured while loading the list.");
            e.printStackTrace();
        }
    }
}
