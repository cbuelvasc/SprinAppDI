package com.cafekotlin.dependencyinjection.tasks;

public class ScheduleMeetings implements Task {

    @Override
    public void executeTask() {
        System.out.println("Schedule meetings for boss...");
    }
}
