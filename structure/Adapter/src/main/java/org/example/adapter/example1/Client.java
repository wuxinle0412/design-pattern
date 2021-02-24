package org.example.adapter.example1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable task = () -> {
            System.out.println("runnable to callable");
        };

        Result<Integer> result = (t) -> {
            return 0;
        };

        Callable<Integer> callable = RunnableAdapter.adapter(task, result);

        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread t1 = new Thread(futureTask, "t1");
        t1.start();
        Integer integer = futureTask.get();

        System.out.println("result: " + integer);
    }
}
