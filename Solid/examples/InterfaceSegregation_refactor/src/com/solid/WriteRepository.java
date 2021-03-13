package com.solid;

public interface WriteRepository<T> {

    void Delete(int id);

    T Update(int id);

    void Insert(T entity);
}
