package com.bayviewglen.crosscountry;

import java.util.Scanner;

public class CrossCountry {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declaring scanner

        double runner1Split1; //declaring runner 1's variables
        double runner1Split2; //
        double runner1Split3; //

        System.out.println("Please enter the first and last name of the first runner."); //prompting for name input
        String name1 = input.nextLine(); //next string will be name

        System.out.println("What was the time for the first mile?"); //prompting for time for first mile
        String runner1MileOne = input.nextLine(); //next input will be first mile time

        int i = runner1MileOne.indexOf(":"); //separate first mile time at :

        int runner1Minutes = Integer.parseInt(runner1MileOne.substring(0, i)); //before : is int
        double runner1Seconds = Double.parseDouble(runner1MileOne.substring(i + 1)); //after : is double

        runner1Split1 = (runner1Minutes * 60) + runner1Seconds; //minutes * 60 + seconds is total time for first mile in seconds

        System.out.println("What was the time for the second mile?"); //prompting for time for second mile and first mile
        String runner1MileTwo = input.nextLine(); //next input will be second mile time

        int i2 = runner1MileTwo.indexOf(":"); //separate second mile time at :

        int runner1Minutes2 = Integer.parseInt(runner1MileTwo.substring(0, i2)); //before : is int
        double runner1Seconds2 = Double.parseDouble(runner1MileTwo.substring(i2 + 1)); //after : is double

        runner1Split2 = (runner1Minutes2 * 60) + runner1Seconds2; //minutes * 60 + seconds is total time for second mile in seconds

        System.out.println("What was the time for the whole five kilometers?"); //prompting total time for 5 kilometers
        String runner1TotalTime = input.nextLine(); //next input will be total time

        int i3 = runner1TotalTime.indexOf(":"); //separate total time at :

        int runner1Minutes3 = Integer.parseInt(runner1TotalTime.substring(0, i3)); //before : is int
        double runner1Seconds3 = Double.parseDouble(runner1TotalTime.substring(i3 + 1)); //after : is double

        runner1Split3 = (runner1Minutes3 * 60) + runner1Seconds3; //minutes * 60 + seconds is total time in seconds

        double runner1TempInSeconds = runner1Split2 - runner1Split1; //transforming seconds of second mile back into 01:23.45 format
        int runner1Split2Minutes = (int)(runner1TempInSeconds / 60); //
        double runner1Split2Seconds = runner1TempInSeconds - runner1Split2Minutes * 60; //

        double runner1TempInSeconds2 = runner1Split3 - runner1Split2; //transforming seconds of third mile back into 01:23.45 format
        int runner1Split3Minutes = (int)(runner1TempInSeconds2 / 60); //
        double runner1Split3Seconds = runner1TempInSeconds2 - runner1Split2Minutes * 60; //

        System.out.println("\nRunner One Summary"); //displaying results of runner 1
        System.out.println("_________________________________");
        System.out.println("Runner: " + name1);
        System.out.println("Split One Time: " + runner1MileOne);
        System.out.printf("Split Two Time: %d:%.3f\n", runner1Split2Minutes, runner1Split2Seconds);
        System.out.printf("Split Three Time: %d:%.3f\n", runner1Split3Minutes, runner1Split3Seconds);
        System.out.println("Total Time: " + runner1TotalTime);
        System.out.println("");
        //repeat this 5 times with different inputed values and name

        ////////////////////////////////////////////////// Runner 2////////////////////////////////////////////////////////////////


        double runner2Split1;
        double runner2Split2;
        double runner2Split3;

        System.out.println("Please enter the first and last name of the first runner.");
        String name2 = input.nextLine();

        System.out.println("What was the time for the first mile?");
        String runner2MileOne = input.nextLine();

        int u = runner2MileOne.indexOf(":");

        int runner2Minutes = Integer.parseInt(runner2MileOne.substring(0, u));
        double runner2Seconds = Double.parseDouble(runner2MileOne.substring(u + 1));

        runner2Split1 = (runner2Minutes * 60) + runner2Seconds;

        System.out.println("What was the time for the second mile?");
        String runner2MileTwo = input.nextLine();

        int u2 = runner2MileTwo.indexOf(":");

        int runner2Minutes2 = Integer.parseInt(runner2MileTwo.substring(0, u2));
        double runner2Seconds2 = Double.parseDouble(runner2MileTwo.substring(u2 + 1));

        runner2Split2 = (runner2Minutes2 * 60) + runner2Seconds2;

        System.out.println("What was the time for the whole five kilometers?");
        String runner2TotalTime = input.nextLine();

        int u3 = runner2TotalTime.indexOf(":");

        int runner2Minutes3 = Integer.parseInt(runner2TotalTime.substring(0, u3));
        double runner2Seconds3 = Double.parseDouble(runner2TotalTime.substring(u3 + 1));

        runner2Split3 = (runner2Minutes3 * 60) + runner2Seconds3;

        double runner2TempInSeconds = runner2Split2 - runner2Split1;
        int runner2Split2Minutes = (int)(runner2TempInSeconds / 60);
        double runner2Split2Seconds = runner2TempInSeconds - runner2Split2Minutes * 60;

        double runner2TempInSeconds2 = runner2Split3 - runner2Split2;
        int runner2Split3Minutes = (int)(runner2TempInSeconds2 / 60);
        double runner2Split3Seconds = runner2TempInSeconds2 - runner2Split2Minutes * 60;

