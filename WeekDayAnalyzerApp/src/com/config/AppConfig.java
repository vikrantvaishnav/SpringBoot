package com.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.sbeans")
public class AppConfig {
	public AppConfig() {
		IO.println("0 Param Config");
	}
	
	@Bean(name="ldate")
	public LocalDate createDate() {
		IO.println("Create DAte");
		return LocalDate.now();
	}
	
	
}
