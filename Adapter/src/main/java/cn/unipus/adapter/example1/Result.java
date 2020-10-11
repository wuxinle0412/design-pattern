package cn.unipus.adapter.example1;

@FunctionalInterface
public interface Result<T>{
    T get(Runnable task);
}
