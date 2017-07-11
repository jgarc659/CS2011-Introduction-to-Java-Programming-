/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/13/2017
 Purpose: (HW09P05) Write a program that reads a single
 word and displays all possible substrings of the word.
*/

// Import Scanner
import java.util.Scanner;

public class HW09P05 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for word, then store result in string variable.
		System.out.print("Enter a word: ");
		String word = input.next();
		
		// Empty line - for aesthetic purposes.
		System.out.println();
		
		// Call method which prints the list of substrings.
		printSubstringList(word);
	}
	
	// Define void method meant to print a list of substrings.
	public static void printSubstringList(String word) {
		// Use nested loops to compute every possible substring.
		for (int i = 1; i <= word.length(); i++) {
			for (int j = 0; (j + i) <= word.length(); j++) {
				System.out.println(word.substring(j, (j + i)));
			}
		}
	}
	
}