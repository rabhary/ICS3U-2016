package com.bayviewglen.hangMan;

import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		final String VALID_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789 ";
		final String VALID_CHARACTERS_NO_SPACE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
		final int NUM_SPACES = 30;
		final int NUM_TURNS = 7;
		
		
		System.out.println("Enter your name, player one:");
		String playerOneName = input.nextLine();
		
		System.out.println("Enter your name, player two:");
		String playerTwoName = input.nextLine();
		
		System.out.println("Alright, " + playerOneName + " and " + playerTwoName + ", let's play a game of Hang Man.");
		System.out.println(playerOneName + ", please enter a phrase for " + playerTwoName + "to solve:");
		
		String phraseOne = input.nextLine();
		
		
	}

}
