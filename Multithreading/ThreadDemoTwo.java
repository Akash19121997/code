package Multithreading;

public class ThreadDemoTwo implements Runnable {
    public void run() {
        System.out.println("Akash Das");
    }
    public static void main(String[] args) {
        ThreadDemoTwo threadDemoTwo = new ThreadDemoTwo();
        Thread thread = new Thread(threadDemoTwo);
        thread.start();
    }
}
