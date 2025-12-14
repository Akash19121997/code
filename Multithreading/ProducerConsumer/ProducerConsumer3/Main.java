package Multithreading.ProducerConsumer.ProducerConsumer3;

public class Main {
    //   Question:
    //   Two threads, a producer and a consumer, share a common, fixed-size buffer as a queue.
    //   The producer's job is to generate data and put it into the buffer, while the consumer's
    //   job is to consume the data from the buffer.
    //   The problem is to make sure that the producer won't produce data if the buffer is full,
    //   and the consumer won't consume data if the buffer is empty.
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);

        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 8; i++) {
                sharedResource.produce(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i < 7; i++) {
                sharedResource.consume();
            }
        });
        t1.start();
        t2.start();

    }
}
