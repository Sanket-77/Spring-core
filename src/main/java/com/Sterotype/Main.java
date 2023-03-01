package com.Sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Configsterotype.xml");

        Emp em = context.getBean("employee",Emp.class);

        System.out.println(em);

    }
}
