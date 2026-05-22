package Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinkedIn {

    public static void main(String[] args) {
//        1. Find duplicate elements from a list using Stream API.
        List<Integer> list = List.of(1,1,2,2,3,14);
        Map<Integer,Long> result = list.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(result);
//        2. Remove duplicates from a list.
        list.stream().distinct().forEach(System.out::print);
        System.out.println();
//        3. Find the frequency of each character in a string.
        String s = "akash";
        Map<String,Long> res= Arrays.stream(s.split("")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(res);
//        4. Find the first non-repeated character in a string.
//        5. Find the second highest number from a list.
        int ans = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(ans);
//        6. Find the highest salary employee from a list.
        List<Employee> employees = List.of(new Employee("Akash", 100),
                new Employee("Akash",50));

        Employee highest = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(highest);
//        7. Sort employees based on salary using Stream API.
        List<Employee> sotredEmp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(sotredEmp);
//        8. Group employees by department.
        Map<String, List<Employee>> gbn = employees.stream().collect(Collectors.groupingBy(Employee::getName));
        System.out.println(gbn);
//        9. Count employees in each department.
        Map<String, Long> count =employees.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
        System.out.println(count);
//        10. Convert a list of strings into uppercase.
        List<String> str = List.of("Akash","Rahul");
        str.stream().map(String::toUpperCase).forEach(System.out::println);
//        11. Filter even numbers from a list.
//
//        12. Filter odd numbers from a list.
//
//        13. Find numbers starting with 1 from a list.
        list.stream().distinct().map(String::valueOf).filter(e-> e.startsWith("1")).forEach(System.out::println);
        list.stream().distinct().filter(e -> String.valueOf(e).startsWith("1")).forEach(System.out::println);
//        14. Sort a list in ascending order.
        list.stream().sorted().forEach(System.out::println);
//        15. Sort a list in descending order.
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//        16. Merge two unsorted arrays into a single sorted array.
        int[] arr1 = {5, 2, 9, 1};
        int[] arr2 = {8,3,7,4};
        IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().forEach(System.out::print);
        System.out.println();
//        17. Find common elements between two lists.
        List<Integer> l1 = Arrays.asList(1,1,2,3,4);
        List<Integer> l2 = Arrays.asList(4,1,3,9);
        l1.stream().filter(l2::contains).distinct().forEach(System.out::println);
//        18. Reverse each word using Stream API.
        String r = "Hello Akashhh";
        String rev= Arrays.stream(r.split(" ")).map(e -> new StringBuilder(e).reverse().toString())
                .reduce((a,b) -> a + " " + b).get();
        System.out.println(rev);
//        19. Count the occurrence of each word in a sentence.
        Map<String, Long> word = Arrays.stream(r.split(" ")).collect(Collectors.groupingBy(w->w, Collectors.counting()));
        System.out.println(word);
//        20. Find the longest string in a list.
        String mx= List.of(r.split(" ")).stream().max(Comparator.comparing(String::length)).get();
        System.out.println(mx);
//        21. Find the shortest string in a list.
//
//        22. Convert List<String> to Map<String, Integer>.
//
//        23. Find the total salary of all employees.
        int sum =  employees.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(sum);
//        24. Find average salary department-wise.
//
//        25. Partition employees based on salary greater than 50k.
//
//        26. Find max and min numbers using Stream API.
//
//        27. Check whether a list is empty using Optional.
//
//        28. Convert List<Integer> to int[].
//
//        29. Flatten a nested list using flatMap().
//
//        30. Sort map based on values.
//
//        31. Find top 3 highest numbers from a list.
//
//        32. Skip first 5 elements from a stream.
//
//        33. Find duplicate characters in a string.
//
//        34. Join list elements using Collectors.joining().
//
//        35. Find all palindromes from a list.
//
//        36. Find the sum of all numbers using reduce().
//
//        37. Convert list into comma-separated string.
//
//        38. Find employee names whose salary is greater than average salary.
//
//        39. Find department having maximum employees.
//
//        40. Find nth highest salary using Stream API.

    }

    public static class Employee{
        String name;
        int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }
}
