package com.bayviewglen.dayfour;

public class HomeworkThree {

	public static void main(String[] args) {
		int x = 256382;
		int y;
		int z;
		int a;
		
		y = x % 100000 / 10000;
		
		z = x % 100 / 10;
		
		a = y * z;
		
		System.out.println("You have the number " + x + "." + "\nYou multiply the second (" + y + ") and the fifth (" + z + 
				") digits together, you get " + a + ".");
		
	}

}
