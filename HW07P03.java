/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/14/2017
 Purpose: (HW07P03) Write a program that reads in an unknown
 amount of input and computes the mean and standard deviation
 of the input.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW07P03 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare & initialize variable for user input (for use in loop).
		double numbers = 0;
		// Declare & initialize variable for the sum of all positive user input (for use in loop).
		double total = 0;
		// Declare & initialize variable counting the number of positive values entered (for use in loop).
		int count = 0;
		// Declare & initialize variable for the sum of the squares of all user input (for use in loop).
		double sigmaXSquared = 0;
		
		// Prompt user for positive numbers.
		System.out.print("Enter positive numbers (-1 to end input): ");
		
		// While the input variable "numbers" doesn't match -1, continuously record double values from Scanner and perform actions accordingly.
		while (numbers != -1) {
			// Store user input in numbers variable.
			numbers = input.nextDouble();
			// Input Validation: If user input is a negative value other than 1, print error message and allow user to continue.
			if (numbers < 0 && numbers != -1) { 
				System.out.println("");
				System.out.println("ERROR: The only negative value allowed is -1 (to end input).");
				System.out.print("Please continue entering your numbers: ");
			}
			// If input fits conditions, update counting, total, and sigma (x^2) values accordingly.
			if (numbers >= 0) {
				count++;
				total += numbers;	
				sigmaXSquared += Math.pow(numbers, 2);
			}
		}
		
		// Declare variables containing formulas for standard deviation and mean.
		double deviation = Math.sqrt((sigmaXSquared - ((1.0 / count) * (Math.pow(total, 2))))/(count - 1));
		double mean = total / count;
		
		// Print output (mean and standard deviation), formatted like sample.
		System.out.println("");
		System.out.printf("%-14s","Mean:");
		System.out.println(mean);
		System.out.printf("%-14s","Deviation:");
		System.out.println(deviation);
	}
}
