package Stream.interview;

import java.util.Arrays;
import java.util.List;

public class Question1 {

    //Print a list using lamda expression
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.forEach(e -> System.out.println(e));
    }
}
