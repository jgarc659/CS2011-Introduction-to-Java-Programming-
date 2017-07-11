/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/20/2017
 Purpose: (HW10P02) Write a program that will find the standard
 deviation of a list of numbers found in a file.
*/

// Import Scanner class.
import java.util.Scanner;
// Import File class.
import java.io.File;
// Import FileNotFoundException class.
import java.io.FileNotFoundException;

public class HW10P02 {
	// Declare Scanner object.
	static Scanner input = new Scanner(System.in);
	
	// Main method.
	public static void main(String[] args) {
		// Prompt user for file name.
		System.out.print("Enter the name of the file: ");
		// Store user-defined filename in string variable, then embed that filename in new file variable.
		String fileName = input.next();
		File inputFile = new File(fileName);
		
		// Use method to compute deviation, then store in double variable.
		double deviation = deviation(inputFile);
		
		// Print standard deviation.
		System.out.println("\nThe standard deviation of the values in this file is: " + deviation);
	}
	
	// Define method that accepts an input file and returns, as a double value, the standard deviation of the numbers within the file.
	public static double deviation(File inputFile) {
		// Use try/catch to make Scanner read values from user-defined input file.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException exception) {
			// If the file name doesn't exist, exit program.
			System.out.println("\nERROR: File not found. Program will now exit.");
			System.exit(1);
		}
		
		// Declare & initialize variable for user input (for use in loop).
		double numbers = 0;
		// Declare & initialize variable for the sum of all positive user input (for use in loop).
		double total = 0;
		// Declare & initialize variable counting the number of positive values entered (for use in loop).
		int count = 0;
		// Declare & initialize variable for the sum of the squares of all user input (for use in loop).
		double sigmaXSquared = 0;
		
		// While there are still numbers in the input file, continuously record double values from Scanner and perform actions accordingly.
		while (input.hasNext()) {
			// Store user input in numbers variable.
			numbers = input.nextDouble();
			// Update counting, total, and sigma (x^2) values accordingly.
			if (numbers >= 0) {
				count++;
				total += numbers;	
				sigmaXSquared += Math.pow(numbers, 2);
			}
		}
		
		// Declare variable calculating standard deviation using formula.
		double deviation = computeDeviation(total, count, sigmaXSquared);
		// Return double value for standard deviation.
		return deviation;
	}
	
	// Define method that computes the deviation.
	public static double computeDeviation(double total, int count, double sigmaXSquared) {
		double deviation = Math.sqrt((sigmaXSquared - ((1.0 / count) * (Math.pow(total, 2))))/(count - 1));
		return deviation;
	}
}