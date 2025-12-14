package Multithreading.ProducerConsumer.ProducerConsumerProblem;

public class Company {

    int n;
    boolean f=false;
    // f=false: chance: producer
    // f=true: chance: consumer

    synchronized public void produceItem(int n){
        if(f){
            try{wait();} catch(Exception _){};
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }
    synchronized public void consumeItem(){
        if(!f){
            try{wait();} catch(Exception _){};
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
    }

    //syncronized keyword is used to make sure that only one thread can access the method at a time
}
