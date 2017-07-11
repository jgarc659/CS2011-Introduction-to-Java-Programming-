/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P01) Write a program that reads two strings
 of any length from the console and displays information
 about the strings.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW06P01 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter two strings and store them in variables.
		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();
		
		// Empty line (for aesthetic purposes).
		System.out.println("");
		
		// Print length of both strings entered by user.
		System.out.println("\"" + str1 + "\" has " + str1.length() + " characters.");
		System.out.println("\"" + str2 + "\" has " + str2.length() + " characters.");
		
		// Empty line.
		System.out.println("");
		
		// Declare two new string variables which store lower case versions of the two input strings.
		String str1LowerCase = str1.toLowerCase();
		String str2LowerCase = str2.toLowerCase();
		
		// Use lower case string variables to determine whether string 1 (str1) is a substring of string 2 (str2) and where.
		if (str2LowerCase.contains(str1LowerCase)) {
			System.out.print("\"" + str1 + "\" is a substring of \"" + str2 + "\" and appears at the ");
			if (str2LowerCase.startsWith(str1LowerCase) && str2LowerCase.endsWith(str1LowerCase)) {
				System.out.println("beginning, middle, and end of the string.");
			}
			else if (str2LowerCase.startsWith(str1LowerCase)) {
				System.out.println("beginning of the string.");
			}
			else if (str2LowerCase.endsWith(str1LowerCase)) {
				System.out.println("end of the string.");
			}
			else {
				System.out.println("middle of the string.");
			}
		}
		else {
			System.out.println("\"" + str1 + "\" is not a substring of \"" + str2 + "\".");
		}
		
		// Use lower case string variables to determine whether string 2 (str2) is a substring of string 1 (str1) and where.
		if (str1LowerCase.contains(str2LowerCase)) {
			System.out.print("\"" + str2 + "\" is a substring of \"" + str1 + "\" and appears at the ");
			if (str1LowerCase.startsWith(str2LowerCase) && str1LowerCase.endsWith(str2LowerCase)) {
				System.out.println("beginning, middle, and end of the string.");
			}
			else if (str1LowerCase.startsWith(str2LowerCase)) {
				System.out.println("beginning of the string.");
			}
			else if (str1LowerCase.endsWith(str2LowerCase)) {
				System.out.println("end of the string.");
			}
			else {
				System.out.println("middle of the string.");
			}
		}
		else {
			System.out.println("\"" + str2 + "\" is not a substring of \"" + str1 + "\".");
		}
		
		// Empty line.
		System.out.println("");
		
		// Compare string 1 to string 2 and print comparison statement based on whether result is negative, positive, or zero.
		if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal.");
		}
		else if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not equal and \"" + str1 + "\" is alphabetically less than \"" + str2 + "\".");
		}
		else if (str1.compareToIgnoreCase(str2) > 0) {
			System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not equal and \"" + str1 + "\" is alphabetically greater than \"" + str2 + "\".");
		}
	}
}