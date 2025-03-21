import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class temp {

    public static void main(String[] args) {


        int a[] = {4,5,5,5,4,6,6,9,4};

        Set<Integer> set = new HashSet<>();

        for(int i : a){
            set.add(i);
        }
        set.forEach(System.out::println);




    }
}
