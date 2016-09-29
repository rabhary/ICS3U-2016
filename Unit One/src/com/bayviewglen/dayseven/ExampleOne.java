package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {
		int secondsPerMinute = 60; // declared variable but these values should NEVER change
		int minutesPerHour = 60;
		int hoursPerDay = 24;
		int daysPerYear = 365;
		
		int secondsPerYear = secondsPerMinute * minutesPerHour * hoursPerDay * daysPerYear;
		System.out.println("The number of seconds in a year is " + secondsPerYear);
		
		final int SECONDS_PER_MINUTE = 60;
		// SECONDS_PER_MINUTE = 3 : this is a compile error
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_YEAR = 365;
		
		final int SECONDS_PER_YEAR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
		System.out.println("The number of seconds in a year is " + SECONDS_PER_YEAR);
		
		////////////////////////////////////////////////////
		
		final int NUM_SIDES = 6;
		
		int topOfDie = (int)(Math.random() * NUM_SIDES);
	}

}
