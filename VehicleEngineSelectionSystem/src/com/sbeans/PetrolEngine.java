package com.sbeans;

import org.springframework.stereotype.Component;

@Component("petr")
public class PetrolEngine implements Engine {

	@Override
	public void start() {
	
		IO.println("Petrol engine started 🚗");
	}

}
