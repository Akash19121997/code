package Collection;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap();
        hm.put(1,"Akash");
        hm.put(2,"Pooja");
        hm.put(3,"Ravi");

        System.out.println(hm.put(1,"Mohan"));// with 1 value will be replaced , and old value Akash will be printed

        //to check if key present
        if(hm.containsKey(2)){
            System.out.println("Key Present");
        }
        //check if value present
        if(hm.containsValue("Ravi")){
            System.out.println("Value Present");
        }

        //traversing through EntrySet
        for(HashMap.Entry<Integer,String> entry : hm.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //remove
        hm.remove(1);

        System.out.println("---------------------");
        //traversing through keyset
        Set<Integer> set = hm.keySet();
        for(Integer key : set){
            System.out.println(key + " : " + hm.get(key));
        }
    }
}
