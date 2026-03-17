package com.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.confg.AppConfig;
import com.sbeans.Emi;

public class Main {
	
	public static void main() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Emi emi = ctx.getBean(Emi.class);
		double emi1= emi.calculateMonthlyEMI();
		IO.println("Emi = "+emi1);
	}
	
	


}
