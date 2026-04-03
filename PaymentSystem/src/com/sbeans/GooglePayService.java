package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public class GooglePayService implements PaymentService{

	@Override
	public void pay(double amount
			) {
		IO.println("Paid ₹"+amount+" using Google Pay");
		
	}
	
}
