/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P02) Write a program that randomly generates a
 license plate number based on the given criteria.
*/

public class HW06P02 {
	public static void main(String[] args) {
		// Generate three random characters corresponding to values from A-Z.
		char letter1 = (char)(65 + (int)(Math.random() * (26)));
		char letter2 = (char)(65 + (int)(Math.random() * (26)));
		char letter3 = (char)(65 + (int)(Math.random() * (26)));
		
		// Concatenate all three letter characters into a string.
		String letters = "" + letter1 + letter2 + letter3;
		
		// Generate four random integers on [0, 9].
		int digit1 = (int)(Math.random() * 10);
		int digit2 = (int)(Math.random() * 10);
		int digit3 = (int)(Math.random() * 10);
		int digit4 = (int)(Math.random() * 10);
		
		// Concatenate random number variables with empty string value.
		String numbers = "" + digit1 + digit2 + digit3 + digit4;
		
		// Combine strings each storing letters and numbers into new, comprehensive string variable: plateNum.
		String plateNum = letters + numbers;
		
		// Print result (license plate number).
		System.out.print("Your license plate number is: " + plateNum);
		
	}
}