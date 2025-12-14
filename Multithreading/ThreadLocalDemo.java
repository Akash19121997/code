package Multithreading;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<>();

        threadLocal.set(Thread.currentThread().getName());

        Thread thread=new Thread(()->{
            threadLocal.set(Thread.currentThread().getName());
            System.out.println("Task 1");
            System.out.println("Thread Name : " + threadLocal.get());
            // After task completed, remember to clean up
            threadLocal.remove();
        });
        thread.start();
        try{
            Thread.sleep(2000);
        } catch (Exception _){}

        System.out.println("Thread Name : "+threadLocal.get());
    }
}
