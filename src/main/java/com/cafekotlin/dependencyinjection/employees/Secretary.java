package com.cafekotlin.dependencyinjection.employees;

import com.cafekotlin.dependencyinjection.tasks.Task;

public class Secretary implements Employee {

    private Task task;

    public Secretary(Task task) {
        this.task = task;
    }

    @Override
    public void doTask() {
        task.executeTask();
    }
}
