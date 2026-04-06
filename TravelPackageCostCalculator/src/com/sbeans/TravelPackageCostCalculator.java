package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelPackageCostCalculator {

    @Autowired
    private PackageDetails packageDetails;

    public double calculateFinalPackageCost() {

        double total = packageDetails.getPackageCostPerPerson()
                        * packageDetails.getNumberOfTravelers();

        double discount = total * packageDetails.getDiscountPercentage() / 100;

        double finalCost = total - discount;

        return finalCost;
    }
}
