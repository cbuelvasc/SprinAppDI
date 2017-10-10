package com.cafekotlin;

import com.cafekotlin.dependencyinjection.employees.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        "META-INF/spring/manager.xml");
        Employee managementAssistant = context.getBean(Employee.class);
        managementAssistant.doTask();

        context.close();
    }
}
