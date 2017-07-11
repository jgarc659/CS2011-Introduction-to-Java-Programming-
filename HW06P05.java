/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P05) Write a program that can take a series
 of ten letters and converts them to the corresponding phone
 number.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW06P05 {
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
		
		// Store each individual character from user input in a char variable.
		// Turn all letters upper case to make the forthcoming conversions simpler.
		char ch0 = userInput.toUpperCase().charAt(0);
		char ch1 = userInput.toUpperCase().charAt(1);
		char ch2 = userInput.toUpperCase().charAt(2);
		char ch3 = userInput.toUpperCase().charAt(3);
		char ch4 = userInput.toUpperCase().charAt(4);
		char ch5 = userInput.toUpperCase().charAt(5);
		char ch6 = userInput.toUpperCase().charAt(6);
		char ch7 = userInput.toUpperCase().charAt(7);
		char ch8 = userInput.toUpperCase().charAt(8);
		char ch9 = userInput.toUpperCase().charAt(9);
		
		// If character 0 is a letter, convert it to the corresponding number.
		if (ch0 >= 'A' && ch0 <= 'C') {
			ch0 = '2';
		}
		else if  (ch0 >= 'D' && ch0 <= 'F') {
			ch0 = '3';
		}
		else if  (ch0 >= 'G' && ch0 <= 'I') {
			ch0 = '4';
		}
		else if  (ch0 >= 'J' && ch0 <= 'L') {
			ch0 = '5';
		}
		else if  (ch0 >= 'M' && ch0 <= 'O') {
			ch0 = '6';
		}
		else if  (ch0 >= 'P' && ch0 <= 'S') {
			ch0 = '7';
		}
		else if  (ch0 >= 'T' && ch0 <= 'V') {
			ch0 = '8';
		}
		else if  (ch0 >= 'W' && ch0 <= 'Z') {
			ch0 = '9';
		}
	
		// If character 1 is a letter, convert it to the corresponding number.
		if (ch1 >= 'A' && ch1 <= 'C') {
			ch1 = '2';
		}
		else if  (ch1 >= 'D' && ch1 <= 'F') {
			ch1 = '3';
		}
		else if  (ch1 >= 'G' && ch1 <= 'I') {
			ch1 = '4';
		}
		else if  (ch1 >= 'J' && ch1 <= 'L') {
			ch1 = '5';
		}
		else if  (ch1 >= 'M' && ch1 <= 'O') {
			ch1 = '6';
		}
		else if  (ch1 >= 'P' && ch1 <= 'S') {
			ch1 = '7';
		}
		else if  (ch1 >= 'T' && ch1 <= 'V') {
			ch1 = '8';
		}
		else if  (ch1 >= 'W' && ch1 <= 'Z') {
			ch1 = '9';
		}
		
		// If character 2 is a letter, convert it to the corresponding number.
		if (ch2 >= 'A' && ch2 <= 'C') {
			ch2 = '2';
		}
		else if  (ch2 >= 'D' && ch2 <= 'F') {
			ch2 = '3';
		}
		else if  (ch2 >= 'G' && ch2 <= 'I') {
			ch2 = '4';
		}
		else if  (ch2 >= 'J' && ch2 <= 'L') {
			ch2 = '5';
		}
		else if  (ch2 >= 'M' && ch2 <= 'O') {
			ch2 = '6';
		}
		else if  (ch2 >= 'P' && ch2 <= 'S') {
			ch2 = '7';
		}
		else if  (ch2 >= 'T' && ch2 <= 'V') {
			ch2 = '8';
		}
		else if  (ch2 >= 'W' && ch2 <= 'Z') {
			ch2 = '9';
		}
		
		// If character 3 is a letter, convert it to the corresponding number.
		if (ch3 >= 'A' && ch3 <= 'C') {
			ch3 = '2';
		}
		else if  (ch3 >= 'D' && ch3 <= 'F') {
			ch3 = '3';
		}
		else if  (ch3 >= 'G' && ch3 <= 'I') {
			ch3 = '4';
		}
		else if  (ch3 >= 'J' && ch3 <= 'L') {
			ch3 = '5';
		}
		else if  (ch3 >= 'M' && ch3 <= 'O') {
			ch3 = '6';
		}
		else if  (ch3 >= 'P' && ch3 <= 'S') {
			ch3 = '7';
		}
		else if  (ch3 >= 'T' && ch3 <= 'V') {
			ch3 = '8';
		}
		else if  (ch3 >= 'W' && ch3 <= 'Z') {
			ch3 = '9';
		}
		
		// If character 4 is a letter, convert it to the corresponding number.
		if (ch4 >= 'A' && ch4 <= 'C') {
			ch4 = '2';
		}
		else if  (ch4 >= 'D' && ch4 <= 'F') {
			ch4 = '3';
		}
		else if  (ch4 >= 'G' && ch4 <= 'I') {
			ch4 = '4';
		}
		else if  (ch4 >= 'J' && ch4 <= 'L') {
			ch4 = '5';
		}
		else if  (ch4 >= 'M' && ch4 <= 'O') {
			ch4 = '6';
		}
		else if  (ch4 >= 'P' && ch4 <= 'S') {
			ch4 = '7';
		}
		else if  (ch4 >= 'T' && ch4 <= 'V') {
			ch4 = '8';
		}
		else if  (ch4 >= 'W' && ch4 <= 'Z') {
			ch4 = '9';
		}
		
		// If character 5 is a letter, convert it to the corresponding number.
		if (ch5 >= 'A' && ch5 <= 'C') {
			ch5 = '2';
		}
		else if  (ch5 >= 'D' && ch5 <= 'F') {
			ch5 = '3';
		}
		else if  (ch5 >= 'G' && ch5 <= 'I') {
			ch5 = '4';
		}
		else if  (ch5 >= 'J' && ch5 <= 'L') {
			ch5 = '5';
		}
		else if  (ch5 >= 'M' && ch5 <= 'O') {
			ch5 = '6';
		}
		else if  (ch5 >= 'P' && ch5 <= 'S') {
			ch5 = '7';
		}
		else if  (ch5 >= 'T' && ch5 <= 'V') {
			ch5 = '8';
		}
		else if  (ch5 >= 'W' && ch5 <= 'Z') {
			ch5 = '9';
		}
		
		// If character 6 is a letter, convert it to the corresponding number.
		if (ch6 >= 'A' && ch6 <= 'C') {
			ch6 = '2';
		}
		else if  (ch6 >= 'D' && ch6 <= 'F') {
			ch6 = '3';
		}
		else if  (ch6 >= 'G' && ch6 <= 'I') {
			ch6 = '4';
		}
		else if  (ch6 >= 'J' && ch6 <= 'L') {
			ch6 = '5';
		}
		else if  (ch6 >= 'M' && ch6 <= 'O') {
			ch6 = '6';
		}
		else if  (ch6 >= 'P' && ch6 <= 'S') {
			ch6 = '7';
		}
		else if  (ch6 >= 'T' && ch6 <= 'V') {
			ch6 = '8';
		}
		else if  (ch6 >= 'W' && ch6 <= 'Z') {
			ch6 = '9';
		}
		
		// If character 7 is a letter, convert it to the corresponding number.
		if (ch7 >= 'A' && ch7 <= 'C') {
			ch7 = '2';
		}
		else if  (ch7 >= 'D' && ch7 <= 'F') {
			ch7 = '3';
		}
		else if  (ch7 >= 'G' && ch7 <= 'I') {
			ch7 = '4';
		}
		else if  (ch7 >= 'J' && ch7 <= 'L') {
			ch7 = '5';
		}
		else if  (ch7 >= 'M' && ch7 <= 'O') {
			ch7 = '6';
		}
		else if  (ch7 >= 'P' && ch7 <= 'S') {
			ch7 = '7';
		}
		else if  (ch7 >= 'T' && ch7 <= 'V') {
			ch7 = '8';
		}
		else if  (ch7 >= 'W' && ch7 <= 'Z') {
			ch7 = '9';
		}
		
		// If character 8 is a letter, convert it to the corresponding number.
		if (ch8 >= 'A' && ch8 <= 'C') {
			ch8 = '2';
		}
		else if  (ch8 >= 'D' && ch8 <= 'F') {
			ch8 = '3';
		}
		else if  (ch8 >= 'G' && ch8 <= 'I') {
			ch8 = '4';
		}
		else if  (ch8 >= 'J' && ch8 <= 'L') {
			ch8 = '5';
		}
		else if  (ch8 >= 'M' && ch8 <= 'O') {
			ch8 = '6';
		}
		else if  (ch8 >= 'P' && ch8 <= 'S') {
			ch8 = '7';
		}
		else if  (ch8 >= 'T' && ch8 <= 'V') {
			ch8 = '8';
		}
		else if  (ch8 >= 'W' && ch8 <= 'Z') {
			ch8 = '9';
		}
		
		// If character 9 is a letter, convert it to the corresponding number.
		if (ch9 >= 'A' && ch9 <= 'C') {
			ch9 = '2';
		}
		else if  (ch9 >= 'D' && ch9 <= 'F') {
			ch9 = '3';
		}
		else if  (ch9 >= 'G' && ch9 <= 'I') {
			ch9 = '4';
		}
		else if  (ch9 >= 'J' && ch9 <= 'L') {
			ch9 = '5';
		}
		else if  (ch9 >= 'M' && ch9 <= 'O') {
			ch9 = '6';
		}
		else if  (ch9 >= 'P' && ch9 <= 'S') {
			ch9 = '7';
		}
		else if  (ch9 >= 'T' && ch9 <= 'V') {
			ch9 = '8';
		}
		else if  (ch9 >= 'W' && ch9 <= 'Z') {
			ch9 = '9';
		}
		
		// Concatenate all ten characters, now fully converted, into one String variable (which is formatted like a phone number).
		String phoneNum = "(" + ch0 + ch1 + ch2 + ") " + ch3 + ch4 + ch5 + "-" + ch6 + ch7 + ch8 + ch9;
		
		// Print result.
		System.out.print("Phone Number: " + phoneNum);
	}
}
