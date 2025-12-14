package Multithreading.Lock.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            System.out.println("Produce Lock acquired by " + Thread.currentThread().getName());
            if (isAvailable) {
                System.out.println("Produce thread is waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();
        } catch (Exception _) {

        } finally {
            lock.unlock();
            System.out.println("Produce Lock released by " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        try {
            Thread.sleep(1000);
            lock.lock();
            System.out.println("Consume Lock acquired by " + Thread.currentThread().getName());
            if (!isAvailable) {
                System.out.println("Consume thread waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signal();
        } catch (Exception _) {
        }
        finally {
            lock.unlock();
            System.out.println("Consume Lock released by " + Thread.currentThread().getName());
        }

    }
}
