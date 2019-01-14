package ua.net.azhytnytskyi.dao;

import ua.net.azhytnytskyi.model.Entry;

import java.util.List;

public interface AbstractDao<T> {

    public void create(T t);
    public void edit(T oldValue, T newValue);
    public void delete(T t);
    public Entry getElement(T t);
    public List<T> getAll();
}
