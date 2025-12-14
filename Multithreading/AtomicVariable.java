package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {

    int counter1;
    AtomicInteger counter2 = new AtomicInteger(0);

    public void setCounter1(){
        counter1++;
    }
    public void setCounter2(){
        counter2.incrementAndGet(); // here CAS operation happening
    }
    public int getCounter1(){
        return counter1;
    }
    public int getCounter2(){
        return counter2.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicVariable atomicVariable = new AtomicVariable();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                atomicVariable.setCounter1();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                atomicVariable.setCounter1();
            }
        });
        Thread t3 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                atomicVariable.setCounter2();
            }
        });
        Thread t4 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                atomicVariable.setCounter2();
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(atomicVariable.getCounter1());
        System.out.println(atomicVariable.getCounter2());
    }
}
