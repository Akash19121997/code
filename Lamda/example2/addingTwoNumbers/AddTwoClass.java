package Lamda.example2.addingTwoNumbers;

public class AddTwoClass {

    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers=(a,b)->a+b;
        System.out.println(addTwoNumbers.add(5,6));

    }
}
