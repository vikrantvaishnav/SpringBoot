package com.pack1;

public class Car {
	private Iengine engine;
	public Car() {
		IO.println("Car Object created");
	}
	

	public void setEngine(Iengine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		
		engine.start();
		IO.println("Car is driving");
	}
	
}
