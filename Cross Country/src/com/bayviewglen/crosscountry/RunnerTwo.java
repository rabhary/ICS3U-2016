package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class RunnerTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double runner2Split1;
		double runner2Split2;
		double runner2Split3;
				
		
			System.out.println("Please enter the first and last name of the first runner.");
			String name2 = input.nextLine();
						
			System.out.println("What was the time for the first mile?");
			String runner2MileOne = input.nextLine();
					
			int u = runner2MileOne.indexOf(":");		// i = 1
		
			int minutes = Integer.parseInt(runner2MileOne.substring(0, u));
			double seconds = Double.parseDouble(runner2MileOne.substring(u + 1));
		
	
		runner2Split1 = ( minutes * 60 ) + seconds;
		
		
			System.out.println("What was the time for the second mile?");
			String runner2MileTwo = input.nextLine();
		
			int u2 = runner2MileTwo.indexOf(":");
		
			int minutes2 = Integer.parseInt(runner2MileTwo.substring(0, u2));
			double seconds2 = Double.parseDouble(runner2MileTwo.substring(u2 + 1));
		
		
		runner2Split2 = ( minutes2 * 60 ) + seconds2;
		
		
		
			System.out.println("What was the time for the whole five kilometers?");
			String runner2TotalTime = input.nextLine();
		
			int u3 = runner2TotalTime.indexOf(":");
		
			int minutes3 = Integer.parseInt(runner2TotalTime.substring(0, u3));
			double seconds3 = Double.parseDouble(runner2TotalTime.substring(u3 + 1));
		
		
			
		runner2Split3 = ( minutes3 * 60 ) + seconds3;
		
		double runner2TempInSeconds = runner2Split2 - runner2Split1;
		int runner2Split2Minutes = (int)(runner2TempInSeconds / 60);
		double runner2Split2Seconds = runner2TempInSeconds - runner2Split2Minutes * 60;
		
		double runner2TempInSeconds2 = runner2Split3 - runner2Split2;
		int runner2Split3Minutes = (int)(runner2TempInSeconds2 / 60);
		double runner2Split3Seconds = runner2TempInSeconds2 - runner2Split2Minutes * 60;
		
		
		System.out.println("Runner Two Summary");
			System.out.println("_________________________________");
				System.out.println("Runner: " + name2);
					System.out.println("Split One Time: " + runner2MileOne);
						System.out.printf("Split Two Time: %d:%.3f\n", runner2Split2Minutes,runner2Split2Seconds);
							System.out.printf("Split Three Time: %d:%.3f\n", runner2Split3Minutes,runner2Split3Seconds);
								System.out.println("Total Time: " + runner2TotalTime);
		
								
								
		//////////////////////////////////////////////////Runner 2////////////////////////////////////////////////////////////////
	}

}
