package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(()->{
            try{
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName());
            } catch (Exception _){}
        });
        executorService.shutdown();
        try {
            // Main thread will wait for 2 sec
            boolean ans=executorService.awaitTermination(2, TimeUnit.SECONDS);
            System.out.println("Is terminated : " + ans);
        } catch (Exception _){}
        System.out.println("Exiting main thread");
    }
}
