package com.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbeans.Emi;

@Configuration
public class AppConfig {
	@Bean
	public Emi emi() {
		return new Emi(6000, 10000, 10);
	}
}
