package com.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Marks this class as Spring Bean Configuration class
// Replaces applicationContext.xml
@Configuration

// Replaces <context:component-scan base-package="com.nt.sbeans"/>
@ComponentScan(basePackages = "com.sbeans")
public class AppConfig {

    // Replaces:
    // <bean id="localDate"
    //       class="java.time.LocalDate"
    //       factory-method="now"/>
    @Bean    // bean id = "localDate" (method name)
    public LocalDate localDate() {
        return LocalDate.now();
    }

    // Replaces:
    // <bean id="localTime"
    //       class="java.time.LocalTime"
    //       factory-method="now"/>
    @Bean    // bean id = "localTime" (method name)
    public LocalTime localTime() {
        return LocalTime.now();
    }
}