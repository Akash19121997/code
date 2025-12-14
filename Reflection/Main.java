package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Tommy", 20);
        // Reflection to get all details
        Class<?> myClass = myCat.getClass();
        // Get Class Name with package
        System.out.println(myClass.getName());
        // Get only class name
        System.out.println(myClass.getSimpleName());
        //get Declared Field
        System.out.println(Arrays.toString(myClass.getDeclaredFields()));
        // Change private method to public
        Method[] myMethods = myClass.getDeclaredMethods();
        for (Method myMethod : myMethods) {
            if (myMethod.getName().equals("printNameInCaps")) {
                myMethod.setAccessible(true);
                myMethod.invoke(myCat);
            }
        }

    }
}
