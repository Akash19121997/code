package practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CogniPractice {



    public static void main(String[] args) {

        List<Integer> list = List.of(-1,1, 2, 3, 4, 5);
        int sum = list.stream().reduce(0,(a,b)-> a+b);
        System.out.println("Sum of all numbers : "+sum);

        //Write a Java 8 program to square the list of numbers and then filter out the
        //numbers greater than 5 and then find the average of the remaining numbers

        Double average = list.stream().map(x -> x*x).filter(x -> x>5).mapToInt(x -> x).average().getAsDouble();
        System.out.println("Average of all numbers : "+average);

        Double avreage2=list.stream().map(x-> x*x).filter(x -> x>5).collect(Collectors.averagingInt(x -> x));
        System.out.println("Average of all numbers : "+avreage2);

        System.out.println("max = "+list.stream().reduce(0,(a,b)->a>b?a:b));
        System.out.println("min = "+list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b));

        List<List<String>> Names = Arrays.asList(Arrays.asList("Saket", "Trevor"), Arrays.asList("Saket", "Trevor"), Arrays.asList("Saket", "Trevor"));

        Names.stream().flatMap(x -> x.stream()).filter(x -> x.startsWith("S")).forEach(System.out::println);
    }
}
