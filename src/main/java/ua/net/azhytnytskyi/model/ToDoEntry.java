package ua.net.azhytnytskyi.model;

public class ToDoEntry{

    private String description;
    private Status status;

    public ToDoEntry(String description) {
        this.description = description;
        this.status = Status.IN_PROGRESS;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Status {
        IN_PROGRESS,
        DONE
    }
}
