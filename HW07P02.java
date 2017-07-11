/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/14/2017
 Purpose: (HW07P02) Rewrite HW06P05 using loops.
 (HW06P05 PURPOSE: Write a program that can take a series
 of ten letters and converts them to the corresponding phone
 number.)
*/

// Lines of Code (Original): 310
// Lines of Code (w/ Loops): 82

// Import Scanner from Java class.
import java.util.Scanner;

public class HW07P02 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input, then store value in String variable.
		System.out.print("Enter input: ");
		String userInput = input.next();

		// Input Validation: If user input isn't ten characters long, terminate program.
		if (userInput.length() != 10) {
			System.out.println("ERROR: Input must be exactly ten (10) characters long");
			System.out.println("Program will now exit.");
			System.exit(1);
		}
		
		// Turn all letters upper case to make the forthcoming conversions simpler.
		userInput = userInput.toUpperCase();
		
		// This integer will be used as an index counter in the loop below.
		int count = 0;
		// This dummy string will be concatenated with the phone number char digits in the loop below.
		String currentCh = "";
		
		// Convert each letter character from user input to its corresponding number using loop.
		while (count <= 9) {
			if (userInput.charAt(count) >= 'A' && userInput.charAt(count) <= 'C') {
				currentCh += '2';
			}
			else if  (userInput.charAt(count) >= 'D' && userInput.charAt(count) <= 'F') {
				currentCh += '3';
			}
			else if  (userInput.charAt(count) >= 'G' && userInput.charAt(count) <= 'I') {
				currentCh += '4';
			}
			else if  (userInput.charAt(count) >= 'J' && userInput.charAt(count) <= 'L') {
				currentCh += '5';
			}
			else if  (userInput.charAt(count) >= 'M' && userInput.charAt(count) <= 'O') {
				currentCh += '6';
			}
			else if  (userInput.charAt(count) >= 'P' && userInput.charAt(count) <= 'S') {
				currentCh += '7';
			}
			else if  (userInput.charAt(count) >= 'T' && userInput.charAt(count) <= 'V') {
				currentCh += '8';
			}
			else if  (userInput.charAt(count) >= 'W' && userInput.charAt(count) <= 'Z') {
				currentCh += '9';
			}
			else {
				currentCh += userInput.charAt(count);
			}
			count++;
		}
		
		// Concatenate all ten characters from currentCh String into one String variable formatted like a phone number.
		String phoneNum = "(" + currentCh.charAt(0) + currentCh.charAt(1) + currentCh.charAt(2) + ") " + currentCh.charAt(3) + currentCh.charAt(4) 
		+ currentCh.charAt(5) + "-" + currentCh.charAt(6) + currentCh.charAt(7) + currentCh.charAt(8) + currentCh.charAt(9);
				
		// Print result.
		System.out.print("Phone Number: " + phoneNum);
	}
}