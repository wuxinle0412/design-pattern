package org.example.adapter.example1;

@FunctionalInterface
public interface Result<T>{
    T get(Runnable task);
}
