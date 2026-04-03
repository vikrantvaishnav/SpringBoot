package com.sbeans;

import org.springframework.stereotype.Component;

@Component
public class PaytmPaymentService implements PaymentService{

	@Override
	public void pay(double amount) {
		IO.println("Paid ₹"+amount+" using Paytm");
		
	}

}
