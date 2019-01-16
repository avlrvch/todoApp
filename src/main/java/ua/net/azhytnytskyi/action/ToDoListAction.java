package ua.net.azhytnytskyi.action;

import com.opensymphony.xwork2.ActionSupport;
import ua.net.azhytnytskyi.model.ToDoEntry;
import ua.net.azhytnytskyi.service.ToDoEntryService;
import java.util.List;

/**
 * Provides methods and fields required to perform crud operations with ToDoEntry model
 */
public class ToDoListAction extends ActionSupport{

    private ToDoEntryService toDoEntryService = ToDoEntryService.INSTANCE;
    private List<ToDoEntry> toDoList = toDoEntryService.getAllToDoRecords();

    // TODO: 1/15/19 replace model var's with model driven behavior
    private String description;
    private ToDoEntry.Status status;
    private int id;
    private ToDoEntry.Status[] statuses = ToDoEntry.Status.values();

    /**
     * Default execute method
     * @return Success/Error
     */
    public String execute() {
        return SUCCESS;
    }

    /**
     * Creates new to do entry
     * @return Success/Error
     */
    public String add(){
        if(!description.equals("")){
            toDoEntryService.addToDoRecord(description);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    /**
     * Saves the to do entry by passed id, description and status
     * @return Success/Error
     */
    public String save(){
        if(!description.equals("")){
            toDoEntryService.saveToDo(id, description, status);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    /**
     * Deletes to do entry by passed params
     * To be implemented
     * TODO: 1/16/19 implement method and establish binding with jsp
     * @return
     */
    public String delete(){
        return SUCCESS;
    }

    public List getToDoList() {
        return toDoList;
    }

    public void setToDoList(List toDoList) {
        this.toDoList = toDoList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ToDoEntry.Status getStatus() {
        return status;
    }

    public void setStatus(ToDoEntry.Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ToDoEntry.Status[] getStatuses() {
        return statuses;
    }

    public void setStatuses(ToDoEntry.Status[] statuses) {
        this.statuses = statuses;
    }
}
