package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1. Create object of student class
        Student student1 = new Student("Akash", 30);
        // I want to serialize in a file / write data to file
        FileOutputStream fos = new FileOutputStream("obj.txt");
        // oos -> fos
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // how to serialize -> write specific object to oos, ek bar oos me jayega to byte me automatic convert ho jayega
        oos.writeObject(student1);
        oos.close();
        fos.close();
        System.out.println("State of object is written to file obj.txt");

        //Deserialization
        FileInputStream fis = new FileInputStream("obj.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student2 = (Student) ois.readObject();
        ois.close();
        fis.close();
        System.out.println(student1.getAge() + " " + student2.getAge());


    }
}
