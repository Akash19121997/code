package Multithreading.Lock.SemaphoreLockDemo;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.produce();
        });
        Thread t2 = new Thread(() -> {
            sharedResource.produce();
        });
        Thread t3 = new Thread(() -> {
            sharedResource.produce();
        });
        t1.start();
        t2.start();
        t3.start();

        //after 1 and 2 release lock, 3rd will start
    }
}
