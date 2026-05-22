package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LargestString {
    public static void main(String[] args){
        String arr[] = {"Akash", "Rajesh", "Priyanka Das"};
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.length()<arr[i].length())
                largest = arr[i];
        }
        System.out.println(largest);
        String result = Stream.of(arr).max(Comparator.comparing(String::length)).get();
        System.out.println(result);
        System.out.println(Arrays.stream(arr).reduce(arr[0],(a,b) -> a.length() > b.length() ? a:b));
    }
}
