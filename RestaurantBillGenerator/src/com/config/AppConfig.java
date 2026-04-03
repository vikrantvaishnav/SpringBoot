package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sbeans.RestaurantBillGenerator;

@Configuration
public class Appconfig {
	@Bean
    public RestaurantBillGenerator restaurantBillGenerator() {

        RestaurantBillGenerator rbg = new RestaurantBillGenerator();

        rbg.setFoodAmount(800);
        rbg.setDrinksAmount(200);
        rbg.setServiceCharge(50);
        rbg.setGstPercentage(18);

        return rbg;
    }
}
