package ua.net.azhytnytskyi.model;

public class Entry {

    public long id;

    public Entry() {
        id++;
    }

    public  long getId() {
        return id;
    }

    public  void setId(long id) {
        this.id = id;
    }
}
