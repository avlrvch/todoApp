package ua.net.azhytnytskyi.model;

import java.util.Objects;

/**
 * POJO ToDoEntry model
 */
public class ToDoEntry{

    private String description;
    private Status status;
    private static int idCounter = 0;
    private int id;

    public ToDoEntry(String description) {
        this.description = description;
        this.status = Status.IN_PROGRESS;
        this.id = idCounter++;
    }

    public ToDoEntry() {
        this.id = idCounter++;
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

    public int getId() {
        return id;
    }

    public enum Status {
        IN_PROGRESS,
        DONE
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDoEntry toDoEntry = (ToDoEntry) o;
        return id == toDoEntry.id &&
                Objects.equals(description, toDoEntry.description) &&
                status == toDoEntry.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, status, id);
    }

    @Override
    public String toString() {
        return "ToDoEntry{" +
                "description='" + description + '\'' +
                ", status=" + status +
                ", id=" + id +
                '}';
    }
}
