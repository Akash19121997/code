package Stream.in28minutes;

import java.util.Arrays;
import java.util.List;

public class FindMinMax {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-1, 12, 3, 45, 23, -5, 100, 34, 56, 78);

        int max= numbers.stream().reduce(0,(x, y)-> x>y?x:y);
        System.out.println("Max: "+max);

        //if negative is also there
        int min=numbers.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println("Min: "+min);
    }
}
