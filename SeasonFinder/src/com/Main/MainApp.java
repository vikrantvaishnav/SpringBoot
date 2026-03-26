package com.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.SeasonFinder;

public class MainApp {

    public static void main(String[] args) {

        System.out.println(">>> IOC Container Starting...\n");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(">>> IOC Container Ready!\n");


        SeasonFinder sf = ctx.getBean("sf", SeasonFinder.class);
        sf.findSeason();

        // Close container
        ((AnnotationConfigApplicationContext) ctx).close();

        System.out.println("\n>>> IOC Container Closed.");
    }
}


