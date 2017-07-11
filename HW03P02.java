/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/09/2017
 Purpose: (HW03P02) Write a program that asks the user for values
 a, b, and c, then, based on the quadratic equation, defines the 
 number of roots and the roots themselves.
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW03P02 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Call scanner to record user input (values a, b, and c).
		System.out.println("Enter the a, b, and c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// Calculate new variables based on formulae provided.
		double discriminant = Math.pow(b, 2) - (4 * a * c);
		double r1 = ((- b) + Math.sqrt(discriminant)) / (2 * a);
		double r2 = ((- b) - Math.sqrt(discriminant)) / (2 * a);
		
		// Print both roots when the calculated discriminant is positive.
		if (discriminant > 0) {
			System.out.print("The equation has two roots " + r1 + " and " + r2);
		}
		// Print single root when the calculated discriminant equals zero.
		else if (discriminant == 0) {
			System.out.print("The equation has one root " + r1);
		}
		/* 
		Otherwise print the statement "The equation has no real roots"
		(assuming the discriminant is negative).
		*/ 
		else {
			System.out.print("The equation has no real roots.");
		}	
	}
}