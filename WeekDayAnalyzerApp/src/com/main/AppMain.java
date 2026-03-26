package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.WeekDayAnalyzer;

public class AppMain {
	
	void main() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		try(ctx){
			WeekDayAnalyzer analyze = ctx.getBean("wda",WeekDayAnalyzer.class);
			String result = analyze.showMesage("Vikrant");
			IO.println("Result: "+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
