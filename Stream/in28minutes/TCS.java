package Stream.in28minutes;

import java.util.Arrays;
import java.util.List;

public class TCS {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(10, 50, 90, 100, 140, 150, 170, 200);

        int result=number.stream().reduce(110,(a,b)->a-b<b?a:b);
        System.out.println(result);
    }
}
