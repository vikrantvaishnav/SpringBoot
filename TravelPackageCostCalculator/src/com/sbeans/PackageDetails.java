package com.sbeans;

import org.springframework.stereotype.Component;

@Component
	public class PackageDetails {

	    private double packageCostPerPerson = 5000;
	    private int numberOfTravelers = Integer.parseInt(IO.readln("Enter how many pasangers"));
	    private double discountPercentage = 10;

	    public double getPackageCostPerPerson() {
	        return packageCostPerPerson;
	    }

	    public int getNumberOfTravelers() {
	        return numberOfTravelers;
	    }

	    public double getDiscountPercentage() {
	        return discountPercentage;
	    }
	}
