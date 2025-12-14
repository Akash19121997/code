package Multithreading.ProducerConsumer.ProducerConsumer2;

public class SharedResource {

    boolean itemAdded=false;

    //synchronized put the method lock
    public synchronized void addItem() {
        itemAdded=true;
        System.out.println("Item Added By" + Thread.currentThread().getName());
        notifyAll();
    }
    public synchronized void consumeItem() {
        System.out.println("Consumed Item method invoked by" + Thread.currentThread().getName());
        // using while loop, because sometimes wake up executed due to system noise
        while(!itemAdded) {
            try{
                System.out.println("Waiting for Item to be consumed");
                wait(); // It releases the lock
                }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Item Consumed By" + Thread.currentThread().getName());
        itemAdded=false;
    }

}
