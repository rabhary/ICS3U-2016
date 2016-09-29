package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int x;
		int y, z;
		double product;
		
		System.out.println("Please input a five (5) digit number below:");
		x = keyboard.nextInt();
		
		y = x % 10000 / 1000;
		z = x % 100 / 10;
		
		product = y * z;
		
		System.out.println("The product of the second (" + y + ") and fourth (" + z + ") digits is " + product + ".");
		
	}

}
