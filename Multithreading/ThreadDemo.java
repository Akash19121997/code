package Multithreading;

public class ThreadDemo extends Thread{

    public void run() {
        for(int i=10;i>=1;i--) {
            System.out.print(i+" ");
            try{
                Thread.sleep(2000); // wait for 1000 ms
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();

        //We never call run method directly. We just call start method. Start method will notify the scheduler
        //that this thread is ready to run and when scheduler wants it, it will pick and call the run method of this thread.

        //If you are extending behavior of thread class then only go for extending thread, but consider there are few classes
        //where I want to extend the behavior of thread class and I just want to run the functionality of thread, in that case
        //go for  implementing runnable interface


        //getName() method is used to get the name of the thread
        //setName() method is used to set the name of the thread
        //run() method is used to perform the task of the thread
        //start() method is used to start the thread by allocating resources
        //getId() method is used to get the id of the thread
        //setPriority() method is used to set the priority of the thread
        //getPriority() method is used to get the priority of the thread
        //sleep() method is used to pause the thread for a specified time
        //join() method is used to pause the thread until the specified thread is dead
        //yield() method is used to pause the current executing thread to give a chance to remaining waiting threads of the same priority
        //interrupt() method is used to interrupt the thread
        //isInterrupted() method is used to check whether the thread is interrupted or not
        //currentThread() method is used to get the reference of the current thread
        //isAlive() method is used to check whether the thread is alive or not
        //suspend() method is used to pause the thread
        //resume() method is used to resume the thread
        //stop() method is used to stop the thread
    }
}
