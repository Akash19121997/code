package Multithreading;

public class MonitorLockExample {
    public synchronized void task1()  {
        try{
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task completed");
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void task2(){
        System.out.println("Inside task 2, but before synchronization");
        synchronized(this){
            System.out.println("task 2, inside synchronization");
        }
    }
    public void task3(){
        System.out.println("Inside task 3");
    }

    public static void main(String[] args) {
        MonitorLockExample obj = new MonitorLockExample();
        Thread t1 = new Thread(obj::task1);
        Thread t2 = new Thread(obj::task2);
        Thread t3 = new Thread(obj::task3);
        t1.start();
        t2.start();
        t3.start();
    }
}
