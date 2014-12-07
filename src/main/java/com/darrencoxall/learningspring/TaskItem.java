package com.darrencoxall.learningspring;

public class TaskItem {

    private long   identifier;
    private String description;

    public void setID(long id) {
        this.identifier = id;
    }

    public long getID() {
        return this.identifier;
    }

    public void setDescription(String description) {
        this.description = description.trim();
    }

    public String getDescription() {
        return this.description;
    }

}
