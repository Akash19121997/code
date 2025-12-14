package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj =executor.submit(()->{
            try{Thread.sleep(3000);
                System.out.println("This is the task, which thread will execute");
            } catch (Exception e) {
            }

        });

        Future<?> callableObj =executor.submit(()->{
            System.out.println("This is the callable task, which thread will execute");
            return 5;
        });

        executor.shutdown();

        //System.out.println("Get : " + futureObj.get(1,TimeUnit.SECONDS));
        System.out.println("Get : " + futureObj.get());  // like join() Calling thread will wait for child thread to complete it's task
        System.out.println("Cancel : " + futureObj.cancel(true)); // to cancel the task
        System.out.println("Is done : " + futureObj.isDone());// whether task completed or not
        System.out.println("Is cancelled : " + futureObj.isCancelled());
        System.out.println("Callable get : " + callableObj.get());// Callable is just like runnable, diff is return a value. That's why ? in future


    }
}
