package Multithreading;

public class Join {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e) {}
            System.out.println("Thread work done");
        });
        t1.start();
        t1.join();
        System.out.println("Exiting main thread");

        // Without join, main thread will exit, dont wait for t1 to finish it's work.
        // Output without join :
//        Exiting main thread
//        Thread work done
        //Output with join :
//        Thread work done
//        Exiting main thread

    }


}
