package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MoreMethods {
    public static void main(String[] args) {
        //Flat Map
        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2,3,4,5,6,1,20,35,12),
                Arrays.asList(1,2,3,4,5,6,1,20,35,12),
                Arrays.asList(1,2,3,4,5,6,1,20,35,12),
                Arrays.asList(1,2,3,4,5,6,1,20,35,12));
        numbers.stream().forEach(System.out::println);
        numbers.stream().flatMap(x -> x.stream().map(i -> i+1)).distinct().forEach(x -> System.out.print(x + " "));
        System.out.println();
        numbers.stream().flatMap(x -> x.stream().map(i -> i+1)).distinct().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println();

        //MapToInt,MapToDouble -> work with primitive data type
        int arr[] = {1, 4,3,8,5,9};
        IntStream intStream = Arrays.stream(arr);
        intStream.mapToDouble(x -> x* 2L).forEach(System.out::println);

        //anyMatch -> return true if any value matches the condition
        System.out.println(Stream.of(1,2,3,4,5).anyMatch(num -> num%2==0));
        //allMatch -> return true if all values match the condition
        System.out.println(Stream.of(1,2,3,4,5).allMatch(num -> num%2==0));
        //noneMatch -> returns true when no value matches the condition
        System.out.println(Stream.of(1,2,3,4,5).noneMatch(num -> num > 10));
        //findFisst -> finds the 1st element of the stream
        //ex - find 3rd largest
        System.out.println(Stream.of(1,2,3,4,5).sorted(Comparator.reverseOrder()).skip(2).findFirst().get());
        //findAny will give any random element of the stream
        System.out.println(Stream.of(1,2,3,4,5,6).findAny().get());

        //parallelStream work concurrently
        long currentTime = System.currentTimeMillis();
        Stream.of(1,2,3,4,5,6,7,8,9,10).map(x -> x*x).forEach(System.out::println);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken : "+(endTime-currentTime));

        currentTime = System.currentTimeMillis();
        Stream.of(1,2,3,4,5,6,7,8,9,10).parallel().map(x -> x*x).forEach(System.out::println);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken : "+(endTime-currentTime));

        System.gc();

    }
}
