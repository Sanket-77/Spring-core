package com.Spring_LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext context= new ClassPathXmlApplicationContext("/Config.xml");

        context.registerShutdownHook();
        student st = context.getBean("st", student.class);
        System.out.println(st);
    }

}

