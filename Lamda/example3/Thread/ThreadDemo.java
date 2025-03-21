package Lamda.example3.Thread;

import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) {


        //1st Thread
        Runnable thread1 = ()->{
            //Body of the thread which is run method
            for (int i = 1; i < 10; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(thread1);
        t1.setName("Akash");
        t1.start();
        Runnable thread2 = ()->{
            for (int i = 20; i <30 ; i++) {
                System.out.println(i);
            }
        };
        thread2.run();
    }
}
