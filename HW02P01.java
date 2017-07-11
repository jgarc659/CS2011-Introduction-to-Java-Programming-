/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/02/2017
 Purpose: (HW02P01) Write a program that converts U.S 
 dollars to pounds, euros, and yen.
*/

// Import a Scanner from the java.util package.
import java.util.Scanner;

public class HW02P01 {
	public static void main(String[] args) {
		// Establish Scanner object.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a dollar amount: ");
		// Use scanner's double method to record user input.
		double dollars = input.nextDouble();
		System.out.println(" ");
		
		// Define named constants for the three currency conversion rates.
		final double POUNDS = dollars * 0.76;
		final double EUROS = dollars * 0.89;
		final double YEN = dollars * 101.88;
		
		// Print results.
		System.out.println("Pounds: " + POUNDS);
		System.out.println("Euros: " + EUROS);
		System.out.println("Yen: " + YEN);
	}
}