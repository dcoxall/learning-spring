package com.darrencoxall.learningspring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.joda.time.DateTime;

public class TestTaskItem {

    @Test
    public void settingAndGettingDescription() {
        TaskItem task        = newTask();
        String   description = "This is a description!";

        task.setDescription(description);
        assertEquals(task.getDescription(), description);
    }

    @Test
    public void descriptionIsTrimmed() {
        TaskItem task        = newTask();
        String   description = "  \t lots of whitespace\t\t\r\n";

        task.setDescription(description);
        assertEquals(task.getDescription(), description.trim());
    }

    @Test
    public void settingAndGettingID() {
        TaskItem task       = newTask();
        long     identifier = 1234;

        task.setID(identifier);
        assertEquals(task.getID(), identifier);
    }

    @Test
    public void settingAndGettingCompletionDate() {
        TaskItem task = newTask();
        DateTime now  = new DateTime();

        task.setCompletedAt(now);
        assertEquals(task.getCompletedAt(), now);
    }

    private TaskItem newTask() {
        return new TaskItem();
    }

}
