package com.bayviewglen.dayfour;

public class ExampleTwo {

	public static void main(String[] args) {
		int age1 = 16;
		int age2 = 17;
		int age3 = 16;
		
		int numberOfStudents = 3;
		double averageAge = (age1 + age2 + age3)/(double)numberOfStudents;
		System.out.println(averageAge);
		
		System.out.println((int)((age1 + age2 + age3)/(double)numberOfStudents));
		
		averageAge = (int)((age1 + age2 + age3)/(double)numberOfStudents);
		
		System.out.println(averageAge);
				
	}

}
