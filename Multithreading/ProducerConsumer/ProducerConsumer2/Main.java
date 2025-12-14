package Multithreading.ProducerConsumer.ProducerConsumer2;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(() ->{
            System.out.println("Producer thread : " + Thread.currentThread().getName());
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            sharedResource.addItem();
        });
        Thread t2 = new Thread(() ->{
            System.out.println("Consumer thread : " + Thread.currentThread().getName());
            sharedResource.consumeItem();
        });
        t1.start();
        t2.start();
    }
}
