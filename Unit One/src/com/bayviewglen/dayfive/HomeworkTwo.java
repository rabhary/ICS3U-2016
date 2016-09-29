package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double grade, mark;

		System.out.println("A student writes a test. What is the test out of? Enter below: ");
		grade = keyboard.nextInt();

		System.out.println("What did he score? Enter below: ");
		mark = keyboard.nextInt();

		double score;
		score = (mark / grade) * 100;

		System.out.println("The student scored " + score + "%.");
	}

}
