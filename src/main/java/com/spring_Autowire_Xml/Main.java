package com.spring_Autowire_Xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConfigAtw.xml");

        student st = context.getBean("st" ,student.class);
        System.out.println(st);
    }
}
