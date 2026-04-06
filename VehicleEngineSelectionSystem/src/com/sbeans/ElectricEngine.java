package com.sbeans;

import org.springframework.stereotype.Component;

@Component("elec")
public class ElectricEngine implements Engine {
	@Override
	public void start() {
		IO.println("Electric engine started ⚡");
		
	}
	
}
