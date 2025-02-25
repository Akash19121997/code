package Stream.in28minutes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctAndSorted {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8);

        List<Integer> result=numbers.stream().distinct().collect(Collectors.toList());
        //result.forEach(System.out::println);

        List<Integer> unsortedNumbers = Arrays.asList(5,1,4,8,2,-1);
        unsortedNumbers.stream().sorted().forEach(System.out::println);
    }


}
