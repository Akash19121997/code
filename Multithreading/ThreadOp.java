package Multithreading;

public class ThreadOp extends Thread{

    public void run() {
        System.out.println("User defined thread is running.. - "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Program started..");
        int x= 65+32;
        System.out.println("Sum is :"+x);
        System.out.println("Current running name is "+Thread.currentThread().getName());
        try{
        Thread.sleep(2000);}
        catch(InterruptedException e) {
            e.printStackTrace();
        }

        ThreadOp threadOp = new ThreadOp();
        threadOp.start();

        System.out.println("Current thread id : "+Thread.currentThread().getId());
        System.out.println("Program ended..");
    }
}
