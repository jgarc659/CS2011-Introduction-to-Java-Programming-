/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/20/2017
 Purpose: (HW10P01) Write a program that validates a user's
 password based on the properties listed (length, number of 
 digits, number of letters, number of uppercase letters, and
 number of non-alphanumeric characters.)
*/

// Import Scanner
import java.util.Scanner;

public class HW10P01 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for password, then store in String variable.
		System.out.print("Please enter a password: ");
		String password = input.next();
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// If password is valid, print statement saying so.
		if (isValid(password)) {
			System.out.println("The password is valid.");
		}
		// If password is not valid...
		else {
			// Print statement claiming that password is not valid...
			System.out.println("The password is invalid due to:");
			// And print statements describing all conditions that are not met.
			if (!(containsThirteenCharacters(password))) {
				System.out.println("Insufficient password length (at least 13 characters required)");
			}
			if (!(containsFourDigits(password))) {
				System.out.println("Insufficient number of digits (at least 4 digits required)");
			}
			if (!(containsSevenLetters(password))) {
				System.out.println("Insufficient number of letters (at least 7 letters required)");
			}
			if (!(containsThreeCapLetters(password))) {
				System.out.println("Insufficient number of uppercase letters (at least 3 uppercase letters required)");
			}
			if (!(containsTwoSpecialCharacters(password))) {
				System.out.println("Insufficient number of non-alphanumeric characters (at least 2 non-alphanumeric characters required)");
			}
		}
	}
	
	// Define boolean-returning method which returns true if all password-validation conditions (defined in methods below) are met.
	public static boolean isValid(String password) {
		if (containsThirteenCharacters(password) && containsFourDigits(password) && 
		containsSevenLetters(password) && containsThreeCapLetters(password) && containsTwoSpecialCharacters(password)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method which checks password for at least 13 characters.
	public static boolean containsThirteenCharacters(String password) {
		if (password.length() >= 13) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method which checks password for at least 4 digits.
	public static boolean containsFourDigits(String password) {
		int numDigits = 0;
		
		for (int i = 0; i <= (password.length() - 1); i++) {
			char currentCh = password.charAt(i);
			if (Character.isDigit(currentCh)) {
				numDigits++;
			}
		}
		if (numDigits >= 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method which checks password for at least 7 letters.
	public static boolean containsSevenLetters(String password) {
		int numLetters = 0;
		
		for (int i = 0; i <= (password.length() - 1); i++) {
			char currentCh = password.charAt(i);
			if (Character.isLetter(currentCh)) {
				numLetters++;
			}
		}
		if (numLetters >= 7) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method which checks password for at least 3 uppercase letters.
	public static boolean containsThreeCapLetters(String password) {
		int numCapLetters = 0;
		
		for (int i = 0; i <= (password.length() - 1); i++) {
			char currentCh = password.charAt(i);
			if (currentCh >= 'A' && currentCh <= 'Z') {
				numCapLetters++;
			}
		}
		if (numCapLetters >= 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method which checks password for at least 2 non-alphanumeric characters.
	public static boolean containsTwoSpecialCharacters(String password) {
		int numSpecialCharacters = 0;
		
		for (int i = 0; i <= (password.length() - 1); i++) {
			char currentCh = password.charAt(i);
			if (!(Character.isLetter(currentCh)) && !(Character.isDigit(currentCh))) {
				numSpecialCharacters++;
			}
		}
		if (numSpecialCharacters >= 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
