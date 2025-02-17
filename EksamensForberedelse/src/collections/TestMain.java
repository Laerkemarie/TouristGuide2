package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<Test> children = new ArrayList<>();
        children.add(new Test("Simon", 12, 'm', 120));
        children.add(new Test("Anne", 10, 'f', 110));
        children.add(new Test("Kim", 13, 'm', 130));
        children.add(new Test("Lars", 11, 'm', 125));

        sortByAge(children);

        for (Test child : children) {
            System.out.println(child);
        }
    }
    public static void sortByAge(List<Test> children) {

        //kort metode til at sortere på med hjælp af metode reference
        children.sort(Comparator.comparingInt(Test::getAge)
                        .thenComparing(Test::getName));

        //længere metode til at sortere, men det vi har lært
//        Collections.sort(children, new Comparator<collections.Test>() {
//            @Override
//            public int compare(collections.Test t1, collections.Test t2) {
//                return Integer.compare(t1.getAge(), t2.getAge());
//            }
//        });
    }
}
