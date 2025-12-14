package Multithreading.Lock.ReadWriteLockDemo;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Thread thread1 = new Thread(() -> {
            SharedResource s1 = new SharedResource();
            s1.produce(readWriteLock);
        });
        Thread thread2 = new Thread(() -> {
            SharedResource s2 = new SharedResource();
            s2.produce(readWriteLock);
        });
        Thread thread3 = new Thread(() -> {
            SharedResource s3 = new SharedResource();
            s3.consume(readWriteLock);
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
