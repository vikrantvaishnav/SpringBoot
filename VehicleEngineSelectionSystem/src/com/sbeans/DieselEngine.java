package com.sbeans;

import org.springframework.stereotype.Component;

@Component("desl")
public class DieselEngine implements Engine {

	@Override
	public void start() {
		IO.println("Diesel engine started 🚛");
		
	}
	
}
