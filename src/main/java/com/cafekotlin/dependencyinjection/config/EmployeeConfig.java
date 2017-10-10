package com.cafekotlin.dependencyinjection.config;

import com.cafekotlin.dependencyinjection.employees.Employee;
import com.cafekotlin.dependencyinjection.employees.ManagementAssistant;
import com.cafekotlin.dependencyinjection.tasks.ScheduleMeetings;
import com.cafekotlin.dependencyinjection.tasks.Task;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public Employee employee() {
        return new ManagementAssistant(task());
    }

    @Bean
    public Task task() {
        return new ScheduleMeetings();
    }
}
