package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NeedOfConcurrentCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if(!iterator.next().equals("D")) {
                list.add("D"); //// not allowed here, when traversing a collection crud not allowed. ConcurrentModificationException will be thrown
            }
        }
    }
}
