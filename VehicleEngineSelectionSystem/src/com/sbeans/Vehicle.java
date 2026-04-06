package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehl")
public class Vehicle {
	private Engine engine;
	
	@Autowired
	public Vehicle(@Qualifier("elec")Engine engine) {
		this.engine = engine;
	}
	
	public void startVehicle() {
		engine.start();
	}
}
