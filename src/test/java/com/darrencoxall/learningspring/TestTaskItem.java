package com.darrencoxall.learningspring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
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
        TaskItem task             = newTask();
        DateTime creationDateTime = DateTime.now();

        task.setCompletedAt(creationDateTime);
        assertEquals(task.getCompletedAt(), creationDateTime);
    }

    @Test
    public void completionFlag() {
        TaskItem task = newTask();
        assertFalse(task.isCompleted());

        task.setCompletedAt(DateTime.now().minusDays(1));
        assertTrue(task.isCompleted());

        // Task is completed tomorrow
        task.setCompletedAt(
            task.getCompletedAt().plusDays(1)
        );
        // Task isn't completed yet
        assertFalse(task.isCompleted());
    }

    private TaskItem newTask() {
        return new TaskItem();
    }

}
