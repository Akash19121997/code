package CloningAndClonable;

import java.util.ArrayList;
import java.util.List;

public class Student implements Cloneable {
    int id;
    String name;
    Address address;
    List<String> contacts;

    public Student(int id, String name, Address address, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contacts=" + contacts +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone(); -> shallow copy
        // below will be deep copy
        Student copy = (Student) super.clone();
        copy.address = (Address) address.clone();
        copy.contacts = new ArrayList<>(contacts);
        return copy;
    }
}
