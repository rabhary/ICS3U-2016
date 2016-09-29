package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
			
			double x;
			double square;
			
			System.out.println("Enter a number: ");
			x = keyboard.nextDouble();
			
			square = Math.pow(x, 2);
			
			System.out.println(square);
			
	}

}
