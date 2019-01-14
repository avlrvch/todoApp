package ua.net.azhytnytskyi.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import ua.net.azhytnytskyi.model.ToDoEntry;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class ToDoListAction extends ActionSupport {

    public List<ToDoEntry> toDoList = new ArrayList();
    public List<String> statusL = new ArrayList();

//    private ToDoEntry toDoEntry;

    ToDoEntry td1 = new ToDoEntry("task1");
    ToDoEntry td2 = new ToDoEntry("task2");
    {
        td2.setStatus(ToDoEntry.Status.DONE);
        toDoList.add(td1);
        toDoList.add(td2);

        statusL.add("In Progress");
        statusL.add("Done");
    }

    public String add(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String description = request.getParameter("description");
        if(!description.equals("")){
            ToDoEntry toDoEntry = new ToDoEntry(description);
            toDoList.add(toDoEntry);
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String delete(){
        HttpServletRequest request = ServletActionContext.getRequest();
        String description = request.getParameter("description");
        System.out.println(description);
        for(ToDoEntry toDoEntry : toDoList){
            if(toDoEntry.getDescription() == description){
                toDoList.remove(toDoEntry);
            }
        }
        return SUCCESS;
    }
    public String execute() {
        return SUCCESS;
    }

    public List getToDoList() {
        return toDoList;
    }

    public void setToDoList(List toDoList) {
        this.toDoList = toDoList;
    }

    public List<String> getStatusL() {
        return statusL;
    }

    public void setStatusL(List<String> statusL) {
        this.statusL = statusL;
    }

//    public ToDoEntry getToDoEntry() {
//        return toDoEntry;
//    }
//
//    public void setToDoEntry(ToDoEntry toDoEntry) {
//        this.toDoEntry = toDoEntry;
//    }
}