        System.out.println("\nRunner Two Summary");
        System.out.println("_________________________________");
        System.out.println("Runner: " + name2);
        System.out.println("Split One Time: " + runner2MileOne);
        System.out.printf("Split Two Time: %d:%.3f\n", runner2Split2Minutes, runner2Split2Seconds);
        System.out.printf("Split Three Time: %d:%.3f\n", runner2Split3Minutes, runner2Split3Seconds);
        System.out.println("Total Time: " + runner2TotalTime);
        System.out.println("");


        ////////////////////////////////////////////////// Runner 3////////////////////////////////////////////////////////////////


        double runner3Split1;
        double runner3Split2;
        double runner3Split3;

        System.out.println("Please enter the first and last name of the first runner.");
        String name3 = input.nextLine();

        System.out.println("What was the time for the first mile?");
        String runner3MileOne = input.nextLine();

        int y = runner3MileOne.indexOf(":");

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
        int runner3Split2Minutes = (int)(runner3TempInSeconds / 60);
        double runner3Split2Seconds = runner3TempInSeconds - runner3Split2Minutes * 60;

        double runner3TempInSeconds2 = runner3Split3 - runner3Split2;
        int runner3Split3Minutes = (int)(runner3TempInSeconds2 / 60);
        double runner3Split3Seconds = runner3TempInSeconds2 - runner3Split2Minutes * 60;

        System.out.println("\nRunner Three Summary");
        System.out.println("_________________________________");
        System.out.println("Runner: " + name3);
        System.out.println("Split One Time: " + runner3MileOne);
        System.out.printf("Split Two Time: %d:%.3f\n", runner3Split2Minutes, runner3Split2Seconds);
        System.out.printf("Split Three Time: %d:%.3f\n", runner3Split3Minutes, runner3Split3Seconds);
        System.out.println("Total Time: " + runner3TotalTime);
        System.out.println("");


        ////////////////////////////////////////////////// Runner 4////////////////////////////////////////////////////////////////


        double runner4Split1;
        double runner4Split2;
        double runner4Split3;

        System.out.println("Please enter the first and last name of the first runner.");
        String name4 = input.nextLine();

        System.out.println("What was the time for the first mile?");
        String runner4MileOne = input.nextLine();

        int t = runner4MileOne.indexOf(":");

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
        int runner4Split2Minutes = (int)(runner4TempInSeconds / 60);
        double runner4Split2Seconds = runner4TempInSeconds - runner4Split2Minutes * 60;

        double runner4TempInSeconds2 = runner4Split3 - runner4Split2;
        int runner4Split3Minutes = (int)(runner4TempInSeconds2 / 60);
        double runner4Split3Seconds = runner4TempInSeconds2 - runner4Split2Minutes * 60;

        System.out.println("\nRunner Four Summary");
        System.out.println("_________________________________");
        System.out.println("Runner: " + name4);
        System.out.println("Split One Time: " + runner4MileOne);
        System.out.printf("Split Two Time: %d:%.3f\n", runner4Split2Minutes, runner4Split2Seconds);
        System.out.printf("Split Three Time: %d:%.3f\n", runner4Split3Minutes, runner4Split3Seconds);
        System.out.println("Total Time: " + runner4TotalTime);
        System.out.println("");


        //////////////////////////////////////////////////Runner 5////////////////////////////////////////////////////////////////


        double runner5Split1;
        double runner5Split2;
        double runner5Split3;

        System.out.println("Please enter the first and last name of the first runner.");
        String name5 = input.nextLine();

        System.out.println("What was the time for the first mile?");
        String runner5MileOne = input.nextLine();

        int r = runner5MileOne.indexOf(":");

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
        int runner5Split2Minutes = (int)(runner5TempInSeconds / 60);
        double runner5Split2Seconds = runner5TempInSeconds - runner5Split2Minutes * 60;

        double runner5TempInSeconds2 = runner5Split3 - runner5Split2;
        int runner5Split3Minutes = (int)(runner5TempInSeconds2 / 60);
        double runner5Split3Seconds = runner5TempInSeconds2 - runner5Split2Minutes * 60;

        System.out.println("\nRunner Five Summary");
        System.out.println("_________________________________");
        System.out.println("Runner: " + name5);
        System.out.println("Split One Time: " + runner5MileOne);
        System.out.printf("Split Two Time: %d:%.3f\n", runner5Split2Minutes, runner5Split2Seconds);
        System.out.printf("Split Three Time: %d:%.3f\n", runner5Split3Minutes, runner5Split3Seconds);
        System.out.println("Total Time: " + runner5TotalTime);
        System.out.println("");


        /////////////////////////////////////////////////Table////////////////////////////////////////////////////

        String format = "%10s %30s %12s %12s %12s \n";
        System.out.println("");
        System.out.println("*******************************************************************");
        System.out.printf(format, "Full Name", "Split One", "Split Two", "Total Time");
        System.out.println("");
        System.out.printf(format, 1, name1, runner1Split1, runner1Split2, runner1TotalTime);
        System.out.printf(format, 2, name2, runner2Split1, runner2Split2, runner2TotalTime);
        System.out.printf(format, 3, name3, runner3Split1, runner3Split2, runner3TotalTime);
        System.out.printf(format, 4, name4, runner4Split1, runner4Split2, runner4TotalTime);
        System.out.printf(format, 5, name5, runner5Split1, runner5Split2, runner5TotalTime);
        System.out.println("*******************************************************************");


    }

}