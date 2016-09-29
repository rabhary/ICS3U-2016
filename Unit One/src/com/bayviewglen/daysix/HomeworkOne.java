package com.bayviewglen.daysix;

public class HomeworkOne {

	public static void main(String[] args) {

		double price;
		double tax;
		double total;
		
		price = 985;
		tax = 5.5;
		total = price * ((tax / 100) + 1);
		
		System.out.println("A computer costs $" + price + "and tax is " + tax + "%.");
		System.out.println("The PC costs $" + total + " with tax included.");
		
		
	}

}
