package com.cafekotlin.dependencyinjection.employees;

import com.cafekotlin.dependencyinjection.tasks.Task;

public class ManagementAssistant implements Employee {

    private Task task;

    public ManagementAssistant(Task task) {
        this.task = task;
    }

    @Override
    public void doTask() {
        task.executeTask();
    }
}