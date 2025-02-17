package friendSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FriendSorter {
    public static void main(String[] args) {
        List<Friend> friends = new ArrayList<>();
        friends.add(new Friend(43, "Alice", "+45 12345678", "alice@example.com"));
        friends.add(new Friend(32, "Bob", "+1 98765432", "bob@example.com"));
        friends.add(new Friend(40, "Charlie", "+46 87654321", "charlie@example.com"));

        Collections.sort(friends, new NameComparator());
        System.out.println("Sorteret ud fra navn: ");
        friends.forEach(System.out::println);
        System.out.println();

        Collections.sort(friends, new PhoneComparator());
        System.out.println("Sorteret ud fra telefonnummer: ");
        friends.forEach(System.out::println);

//        Collections.sort(friends, new IdComparator());
//        System.out.println("Sorteret ud fra ID: ");
//        friends.forEach(System.out::println);
    }
}

