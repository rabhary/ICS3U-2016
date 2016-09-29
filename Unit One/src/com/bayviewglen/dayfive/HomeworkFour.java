package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int vinitial, accel, time;
		int vfinal;
		
		System.out.println("A car is driving on the road. How fast is it travelling (km/h)? (Only number values)");
		vinitial = keyboard.nextInt();
		
		System.out.println("How much does it accelerate (km/h) per second? For how many seconds? (Please put a space in between your numbers)");
		accel = keyboard.nextInt();
		time = keyboard.nextInt();
		
		vfinal = vinitial + ( accel * time );
		
		System.out.println("At the end of " + time + " seconds accelerating at " + accel + "km/h per second, it ends up travelling at " + vfinal + "km/h.");
	}

}
