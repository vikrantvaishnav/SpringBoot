package com.mainn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Appconfig;
import com.sbeans.RestaurantBillGenerator;

public class MainApp {
	 public static void main(String[] args) {

	        ApplicationContext context =
	                new AnnotationConfigApplicationContext(Appconfig.class);

	        
	        RestaurantBillGenerator rbg =
	                context.getBean(RestaurantBillGenerator.class);

	        double finalBill = rbg.generateFinalBill();

	        System.out.println("Final Restaurant Bill: ₹" + finalBill);
	    }
}
