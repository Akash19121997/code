package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.*;

public class CompatableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try{
                System.out.println("Thread Name of SupplyAsync : " + Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception _){}
            return "Coding ";
        }, executor).thenApply( (x) -> { // same thread will execute this task after finishing previous task
            System.out.println("Thread Name of thenApply : " + Thread.currentThread().getName());
            return x + "and ";
        }).thenApplyAsync(x -> { // diff thread will execute this task
            System.out.println("Thread Name of thenApplyAsync1 : " + Thread.currentThread().getName());
            return x + "Concept";
        }, executor).thenApplyAsync(x -> {
            System.out.println("Thread Name of thenApplyAsync2 : " + Thread.currentThread().getName());
            return x + " Akash";
        },executor);

        try {
            System.out.println(completableFuture.get());
        }
        catch (Exception _) {}

        CompletableFuture<Integer> c1 = CompletableFuture.supplyAsync(()-> 10);
        CompletableFuture<String> c2 = CompletableFuture.supplyAsync(()-> "Akash");
        CompletableFuture<String> c3 = c1.thenCombine(c2, (a, b)->a+b);
        System.out.println(c3.get());

        executor.shutdown();


    }
}
