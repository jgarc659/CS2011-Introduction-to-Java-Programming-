/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/09/2017
 Purpose: (HW03P05) Write a program that asks the user to enter
 a number of seconds, then translates it (depending on value) to
 minutes, hours, or days. 
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW03P05 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Call Scanner to store user input (number of seconds) in a variable.
		System.out.print("Enter a number of seconds: ");
		int secondsEntered = input.nextInt();
		
		// Create variables translating the value of seconds entered into days, minutes, and hours.
		int days = secondsEntered / 86400;
		int hours = (secondsEntered % 86400) / 3600;
		int minutes = (secondsEntered % 3600) / 60;
		int secondsRemaining = (secondsEntered % 60);
		
		/*
		Use "if" statement to determine whether the "days", "hours", "minutes", and/or "seconds" 
		value(s) should be printed, then print.
		*/
		if (secondsEntered >= 86400) {
			System.out.println(days + " days");
			System.out.println(hours + " hours");
			System.out.println(minutes + " minutes");
			System.out.println(secondsRemaining + " seconds");
		}
		else if (secondsEntered >= 3600) {
			System.out.println(hours + " hours");
			System.out.println(minutes + " minutes");
			System.out.println(secondsRemaining + " seconds");
		}
		else if (secondsEntered >= 60) {
			System.out.println(minutes + " minutes");
			System.out.println(secondsRemaining + " seconds");
		}
		else if (secondsEntered >= 0) {
			System.out.println(secondsEntered + " seconds");
		}
		else {
			System.out.println("Please enter a positive integer value.");
		}
	}
}