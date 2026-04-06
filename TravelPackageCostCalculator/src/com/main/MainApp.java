package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.TravelPackageCostCalculator;

public class MainApp {
	 public static void main(String[] args) {

	        ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        TravelPackageCostCalculator calculator =
	                context.getBean(TravelPackageCostCalculator.class);

	        double finalCost = calculator.calculateFinalPackageCost();

	        System.out.println("Final Package Cost: ₹" + finalCost);
	    }
}
