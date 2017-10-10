package com.cafekotlin.dependencyinjection.tasks;

import java.io.PrintStream;

public class WriteReport implements Task {

    private PrintStream stream;

    public WriteReport(PrintStream stream){
        this.stream = stream;
    }

    @Override
    public void executeTask() {
        stream.println("Write report for boss...");
    }
}
