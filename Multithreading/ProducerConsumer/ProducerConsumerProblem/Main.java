package Multithreading.ProducerConsumer.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer producer = new Producer(comp);
        Consumer consumer = new Consumer(comp);
        producer.start();
        consumer.start();
    }
}
