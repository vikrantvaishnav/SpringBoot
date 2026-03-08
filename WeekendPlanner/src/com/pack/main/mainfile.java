package com.pack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.sbeans.WeekendChecker;

public class mainfile {

    public static void main(String[] args) {

        ApplicationContext ctx =
            new ClassPathXmlApplicationContext("com/pack/confg/ApplicationContext.xml");

        WeekendChecker checker =
            ctx.getBean("weekendChecker", WeekendChecker.class);

        checker.checkDay();
    }
}