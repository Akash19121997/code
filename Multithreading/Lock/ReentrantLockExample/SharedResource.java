package Multithreading.Lock.ReentrantLockExample;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailabe = false;

    public void produce(ReentrantLock lock) {
        try {
            lock.lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            isAvailabe = true;
            Thread.sleep(4000);
        } catch (Exception e) {}
        finally {
            lock.unlock();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
}
