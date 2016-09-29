package com.bayviewglen.dayfour;

public class HomeworkFour {

	public static void main(String[] args) {
		/* Create a program that can be used to calculate the final velocity of a car
		 * given the initial velocity, the acceleration of the car and the time that
		 * has elapsed using the following equation:
		 *  vf= vi + (a)(t)
		 */

		int vf;
		int vi = 30;     // car was travelling at 30 km/h
		int a = 5;       // car accelerated 5 km/h per second
		int t = 10;      // car accelerated for 10 seconds
		
		vf = vi + (a) * (t);
		
		System.out.println("If a car is travelling at 30 km/h, and accelerates 5 km/h every second for 10 seconds, how fast is it going after the 10 seconds?");
		System.out.println("Well, if vf=vi+(a*t), then the final velocity of the car is " + vf + "km/h.");
	}

}
