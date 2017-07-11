/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/14/2017
 Purpose: (HW07P04) Write a program that approximates PI for
 i = 10000, 20000, 30000, ..., 100000.
*/

public class HW07P04 {
	public static void main(String[] args) {
		
		// Declare and initialize ten dummy double variables intended to store pi approximations for all ten values of i.
		double pi1 = 0;
		double pi2 = 0;
		double pi3 = 0;
		double pi4 = 0;
		double pi5 = 0;
		double pi6 = 0;
		double pi7 = 0;
		double pi8 = 0;
		double pi9 = 0;
		double pi10 = 0;
		
		// Declare variable storing the highest value of i intended for use in computations, 100000.
		int iMax = 100000;
		
		// Declare and initialize three numeric variables for computations in formula within loop.
		double denom = 1;
		double pi =  0;
		int power = 0;
		
		// Run loop continuously until PI reaches its highest value at i = 100000.
		while (denom <= (2 * iMax) - 1) {
			pi += 4 * (Math.pow(-1, power) / denom);
			
			/* If the denominator reaches a value corresponding to that of one of the listed values 
			of i, store the current pi value as one of the answers. */
			if (denom == 19999) {
				pi1 += pi;
			}
			else if (denom == 39999) {
				pi2 += pi;
			}
			else if (denom == 59999) {
				pi3 += pi;
			}
			else if (denom == 79999) {
				pi4 += pi;
			}
			else if (denom == 99999) {
				pi5 += pi;
			}
			else if (denom == 119999) {
				pi6 += pi;
			}
			else if (denom == 139999) {
				pi7 += pi;
			}
			else if (denom == 159999) {
				pi8 += pi;
			}
			else if (denom == 179999) {
				pi9 += pi;
			}
			else if (denom == 199999) {
				pi10 += pi;
			}
			
			// Add two to denominator.
			denom += 2;
			// Add one to the power of -1 in the numerator
			power++;
		}
			
		// As a result of being limited to one loop, type all print statements individually.
		/* Note that I used literal "i" values instead of declaring and inserting variables because doing that here would 
		ultimately serve no practical, computational purpose other than slightly streamlining the print statements below.*/
		System.out.println("when i == 10000,  PI = " + pi1);
		System.out.println("when i == 20000,  PI = " + pi2);
		System.out.println("when i == 30000,  PI = " + pi3);
		System.out.println("when i == 40000,  PI = " + pi4);
		System.out.println("when i == 50000,  PI = " + pi5);
		System.out.println("when i == 60000,  PI = " + pi6);
		System.out.println("when i == 70000,  PI = " + pi7);
		System.out.println("when i == 80000,  PI = " + pi8);
		System.out.println("when i == 90000,  PI = " + pi9);
		System.out.println("when i == 100000, PI = " + pi10);
	}
}
