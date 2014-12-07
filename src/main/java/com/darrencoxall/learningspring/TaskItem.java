package com.darrencoxall.learningspring;

import org.joda.time.DateTime;

public class TaskItem {

    private long     identifier;
    private String   description;
    private DateTime completionDateTime;

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

    public void setCompletedAt(DateTime dateTime) {
        this.completionDateTime = dateTime;
    }

    public DateTime getCompletedAt() {
        return this.completionDateTime;
    }

}
