package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class RunnerFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double runner5Split1;
		double runner5Split2;
		double runner5Split3;

		System.out.println("Please enter the first and last name of the first runner.");
		String name5 = input.nextLine();

		System.out.println("What was the time for the first mile?");
		String runner5MileOne = input.nextLine();

		int r = runner5MileOne.indexOf(":"); // i = 1

		int runner5Minutes = Integer.parseInt(runner5MileOne.substring(0, r));
		double runner5Seconds = Double.parseDouble(runner5MileOne.substring(r + 1));

		runner5Split1 = (runner5Minutes * 60) + runner5Seconds;

		System.out.println("What was the time for the second mile?");
		String runner5MileTwo = input.nextLine();

		int r2 = runner5MileTwo.indexOf(":");

		int runner5Minutes2 = Integer.parseInt(runner5MileTwo.substring(0, r2));
		double runner5Seconds2 = Double.parseDouble(runner5MileTwo.substring(r2 + 1));

		runner5Split2 = (runner5Minutes2 * 60) + runner5Seconds2;

		System.out.println("What was the time for the whole five kilometers?");
		String runner5TotalTime = input.nextLine();

		int r3 = runner5TotalTime.indexOf(":");

		int runner5Minutes3 = Integer.parseInt(runner5TotalTime.substring(0, r3));
		double runner5Seconds3 = Double.parseDouble(runner5TotalTime.substring(r3 + 1));

		runner5Split3 = (runner5Minutes3 * 60) + runner5Seconds3;

		double runner5TempInSeconds = runner5Split2 - runner5Split1;
		int runner5Split2Minutes = (int) (runner5TempInSeconds / 60);
		double runner5Split2Seconds = runner5TempInSeconds - runner5Split2Minutes * 60;

		double runner5TempInSeconds2 = runner5Split3 - runner5Split2;
		int runner5Split3Minutes = (int) (runner5TempInSeconds2 / 60);
		double runner5Split3Seconds = runner5TempInSeconds2 - runner5Split2Minutes * 60;

		System.out.println("Runner Five Summary");
		System.out.println("_________________________________");
		System.out.println("Runner: " + name5);
		System.out.println("Split One Time: " + runner5MileOne);
		System.out.printf("Split Two Time: %d:%.3f\n", runner5Split2Minutes, runner5Split2Seconds);
		System.out.printf("Split Three Time: %d:%.3f\n", runner5Split3Minutes, runner5Split3Seconds);
		System.out.println("Total Time: " + runner5TotalTime);
								
	}

}
