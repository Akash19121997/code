package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamOpject {
    public static void main(String[] args) {

        //1. Enpty Stream
        Stream<Object> emptyStream = Stream.empty();

        //2. Arrays
        String[] name = {"Akash", "Ravi", "Somesh", "Rahul", "Dhoni"};
        Stream<String> stream1= Arrays.stream(name);
        stream1.forEach(i-> System.out.println(i));
        Arrays.stream(name).forEach(System.out::println);

        //3. Builder Pattern
        Stream<Object> streamBuilder = Stream.builder().build();

        //4. Using collection object
    }
}
