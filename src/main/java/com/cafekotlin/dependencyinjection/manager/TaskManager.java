package com.cafekotlin.dependencyinjection.manager;

import java.io.PrintStream;

public class TaskManager {

    private PrintStream stream;

    public TaskManager(PrintStream stream) {
        this.stream = stream;
    }

    public void checkBeforeRunningTask() {
        stream.println("Task manager is executed before executing task!");
    }

    public void checkAfterRunningTask() {
        stream.println("Verified, task manager is executed after executing task!");
    }
}