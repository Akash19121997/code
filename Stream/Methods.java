package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Methods {
    public static void main(String[] args) {

        List<String> cities = List.of("Pune", "Kolkata", "Delhi","Mumbai", "Punjab");

        //Filter out element whose name start with P
        List<String> pCities = cities.stream().filter(i -> i.startsWith("P")).collect(Collectors.toList());
        pCities.forEach(System.out::println);

        //Square the list
        List<Integer> number =List.of(11,2,3,4,5,6,7,8,9);
        number.stream().map(i -> i*i).forEach(i -> System.out.print(i + " "));

        //Sorted

        number.stream().sorted().forEach(System.out::print);

        //Comparator
        System.out.println(number.stream().max(Comparator.naturalOrder()).get());
    }
}
