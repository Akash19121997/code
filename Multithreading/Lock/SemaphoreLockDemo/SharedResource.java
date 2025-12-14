package Multithreading.Lock.SemaphoreLockDemo;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailabe =false;
    Semaphore lock = new Semaphore(2);

    public void produce(){

        try{
            lock.acquire();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            isAvailabe=true;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        finally {
            lock.release();
            System.out.println("Lock released by " + Thread.currentThread().getName());
        }
    }
}
