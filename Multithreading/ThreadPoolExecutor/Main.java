package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new CustomThreadFactory(),
                new CustomRejectedExecutionHandler());

        for (int i = 1; i <= 7; i++) {

            executor.submit(()->{
                try{
                    Thread.sleep(5000);
                } catch (InterruptedException _) {}
                System.out.println("Task processed by: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}

class CustomThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setPriority(5);
        thread.setDaemon(false);
        return thread;
    }
}

class CustomRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task rejected: "+r.toString());
    }
}
