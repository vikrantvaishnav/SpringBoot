package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageUsingConstructor {
	
	private LocalTime time;
	
	public WishMessageUsingConstructor(LocalTime time) {
		IO.println("Parametrize Constructor");
		this.time=time;
	
	}
	
	public String showWishMessage(String user) {
		System.out.println("Wish MessageGenerator.showWishMessage()");

		int hour = time.getHour();

		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good AfterNoon::" + user;
		else if (hour < 20)
			return "Good Evening ::" + user;
		else
			return "Good Night ::" + user;
	}
}
