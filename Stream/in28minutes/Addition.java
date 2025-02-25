package Stream.in28minutes;

import java.util.Arrays;
import java.util.List;

public class Addition {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Adding all numbers
        //way 1
        int sum=number.stream().reduce(0, Addition::sum);
        System.out.println("Sum of all numbers : "+sum);

        //way 2
        int sum2=number.stream().reduce(0, (a,b)->a+b);
        System.out.println("Sum of all numbers : "+sum2);
    }

    //way 1
    public static int sum(int aggregate, int nextNumber){
        return aggregate+nextNumber;
    }
}
