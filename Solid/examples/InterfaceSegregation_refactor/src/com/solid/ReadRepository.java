package com.solid;

public interface ReadRepository<T> {
    T Get(int id);
}
