package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
 void main() {
	 ApplicationContext cont = new ClassPathXmlApplicationContext("context.xml");
	 
	 Car car = cont.getBean(Car.class);
	 
	 car.drive();
 }
}
