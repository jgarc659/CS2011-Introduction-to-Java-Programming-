/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P03) Write a program that determines whether
 or not a given social security number is valid or not.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW06P03 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for social security number, then store input in String variable.
		System.out.print("Enter a social security number: ");
		String socialSecurityNum = input.nextLine();
		
		// Input Validation: If input matches specified format, number is valid. Otherwise, it is not valid.
		// First, validate that the length of the input is 11.
		if (socialSecurityNum.length() == 11) {
			// If input is 11 characters long, store each character in a variable.
			char char0 = socialSecurityNum.charAt(0);
			char char1 = socialSecurityNum.charAt(1);
			char char2 = socialSecurityNum.charAt(2);
			char char3 = socialSecurityNum.charAt(3);
			char char4 = socialSecurityNum.charAt(4);
			char char5 = socialSecurityNum.charAt(5);
			char char6 = socialSecurityNum.charAt(6);
			char char7 = socialSecurityNum.charAt(7);
			char char8 = socialSecurityNum.charAt(8);
			char char9 = socialSecurityNum.charAt(9);
			char char10 = socialSecurityNum.charAt(10); 
			// If digits and dashes are entered in the format-specified positions, print that the input is valid.
			/* Conditional statement personally seems to read a little too long. Could this be simplified with 
			loops, or am I missing something fundamental that we've already covered? */
			if (char0 >= '0' && char0 <= '9' && char1 >= '0' && char1 <= '9' && char2 >= '0' && char2 <= '9' 
			&& char3 == '-' && char4 >= '0' && char4 <= '9' && char5 >= '0' && char5 <= '9' && char6 == '-' 
			&& char7 >= '0' && char7 <= '9' && char8 >= '0' && char8 <= '9' && char9 >= '0' && char9 <= '9' 
			&& char10 >= '0' && char10 <= '9') {
				System.out.println(socialSecurityNum + " is a valid number.");
			}
			// If any characters from the input do not fit the above specifications, print that the input is not valid.
			else {
				System.out.println(socialSecurityNum + " is not a valid number.");
			}
		}
		// If input is not 11 characters long, print that it is not valid.
		else {
			System.out.println(socialSecurityNum + " is not a valid number.");
		}
	}
}
