package com.Dependency_Inj;


import com.Dependency_Inj.Constructor_inj.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//             Primitive type------------------------- setter injection
//       ApplicationContext context= new ClassPathXmlApplicationContext("/ConfigAtw.xml");
//
//       student st = context.getBean("st1", student.class);
//       student st2 = context.getBean("st2", student.class);
//        System.out.println(st);
//        System.out.println(st2);


//        collection type --------------------------- setter injection
//        ApplicationContext context= new ClassPathXmlApplicationContext("/Config2.xml");
//
//       student st = context.getBean("st1", student.class);
//
//        System.out.println(st);


//        Reference  type -------------------------- setter injection
//        ApplicationContext context= new ClassPathXmlApplicationContext("/Config3.xml");
//
//       student st = context.getBean("std", student.class);
//        System.out.println(st.name);
//        System.out.println(st.getAddress());


//        Constructor injection type --------------Constructor injection

        ApplicationContext context= new ClassPathXmlApplicationContext("/Config4.xml");

        student st = context.getBean("st", student.class);
        System.out.println(st);

    }
}
