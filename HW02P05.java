/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/02/2017
 Purpose: (HW02P05) Write a program that asks the
 user to enter a floating-point number. Split the
 number into its integer and fractional parts and
 display them seperately.
*/

// Import a Scanner from the java.util package.
import java.util.Scanner;

public class HW02P05 {
	public static void main(String[] args) {
		// Establish Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Use scanner's double method to record user input.
		System.out.print("Enter a floating-point value: ");
		double number = input.nextDouble();
		
		// Define variables for both the integer and fraction parts using the user input "number".
		int integer = (int)number;
		double fraction = number % 1;
		
		// Print the result.
		System.out.println("Integer Part: " + integer);
		System.out.println("Fractional Part: " + fraction);
	}
}