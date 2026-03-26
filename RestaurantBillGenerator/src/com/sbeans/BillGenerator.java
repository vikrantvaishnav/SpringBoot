package com.sbeans;

public class BillGenerator {
	private double foodAmount;
	private double drinksAmount;
	private double serviceCharge;
	private double gstPercentage;
	public double getFoodAmount() {
		return foodAmount;
	}
	public void setFoodAmoun(double foodAmount) {
		this.foodAmount = foodAmount;
	}
	public double getDrinksAmount() {
		return drinksAmount;
	}
	public void setDrinksAmount(double drinksAmount) {
		this.drinksAmount = drinksAmount;
	}
	public double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public double getGstPercentage() {
		return gstPercentage;
	}
	public void setGstPercentage(double gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	
	
	public double generateFinalBill() {
		double baseAmount = foodAmount + drinksAmount + serviceCharge;
		double	gst = baseAmount * gstPercentage / 100;
		double	finalBill = baseAmount + gst;
		
		return finalBill;
	}
	
}
