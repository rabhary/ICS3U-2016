package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		double wins;
		double losses;
		double winloss;
		
		wins = 110;
		losses = 44;
		
		winloss = Math.round(((wins / (wins + losses)) * 100));
		
		System.out.println(winloss + "%");

	}

}
