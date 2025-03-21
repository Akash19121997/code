package Lamda;


import java.util.List;

public class example4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //list.stream().filter(e -> e%2==0).forEach(System.out::println);

        List<String> courses = List.of("Java", "C#", "Spring MVC", "Python", "Spring Boot");

        //courses.stream().forEach(System.out::println);

        //courses.stream().filter(x ->x.contains("Spring")).forEach(System.out::println);

        //courses.stream().filter(x -> x.length() > 4).forEach(System.out::println);

        //list.stream().filter(e -> e%2==0).map(e -> e*e).forEach(System.out::println);

        courses.stream().map(String::length).forEach(System.out::println);





    }
}
