package Lamda.example1;

public class Lamda
{
    public static void main(String[] args) {

        //1. First way to use Functional Interface is by creating your own class
        ImplementFunctionalInterface hello=new ImplementFunctionalInterface();
        hello.sayHello();

        //2. Anonymous class for implementing interface
        FunctionalInterface i= new FunctionalInterface(){
            @Override
            public void sayHello(){
                System.out.println("Hi Buddy 2");
            }
        };
        i.sayHello();

        FunctionalInterface i2= new FunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hi Buddy 3");
            }
        };
        i2.sayHello();

        //3. Use lambda expression
        FunctionalInterface i4=()-> System.out.println("Inside lambda");
        i4.sayHello();
    }


}
