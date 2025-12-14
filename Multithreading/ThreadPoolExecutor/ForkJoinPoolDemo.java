package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        //submit -> task goes to submission queue
        Future<Integer> futureObj = forkJoinPool.submit(new ComputeSumTask(0,100));
        System.out.println(futureObj.get());
    }
}

class ComputeSumTask extends RecursiveTask<Integer> {

    int start;
    int end;
    public ComputeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if(end - start <=4){
            int totalSum = 0;
            for (int i = start; i <= end; i++) {
                totalSum += i;
            }
            return totalSum;
        }
        else{
            //Split the task
            int middle = (start + end) / 2;
            ComputeSumTask left = new ComputeSumTask(start, middle);
            ComputeSumTask right = new ComputeSumTask(middle + 1, end);

            //Fork the task for parallel execution, means we are putting task in to work stealing queue
            left.fork();
            right.fork();

            //Combine the result of subtasks, wait for above task to get complete using join
            int leftResult = left.join();
            int rightResult = right.join();

            //Combine the result
            return leftResult + rightResult;
        }
    }
}
