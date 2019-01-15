package ua.net.azhytnytskyi.service;

import ua.net.azhytnytskyi.dao.ToDoEntryDao;
import ua.net.azhytnytskyi.model.ToDoEntry;

import java.util.List;

/**
 * Provides service layer methods to work with dao layer
 */
public class ToDoEntryService {

    // TODO: 1/15/19 replace singleton usage with EJB annotations
    public static final ToDoEntryService INSTANCE = new ToDoEntryService();

    private ToDoEntryService() {
    }

    private ToDoEntryDao toDoEntryDao = new ToDoEntryDao();

    public List<ToDoEntry> getAllToDoRecords(){
        return toDoEntryDao.getAll();
    }

    public void addToDoRecord(String description){
        toDoEntryDao.create(new ToDoEntry(description));
    }

    public void saveToDo(int id, String description, ToDoEntry.Status status) {
        List<ToDoEntry> allToDos = getAllToDoRecords();
        for (ToDoEntry toDo : allToDos){
            if (toDo.getId() == id){
                toDo.setStatus(status);
                toDo.setDescription(description);

            }
        }
    }
}
