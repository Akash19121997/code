package Multithreading.Lock.ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;
// Here different objects, still our custom locking will work. It doesn't depend on synchronization now.
// It depends on custom lock. Here it will work only on same lock object.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() ->{
            SharedResource sharedResource1 = new SharedResource();
            sharedResource1.produce(lock);
        });
        Thread t2 = new Thread(() ->{
            SharedResource sharedResource2 = new SharedResource();
            sharedResource2.produce(lock);
        });
        t1.start();
        t2.start();
    }
}
