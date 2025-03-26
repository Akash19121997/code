package Multithreading.ProducerConsumerProblem;

public class Consumer extends Thread{

        Company c;
        Consumer(Company c){
            this.c = c;
        }

        public void run(){
            while (true) {
                c.consumeItem();
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                } ;
            }
        }
}
