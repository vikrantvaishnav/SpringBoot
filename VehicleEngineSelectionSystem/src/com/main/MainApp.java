package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.Vehicle;

public class MainApp {
	
	void main() {
		var context = new AnnotationConfigApplicationContext(AppConfig.class);
		var Vehicle = context.getBean("vehl", Vehicle.class);
		Vehicle.startVehicle();
	}
}
