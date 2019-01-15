package ua.net.azhytnytskyi.dao;

import java.util.List;

/**
Provides default CRUD methods to be implemented in realizations
 */
public interface AbstractDao<T> {
    void create(T t);
    void edit(T oldValue, T newValue);
    void delete(T t);
    T getElement(T t);
    List<T> getAll();
}
