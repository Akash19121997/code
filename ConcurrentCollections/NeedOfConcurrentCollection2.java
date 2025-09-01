package ConcurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NeedOfConcurrentCollection2 extends Thread{

    static List<String> list = new ArrayList();
    public void run() {
        System.out.println("Inside "+ Thread.currentThread().getName() + " thread");
        try{Thread.sleep(3000);}
        catch(Exception e){
            e.printStackTrace();
        }
        list.add("D");
    }

    public static void main(String[] args) {
        list.add("A");
        list.add("B");
        list.add("C");
        NeedOfConcurrentCollection2 child = new NeedOfConcurrentCollection2();
        child.setName("Child");
        child.start();
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = (String)iterator.next();
            System.out.println("Inside "+ Thread.currentThread().getName() + " thread");
            System.out.println("element = "+element);
            try{Thread.sleep(2000);}
            catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
