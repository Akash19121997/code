package Multithreading;

public class ThreadDemo extends Thread{

    public void run() {
        System.out.println("Akash Das");
    }

    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        //We never call run method directly. We just call start method. Start method will notify the scheduler
        //that this thread is ready to run and when scheduler wants it, it will pick and call the run method of this thread.

        //If you are extending behavior of thread class then only go for extending thread, but consider there are few classes
        //where I want to extend the behavior of thread class and I just want to run the functionality of thread, in that case
        //go for  implementing runnable interface
    }
}
