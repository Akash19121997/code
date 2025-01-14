package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeWithoutStream {
    public static void main(String[] args){
        //Without using streams
        //Create a list and filter all even numbers

        List<Integer> data= new ArrayList<>();

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);

        for(int i : data){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        //
        //Using streams

        Stream<Integer> stream = data.stream();
        List<Integer> evenList = stream.filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        //More advanced code in one line
        List<Integer> moreAdvanced = data.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(moreAdvanced);

        //Greater that 1
        System.out.println(data.stream().filter(i -> i>1).collect(Collectors.toList()));

    }
}
