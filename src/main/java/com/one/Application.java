package com.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml", "services.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("combined.xml");
        Main main = applicationContext.getBean("bean1", Main.class);
        main.printSomething();

        ClassWithStaticFactoryMethod obj = applicationContext.getBean("classWithStaticFactoryMethod", ClassWithStaticFactoryMethod.class);
        obj.print();

        ConstructorBasedDI constructorBasedDI = applicationContext.getBean("constructorBasedDI", ConstructorBasedDI.class);
        constructorBasedDI.print();

        Teacher teacher = applicationContext.getBean("teacher",Teacher.class);
        Teacher teacher1 = applicationContext.getBean("teacher",Teacher.class);
        System.out.println("teacher:"+teacher+" teacher1:"+teacher1);

        Student student = applicationContext.getBean("student",Student.class);
        Student student1 = applicationContext.getBean("student",Student.class);
        System.out.println("student:"+student+" student1:"+student1);


        /*School school = applicationContext.getBean("School", School.class);
        System.out.println(school);*/


    }
}
