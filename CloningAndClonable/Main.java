package CloningAndClonable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> contacts = new ArrayList<>();
        contacts.add("7377773310");
        contacts.add("6370777741");
        Student s1 = new Student(1, "Akash", new Address(412308), contacts);
        System.out.println(s1);
        Student s2 = (Student) s1.clone();
        System.out.println(s2);
        s2.id =6;
        s2.name = "Rahul";
        s2.address.id = 468218;
        s2.contacts.add("111111");
        System.out.println(s2);
        System.out.println(s1);
          // Output of shallow copy
//        Student{id=1, name='Akash', address=Address{id=412308}, contacts=[7377773310, 6370777741]}
//        Student{id=1, name='Akash', address=Address{id=412308}, contacts=[7377773310, 6370777741]}
//        Student{id=6, name='Rahul', address=Address{id=468218}, contacts=[7377773310, 6370777741, 111111]}
//        Student{id=1, name='Akash', address=Address{id=468218}, contacts=[7377773310, 6370777741, 111111]}

          // Output of Deep Copy
//        Student{id=1, name='Akash', address=Address{id=412308}, contacts=[7377773310, 6370777741]}
//        Student{id=1, name='Akash', address=Address{id=412308}, contacts=[7377773310, 6370777741]}
//        Student{id=6, name='Rahul', address=Address{id=468218}, contacts=[7377773310, 6370777741, 111111]}
//        Student{id=1, name='Akash', address=Address{id=412308}, contacts=[7377773310, 6370777741]}
    }
}
