package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double length, width, height;
		double surfaceArea;
		
		System.out.println("Please enter a length: ");
		length = in.nextDouble();
		
		System.out.println("Please enter a width: ");
		width = in.nextDouble();
		
		System.out.println("Please enter a height: ");
		height = in.nextDouble();
		
		surfaceArea = (2 * length * width) + (2 * length * height) + (2 * height * width);
		
		System.out.println("The surface area, given the values you entered, is " + surfaceArea + ".");
		
	}

}
