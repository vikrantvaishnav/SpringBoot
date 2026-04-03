package com.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class RestaurantBillGenerator {
	 private double foodAmount;
	 private double drinksAmount;
	 private double serviceCharge;
	 private double gstPercentage;
	 
	 @Autowired
	 public void setFoodAmount(double foodAmount) {
		 this.foodAmount = foodAmount;
	 }
	 @Autowired
	 public void setDrinksAmount(double drinksAmount) {
		 this.drinksAmount = drinksAmount;
	 }
	 @Autowired
	 public void setServiceCharge(double serviceCharge) {
		 this.serviceCharge = serviceCharge;
	 }
	 @Autowired
	 public void setGstPercentage(double gstPercentage) {
		 this.gstPercentage = gstPercentage;
	 }
	 
	 
	 public double generateFinalBill() {
		 double baseAmount = foodAmount + drinksAmount + serviceCharge;
		 double gst = baseAmount * gstPercentage / 100;
		 double finalBill = baseAmount + gst;
		 return finalBill;
	 }
	 
}
