package com.darrencoxall.learningspring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class TestTaskItem {

    @Test
    public void settingAndGettingDescription() {
        TaskItem task        = newTask();
        String   description = "This is a description!";

        task.setDescription(description);
        assertEquals(task.getDescription(), description);
    }

    private TaskItem newTask() {
        return new TaskItem();
    }

}