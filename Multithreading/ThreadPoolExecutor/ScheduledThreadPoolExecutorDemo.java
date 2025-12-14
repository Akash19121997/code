package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(5);

        scheduledThreadPoolExecutor.schedule(()->{
            System.out.println(Thread.currentThread().getName());
        }, 3, TimeUnit.SECONDS);

        //It will start after 5 sec and then after 2 sec it will keep on running till we call cancel
        scheduledThreadPoolExecutor.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getName());
        }, 5, 2, TimeUnit.SECONDS);

        Thread.sleep(10000);
        scheduledThreadPoolExecutor.shutdown();

        System.out.println("Main thread exit");
    }
}
