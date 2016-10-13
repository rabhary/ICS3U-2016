package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class RunnerFour {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double runner4Split1;
		double runner4Split2;
		double runner4Split3;

		System.out.println("Please enter the first and last name of the first runner.");
		String name4 = input.nextLine();

		System.out.println("What was the time for the first mile?");
		String runner4MileOne = input.nextLine();

		int t = runner4MileOne.indexOf(":"); // i = 1

		int runner4Minutes = Integer.parseInt(runner4MileOne.substring(0, t));
		double runner4Seconds = Double.parseDouble(runner4MileOne.substring(t + 1));

		runner4Split1 = (runner4Minutes * 60) + runner4Seconds;

		System.out.println("What was the time for the second mile?");
		String runner4MileTwo = input.nextLine();

		int t2 = runner4MileTwo.indexOf(":");

		int runner4Minutes2 = Integer.parseInt(runner4MileTwo.substring(0, t2));
		double runner4Seconds2 = Double.parseDouble(runner4MileTwo.substring(t2 + 1));

		runner4Split2 = (runner4Minutes2 * 60) + runner4Seconds2;

		System.out.println("What was the time for the whole five kilometers?");
		String runner4TotalTime = input.nextLine();

		int t3 = runner4TotalTime.indexOf(":");

		int runner4Minutes3 = Integer.parseInt(runner4TotalTime.substring(0, t3));
		double runner4Seconds3 = Double.parseDouble(runner4TotalTime.substring(t3 + 1));

		runner4Split3 = (runner4Minutes3 * 60) + runner4Seconds3;

		double runner4TempInSeconds = runner4Split2 - runner4Split1;
		int runner4Split2Minutes = (int) (runner4TempInSeconds / 60);
		double runner4Split2Seconds = runner4TempInSeconds - runner4Split2Minutes * 60;

		double runner4TempInSeconds2 = runner4Split3 - runner4Split2;
		int runner4Split3Minutes = (int) (runner4TempInSeconds2 / 60);
		double runner4Split3Seconds = runner4TempInSeconds2 - runner4Split2Minutes * 60;

		System.out.println("Runner Four Summary");
		System.out.println("_________________________________");
		System.out.println("Runner: " + name4);
		System.out.println("Split One Time: " + runner4MileOne);
		System.out.printf("Split Two Time: %d:%.3f\n", runner4Split2Minutes, runner4Split2Seconds);
		System.out.printf("Split Three Time: %d:%.3f\n", runner4Split3Minutes, runner4Split3Seconds);
		System.out.println("Total Time: " + runner4TotalTime);
								
								
		//////////////////////////////////////////////////Runner 4////////////////////////////////////////////////////////////////
	}

}
