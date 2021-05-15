package com.company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        UserDao userDao = context.getBean("userDao", UserDao.class);
        System.out.println(userDao.getDatabaseConfig().getUrl());
    }
}
