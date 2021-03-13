package com.solid;

public interface Repository<T> {
    void Insert(T entity);

    void Update(T entity);

    T Get(int id);

    void Delete(int id);
}