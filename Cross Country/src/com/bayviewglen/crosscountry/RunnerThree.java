package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class RunnerThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double runner3Split1;
		double runner3Split2;
		double runner3Split3;

		
		System.out.println("Please enter the first and last name of the first runner.");
		String name3 = input.nextLine();

		System.out.println("What was the time for the first mile?");
		String runner3MileOne = input.nextLine();

		int y = runner3MileOne.indexOf(":"); // i = 1

		int runner3Minutes = Integer.parseInt(runner3MileOne.substring(0, y));
		double runner3Seconds = Double.parseDouble(runner3MileOne.substring(y + 1));

		runner3Split1 = (runner3Minutes * 60) + runner3Seconds;

		System.out.println("What was the time for the second mile?");
		String runner3MileTwo = input.nextLine();

		int y2 = runner3MileTwo.indexOf(":");

		int runner3Minutes2 = Integer.parseInt(runner3MileTwo.substring(0, y2));
		double runner3Seconds2 = Double.parseDouble(runner3MileTwo.substring(y2 + 1));

		runner3Split2 = (runner3Minutes2 * 60) + runner3Seconds2;

		System.out.println("What was the time for the whole five kilometers?");
		String runner3TotalTime = input.nextLine();

		int y3 = runner3TotalTime.indexOf(":");

		int runner3Minutes3 = Integer.parseInt(runner3TotalTime.substring(0, y3));
		double runner3Seconds3 = Double.parseDouble(runner3TotalTime.substring(y3 + 1));

		runner3Split3 = (runner3Minutes3 * 60) + runner3Seconds3;

		double runner3TempInSeconds = runner3Split2 - runner3Split1;
		int runner3Split2Minutes = (int) (runner3TempInSeconds / 60);
		double runner3Split2Seconds = runner3TempInSeconds - runner3Split2Minutes * 60;

		double runner3TempInSeconds2 = runner3Split3 - runner3Split2;
		int runner3Split3Minutes = (int) (runner3TempInSeconds2 / 60);
		double runner3Split3Seconds = runner3TempInSeconds2 - runner3Split2Minutes * 60;

		System.out.println("Runner Three Summary");
		System.out.println("_________________________________");
		System.out.println("Runner: " + name3);
		System.out.println("Split One Time: " + runner3MileOne);
		System.out.printf("Split Two Time: %d:%.3f\n", runner3Split2Minutes, runner3Split2Seconds);
		System.out.printf("Split Three Time: %d:%.3f\n", runner3Split3Minutes, runner3Split3Seconds);
		System.out.println("Total Time: " + runner3TotalTime);
								
		String format = "%10s %30s %12s %12s %12s \n";
		System.out.println("");
		System.out.println("*******************************************************************");
	    System.out.printf(format, "Full Name", "Split One", "Split Two", "Total Time");
	    System.out.println("");
	    //System.out.printf(format, 1, name1, runner1Split1, runner1Split2, runner1TotalTime);
	    //System.out.printf(format, 2, name2, runner2Split1, runner2Split2, runner2TotalTime);
	    System.out.printf(format, 3, name3, runner3Split1, runner3Split2, runner3TotalTime);
	    //System.out.printf(format, 4, name4, runner4Split1, runner4Split2, runner4TotalTime);
	   // System.out.printf(format, 5, name5, runner5Split1, runner5Split2, runner5TotalTime);
		System.out.println("*******************************************************************");							
	}

}
