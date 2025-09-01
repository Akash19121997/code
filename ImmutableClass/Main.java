package ImmutableClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> petnames = new ArrayList<>();
        petnames.add("Bob");
        petnames.add("Alice");
        MyImmutableClass myImmutableClass = new MyImmutableClass("Akash Das", petnames );
        System.out.println(myImmutableClass);
        petnames.add(0, "Rahul");
        System.out.println(myImmutableClass);

    }
}
