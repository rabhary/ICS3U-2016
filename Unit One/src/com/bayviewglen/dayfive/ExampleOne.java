package com.bayviewglen.dayfive;

import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//Now you can access the keyboard through the declared variable
		
		int x, y, z;
		System.out.print("Please enter three integers: ");
		
		
		x = keyboard.nextInt(); // grabs the next integer
		y = keyboard.nextInt(); // grabs the next integer
		z = keyboard.nextInt(); // grabs the next integer
	}

}
