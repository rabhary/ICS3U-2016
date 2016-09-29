package com.bayviewglen.dayseven;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner dimensions = new Scanner(System.in);
		
		double l;			// length
		double w;			// width
		double h1;			// shallow end height
		double h2;			// deep end height
		double transition;	// transition
		double l1;			// shallow end length
		double l2;			// deep end length (length - shallow end length - transition)
		double linerOne;	// fibreglass
		double linerTwo;	// concrete
		double linerThree;	// vinyl
		
		System.out.println("Enter pool length (m):");
		l = dimensions.nextDouble();
		
		System.out.println("Enter pool width (m):");
		w = dimensions.nextDouble();
		
		System.out.println("Enter the shallow end depth (m):");
		h1 = dimensions.nextDouble();
		
		System.out.println("Enter the deep end depth (m):");
		h2 = dimensions.nextDouble();
		
		System.out.println("Enter the length of the shallow end (m):");
		l1 = dimensions.nextDouble();
		
		System.out.println("Enter transition length from shallow end to deep end (m):");
		transition = dimensions.nextDouble();
		
		System.out.println("What is the cost of fibreglass liner in $/sqm ?");
		linerOne = dimensions.nextDouble();
		
		System.out.println("What is the cost of concrete liner in $/sqm ?");
		linerTwo = dimensions.nextDouble();
		
		System.out.println("How much is vinyl liner in $/sqm ?");
		linerThree = dimensions.nextDouble();
		
		///////////////////////////////////////////Volume//////////////////////////////////////////
		
		double v1;
		double v2;
		double v3;
		double v4;
		double vt;
		
		double h3;
		
		l2 = l - l1 - transition;
		h3 = h2 - (h2 - h1);
		
		v1 = l2 * h1 * w;
		v2 = l1 * h2 * w;
		v3 = transition * h1 * w;
		v4 = (1 / 2) * (transition * h3 * w);
		vt = 0.9 * (v1 + v2 + v3 + v4);
		
		System.out.println("You will need " + vt + " litres of water to fill up the pool.");
		
		///////////////////////////////////////////Liner///////////////////////////////////////////
		
		double s1;		// shallow end side
		double s2;		// deep end side
		double s3;		// end of deep end
		double s4;		// end of shallow end
		double s5;		// bottom of deep end
		double s6;		// bottom of shallow end
		double s7;		// bottom of transition
		double s8;		// above transition side
		double s9;		// transition triangle side
		double linerF;
		
		s1 = 2 * (h1 * l1);
		s2 = 2 * (h2 * l2);
		s3 = h2 * w;
		s4 = h1 * w;
		s5 = l2 * w;
		s6 = l1 * w;
		s7 = Math.hypot(transition, h3) * w;
		s8 = 2 * (h3 * transition);
		s9 = 2 * (transition * (h2 - h1));
		
		linerF = s1 + s2 + s3 + s4 + s5 + s6 + s7 + s8 + s9;
		
		System.out.println("You will need " + linerF + " square meters of liner.");
		
		/////////////////////////////////////////Liner Price///////////////////////////////////////

		
		double fGPrice;
		double cPrice;
		double vPrice;
		
		fGPrice = linerOne * linerF;
		cPrice = linerTwo * linerF;
		vPrice = linerThree * linerF;
		
		System.out.println("If you choose a fibreglass, it will cost $" + linerOne + " per square meter and $" + fGPrice + " total.");
		System.out.println("If you choose a concrete, it will cost $" + linerTwo + " per square meter and $" + cPrice + " total.");
		System.out.println("If you choose a vinyl, it will cost $" + linerThree + " per square meter and $" + vPrice + " total.");
		
		
	}

}
