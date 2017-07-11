/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/02/2017
 Purpose: (HW12P02) (Problem 5.50) Write a program that prompts
 the user for a string and displays the number of capital letters
 in that string.
 */

// Import Scanner.
import java.util.Scanner;

public class HW12P02 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for string, then store as variable.
		System.out.print("Enter a string: ");
		String userStr = input.nextLine();

		// Print the number of uppercase letters using method.
		System.out.println("The number of uppercase letters is " + getNumCapLetters(userStr));
	}
	
	// Define method which returns the number of capital letters in a string.
	public static int getNumCapLetters(String userStr) {
		// Declare and initialize integer variable for the number of capital letters.
		int numCapLetters = 0;
		
		/* Use for loop to check each character's case in the string, and
		   increment the variable for the number of capital letters as appropriate. */
		for (int i = 0; i < userStr.length(); i++) {
			char currentCh = userStr.charAt(i);
			
			if (Character.isUpperCase(currentCh)) {
				numCapLetters++;
			}
		}
		
		return numCapLetters;
	}

}
