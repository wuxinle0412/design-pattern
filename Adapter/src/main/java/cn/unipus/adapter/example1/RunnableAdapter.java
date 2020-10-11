package cn.unipus.adapter.example1;

import java.util.concurrent.Callable;

/*
*   模拟jdk中Runnable接口与Callable接口之间的适配
*
*   Target: Callable接口
*   Adapter: RunnableAdapter适配Runnable接口与Callable接口
*   Adaptee: Runnable接口，作为被适配的角色。
* */
public class RunnableAdapter<T> implements Callable<T> {

    private Runnable task;
    private Result<T> result;

    private RunnableAdapter(Runnable task, Result<T> result) {
        this.task = task;
        this.result = result;
    }

    public T call() throws Exception {
        if (this.task != null) {
            this.task.run();
            return this.result.get(task);
        }
        return null;
    }

    public static <T> RunnableAdapter<T> adapter(Runnable task, Result<T> result) {
        return new RunnableAdapter<>(task, result);
    }
}
