package Multithreading.ProducerConsumerProblem;

public class Company {

    int n;
    boolean f=false;
    // f=false: chance: producer
    // f=true: chance: consumer

    synchronized public void produceItem(int n){
        if(f){
            try{wait();} catch(Exception e){};
        }
        this.n = n;
        System.out.println("Produced: " + this.n);
        f = true;
        notify();
    }
    synchronized public int consumeItem(){
        if(!f){
            try{wait();} catch(Exception e){};
        }
        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }

    //syncronized keyword is used to make sure that only one thread can access the method at a time
}
