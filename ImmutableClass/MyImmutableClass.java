package ImmutableClass;

import java.util.ArrayList;

//1. Make class final, so that in cannot be inherited and changed further
public final class MyImmutableClass {
    //2. Make variables private final, so that once assigned cannot be changed.
    private final String name;
    private final ArrayList<String> petnames;

    //2. Assing values with constructor
    public MyImmutableClass(String name, ArrayList<String> petnames) {
        this.name = name;
        this.petnames = new ArrayList<>(petnames);
    }

    //3. No setter function only getter function


    public String getName() {
        return name;
    }
    // Return deep copy of Collections
    public ArrayList<String> getPetnames() {
        return new ArrayList<>(this.petnames);
    }

    @Override
    public String toString() {
        return "MyImmutableClass{" +
                "name='" + name + '\'' +
                ", petnames=" + new ArrayList<>(petnames) +
                '}';
    }
}
