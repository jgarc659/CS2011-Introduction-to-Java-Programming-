/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/09/2017
 Purpose: (HW03P01) Write a program that asks the user for a floating-point
 number and describes it as "zero", "positive" or "negative", and/or "small"
 or "large".
*/

// Import scanner from Java class.
import java.util.Scanner;

public class HW03P01 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Call scanner to record user input (a floating-point number).
		System.out.print("Enter a floating-point number: ");
		double number = input.nextDouble();
		
		// Print "zero" when the input variable (number) is zero
		if (number == 0) {
			System.out.print("zero");
		}
		
		/*
		Print "positive" or "negative" when the input variable (number) 
		is either positive or negative, but doesn't satisfy the "large" 
		or "small" conditions. 
		*/
		if (number > 0) {
			if (1 < Math.abs(number)) {
				if (Math.abs(number) < 1000000) {
				System.out.print("positive");
				}
			}
		}
		else if (number < 0) {
			if (1 < Math.abs(number)) {
				if (Math.abs(number) < 1000000) {
				System.out.print("negative");
				}
			}
		}
		
		/*
		Print "small" when the input variable (number) satistfies
		the condition and doesn't equal zero, and add either ", 
		positive" or ", negative".
		*/
		if (number != 0) {
			if (Math.abs(number) < 1) {
				System.out.print("small");
				if (number > 0) {
					System.out.print(", positive");
				}
				else if (number < 0) {
					System.out.print(", negative");
				}
			}
		}
		
		/*
		Print "large" when the input variable (number) satistfies
		the condition, and add either ", positive" or ", negative".
		*/
		if (Math.abs(number) > 1000000){
			System.out.print("large");
			if (number > 0) {
				System.out.print(", positive");
			}
			else if (number < 0) {
				System.out.print(", negative");
			}
		}

		
	}
}