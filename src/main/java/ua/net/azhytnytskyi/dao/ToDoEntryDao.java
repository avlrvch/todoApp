package ua.net.azhytnytskyi.dao;

import ua.net.azhytnytskyi.model.ToDoEntry;

import java.util.ArrayList;
import java.util.List;

public class ToDoEntryDao implements AbstractDao<ToDoEntry> {

    private List<ToDoEntry> mockedDataList = new ArrayList<ToDoEntry>();

    public void create(ToDoEntry entry) {
        mockedDataList.add(entry);
    }

    public void edit(ToDoEntry oldValue, ToDoEntry newValue) {
        mockedDataList.set(mockedDataList.indexOf(oldValue), newValue);
    }

    public void delete(ToDoEntry entry) {
        mockedDataList.remove(entry);
    }

    public ToDoEntry getElement(ToDoEntry entry) {
        return mockedDataList.get(mockedDataList.indexOf(entry));
    }

    public List<ToDoEntry> getAll() {
        return mockedDataList;
    }
}
