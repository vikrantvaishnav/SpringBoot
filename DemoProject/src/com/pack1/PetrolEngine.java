package com.pack1;

public class PetrolEngine implements Iengine{
	
	public PetrolEngine() {
		IO.println("Petrol Object Created");
	}
	
	@Override
	public void start() {
		
		IO.println("Petrol Engine started");
		
	}
	

}
