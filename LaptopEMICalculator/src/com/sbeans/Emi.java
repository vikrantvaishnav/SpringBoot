package com.sbeans;

public class Emi {
	private double laptopPrice;
	private double downPayment;
	private int emiMonths;

	public Emi(double laptopPrice, double downPayment, int emiMonths) {
		super();
		this.laptopPrice = laptopPrice;
		this.downPayment = downPayment;
		this.emiMonths = emiMonths;
	}
	
	public double calculateMonthlyEMI() {
		double remainingAmount = laptopPrice - downPayment;
		double	monthlyEMI = remainingAmount / emiMonths;
		
		return monthlyEMI;

	}

}
