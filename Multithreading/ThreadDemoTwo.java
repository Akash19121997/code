package Multithreading;

public class ThreadDemoTwo implements Runnable {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.print(i+" ");
            try{
                Thread.sleep(1000); // wait for 1000 ms
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ThreadDemoTwo threadDemoTwo = new ThreadDemoTwo();
        Thread thread = new Thread(threadDemoTwo);
        ThreadDemo threadDemo = new ThreadDemo();
        thread.start();
        threadDemo.start();
    } 
}
