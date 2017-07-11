/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/02/2017
 Purpose: (HW12P01) (Problem 4.11) Write a program that prompts the
 user to enter an integer between 0 and 15 and displays its
 corresponding hexadecimal number.
 */

// Import Scanner.
import java.util.Scanner;

public class HW12P01 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for decimal value and store input as integer.
		System.out.print("Enter a decimal value (0 to 15): ");
		int number = input.nextInt();
		
		// If the number is on [0, 15], display its hex value.
		if (isValid(number)) {
			String hexValue = getHexValue(number);
			System.out.println("The hex value is " + hexValue);
		}
		// If the number does not lie on [0, 15], display that it is invalid.
		else {
			System.out.println(number + " is an invalid input");
		}
		
	}
	
	// Define method which returns boolean value based on whether the number is on [0, 15].
	public static boolean isValid(int number) {
		if (number >= 0 && number <= 15) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define method which returns the corresponding hexadecimal value of a number as a string.
	public static String getHexValue(int number) {
		String hexValue = "";
		if (number <= 9) {
			hexValue += number;
		}
		else {
			hexValue += getLetter(number);
		}
		
		return hexValue;
	}
	
	// Define method which returns (as a character type) the letter corresponding to a decimal input.
	public static char getLetter (int number) {
		char[] letterList = {'A', 'B', 'C', 'D', 'E', 'F'};
		char letter = letterList[number - 10];
		return letter;
	}

}
