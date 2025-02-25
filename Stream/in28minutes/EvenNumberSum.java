package Stream.in28minutes;

import java.util.Arrays;
import java.util.List;

public class EvenNumberSum {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int sum=numbers.stream().filter(e-> e%2==0).map(e-> e*e).reduce(0, (x,y) ->x+y);
        System.out.println(sum);

        int cubeSum= numbers.stream().map(e -> e*e*e).reduce(0,(a,b)->a+b);
        System.out.println(cubeSum);
    }
}
