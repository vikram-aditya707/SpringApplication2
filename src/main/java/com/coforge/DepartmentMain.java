package com.coforge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coforge.config.ApplicationConfig;
import com.coforge.model.Department;

public class DepartmentMain {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Department department = context.getBean(Department.class);

        System.out.println(department);

        ((AnnotationConfigApplicationContext) context).close();
    }
}