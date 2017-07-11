/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/23/2017
 Purpose: (HW05P04) Write a program that asks the user for a 
 character value, then prints whether it a letter, digit, or
 non-alphanumeric value.
*/

// Import scanner from Java class.
import java.util.Scanner;

public class HW05P04 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for a character, then store value in variable.
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);
		
		/* If char Unicode lies between those of characters 
		A and Z, classify as (print) a "uppercase letter" value. */
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase letter.");
		}
		/* If char Unicode lies between those of characters 
		a and z, classify as (print) a "lowercase letter" value. */
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase letter.");
		}
		/* If char Unicode lies between those of characters 
		0 and 9, classify as (print) a "digit" value. */
		else if (ch >= '0' && ch <= '9') {
			System.out.println("Digit.");
		}
		/* If char variable doesn't meet previous conditions, 
		classify as (print) a "non-alphanumeric" value. */
		else {
			System.out.println("Non-alphanumeric.");
		}
	}
}