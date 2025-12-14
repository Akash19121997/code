package Multithreading.Lock.ReadWriteLockDemo;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailabe = false;

    public void produce(ReadWriteLock lock) {
        try{
            lock.readLock().lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            isAvailabe = true;
            Thread.sleep(8000);
        } catch (Exception e) {
        }
        finally {
            System.out.println("Lock removed by " + Thread.currentThread().getName());
            lock.readLock().unlock();
        }
    }

    public void consume(ReadWriteLock lock) {
        try{
            lock.writeLock().lock();
            System.out.println("Lock acquired by " + Thread.currentThread().getName());
            isAvailabe = false;

        }
        catch (Exception e) {}
        finally {
            System.out.println("Lock removed by " + Thread.currentThread().getName());
            lock.writeLock().unlock();
        }
    }
}
