package friendSorter;

import java.util.Comparator;

public class NameComparator implements Comparator<Friend> {
    @Override
    public int compare(Friend f1, Friend f2) {
        return f1.getName().compareToIgnoreCase(f2.getName());
    }
}
