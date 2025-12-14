package Multithreading;

public class DaemonThread {
    // Daemon threads in java is a service provider threat that provides services to user threads. It's lifecycle depends on user threads.

    // Garbage collector is best example of daemon thread -> Whenever a normal thread runs, in background garbage collector also runs and clears unused memory so that
    // other threads can run smoothly.

    //setDaemon(Boolean) method is used to set the thread as daemon thread. If we don't set the thread as daemon thread then it will be considered as user thread.
    //isDaemon() method is used to check whether the thread is daemon thread or not.
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.print(i+ " ");
            }
        });
        thread.setDaemon(true);
        thread.start(); // here it wont work because user thread which is main thread will end faster.
        //As per daemon thread, it's lifecycle depends on user thread

        System.out.println("Exiting main thread");
    }
}
