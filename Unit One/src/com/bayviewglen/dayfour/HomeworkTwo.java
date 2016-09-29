package com.bayviewglen.dayfour;

import java.text.NumberFormat;

public class HomeworkTwo {

	public static void main(String[] args) {
		int total = 58;
		int grade = 49;
		
		System.out.println("The test was out of " + total + " and you scored " + grade + " marks.");
		
		// 49 / 58 = 0.8448275862068966, but that has too many characters so we will modify it down to a smaller number.
		
		
		double percent;
		percent = 0.8448275862068966 * 100;
		
		System.out.println("The percent grade is " + percent + "%.");
	}

}
