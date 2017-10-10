package com.cafekotlin;

import com.cafekotlin.dependencyinjection.employees.ManagementAssistant;
import com.cafekotlin.dependencyinjection.tasks.Task;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ManagementAssistantTest {

    @Test
    public void managementAssistantShouldDoTask() {
        Task mockTask = mock(Task.class);
        ManagementAssistant managementAssistant = new ManagementAssistant(mockTask);
        managementAssistant.doTask();
        verify(mockTask, times(1)).executeTask();
    }
}
