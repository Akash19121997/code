package Multithreading.ProducerConsumer.ProducerConsumer3;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> queue;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.bufferSize = bufferSize;
        this.queue = new LinkedList<>();
    }

    public synchronized void produce(int item) {
        //System.out.println("Inside Producer Function : "+Thread.currentThread().getName());
        //if size == buffer size, wait
        while (queue.size() == bufferSize) {
            try{
                System.out.println("Buffer is full, waiting for consumer to consume item");
                wait();
            } catch (InterruptedException e) {}
        }
        queue.add(item);
        System.out.println("Produced : "+item);
        notify();
    }

    public synchronized int consume() {
        //System.out.println("Inside Consumer Function : "+Thread.currentThread().getName());
        while (queue.isEmpty()) {
            try{
                System.out.println("Buffer is empty, waiting for producer to produce item");
                wait();
            } catch (InterruptedException e) {}
        }
        int item = queue.poll();
        System.out.println("Consumed : "+item);
        notify();
        return item;
    }
}
