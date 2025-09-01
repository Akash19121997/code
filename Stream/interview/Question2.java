package Stream.interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Even number, max value, list of string to uppercase, sum
public class Question2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,2,6,7,8,9);
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        //max
        int max= numbers.stream().max(Integer::compare).get();
        max = numbers.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println("max ="+max);

        //list of string to uppercase
        List<String> names = Arrays.asList("Akash","John","Jane","Doe");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //group string to their length by groupingBy
        Map<Integer, List<String>> len= names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(len);

        //sum using reduce
        int sum= numbers.stream().reduce(0, (x,y) -> x+y);
        System.out.println("sum="+sum);

        int sum2 = numbers.stream().collect(Collectors.summingInt(x -> x));
        System.out.println("sum2="+sum2);

        int sum3 = numbers.stream().mapToInt(x -> x).sum();
        System.out.println("sum3="+sum3);

        // Cont word occurance
        Map<String, Long> count= names.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting() ));
        System.out.println("count="+count);

        //Concatinate strings using joining
        String s= names.stream().collect(Collectors.joining(" "));
        System.out.println("s="+s);

        //Sort Product by price
        List<Product> products = List.of(new Product("TV","Electronics",50000),
                new Product("Fridge","Electronics",50000),
                new Product("Levis","Dress",900),
                new Product("Mobile","Electronics",60000),
                new Product("Being Human","Dress",499)
        );

        Comparator<Product> c = Comparator.comparing(Product::getPrice).reversed();
        List<Product> sortedProductBySalary = products.stream().sorted(c).toList();
        System.out.println("sortedProductBySalary="+sortedProductBySalary);

        //remove duplicates
        numbers.stream().distinct().forEach(System.out::println);

        //find all elements starting with J
        names.stream().filter(e -> e.startsWith("J")).forEach(System.out::println);

        //sort string alphabetically in reverse order
        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //partition even and odd
        Map< Boolean, List<Integer>> m = numbers.stream().collect(Collectors.partitioningBy(e -> e%2==0));
        System.out.println("m="+m);

        //find second largest
        int secondLargest = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondLargest="+secondLargest);

        //find average
        OptionalDouble average = numbers.stream().mapToInt(x -> x).average();
        System.out.println("average="+average);

        // count occurance of each word in a sentense
        String se = "Java is very fun Java is very good";
        List<String> sen = Arrays.asList(se.split(" "));
        Map<String, Long> countWord = sen.stream().collect(Collectors.groupingBy(w -> w ,Collectors.counting()));
        System.out.println("countWord="+countWord);

        //Combile List<List> into a single list

        List<List<String>> skills = Arrays.asList(
                Arrays.asList("Java", "Spring", "Spring Boot"),
                Arrays.asList("React", "AngularJS", "Java Script"),
                Arrays.asList("MySQL", "PostgresSQL", "Oracle")
        );

        List<String> list = skills.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        list.forEach(System.out::println);

        list.stream().filter(e -> e.startsWith("S")).forEach(System.out::println);






    }
}
