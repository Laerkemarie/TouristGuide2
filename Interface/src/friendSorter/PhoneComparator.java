package friendSorter;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Friend> {
    @Override
    public int compare(Friend f1, Friend f2) {
        return f1.getPhone().compareTo(f2.getPhone());
    }
}
