package Multithreading;

public class ThreadRunnable implements Runnable {

    public void run() {
        System.out.println("Thread running..." + Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread running..." + Thread.currentThread().getName());
        ThreadRunnable t1 = new ThreadRunnable();
        Thread thread1 = new Thread(t1);
        thread1.start();
        System.out.println("Exiting..." + Thread.currentThread().getName());

    }
}
