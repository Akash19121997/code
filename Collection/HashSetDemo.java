package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(1); ///// HashSet will not allow duplicates.Unordered set

        //check if value present or not
        if(hs.contains(3)){
            System.out.println("Value present");
        }

        //Iterating hashset through enhanced for loop
        for(Integer i : hs){
            System.out.println(i);
        }

        //Iterating through iterator
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
