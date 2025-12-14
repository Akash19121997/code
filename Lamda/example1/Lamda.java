package Lamda.example1;

import java.util.ArrayList;
import java.util.List;

public class Lamda
{
    public static void main(String[] args) {

        //1. First way to use Functional Interface is by creating your own class, class file will be generated in storage
        ImplementFunctionalInterface hello=new ImplementFunctionalInterface();
        hello.sayHello();

        //2. Anonymous class for implementing interface, class file will be generated in storage
        FunctionalInterface i= new FunctionalInterface(){
            @Override
            public void sayHello(){
                System.out.println("Hi Buddy 2");
            }
        };
        i.sayHello();

        //3. Use lambda expression, no class file will be generated
        FunctionalInterface i4=()-> System.out.println("Inside lambda");
        i4.sayHello();
        


    }


}
