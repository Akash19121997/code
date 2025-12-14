package CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Student s1 =  new Student("John Doe");
        Student s2 =  new Student(s1);

        System.out.println(s1.getName());
        System.out.println(s2.getName());

        Student s3 = s2; // Here reference attached. So any changes to s3 will reflect to s2
        System.out.println(s3.getName());
        s3.setName("John");
        System.out.println(s3.getName());
        System.out.println(s2.getName());
        System.out.println(s1.getName());
    }
}
