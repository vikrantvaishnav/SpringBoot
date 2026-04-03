package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.sbeans.PaymentProcessor;

public class AppMain {
	void main() {
		var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		var pay = ctx.getBean(PaymentProcessor.class);
		pay.processPayment(2500.0);
	}
}
