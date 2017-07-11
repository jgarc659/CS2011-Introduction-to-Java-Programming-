/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/14/2017
 Purpose: (HW04P03) Write a program that prompts the user to
 enter a year, month, and day of the month, and displays the
 name of the day of the week.
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW04P03 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Call scanner to prompt the user for the year, month, and day of the month.
		System.out.print("Enter year (i.e. 2012): ");
		int year = input.nextInt();
		System.out.print("Enter month (1-12): ");
		int m = input.nextInt();
		System.out.print("Enter the day of the month: ");
		int q = input.nextInt();
		
		// Input validation: Terminate program if input values are negative or out of range.
		if (year < 0 || m < 0 || q < 0) {
			System.out.println(" ");
			System.out.print("ERROR: Values cannot be negative.");
			System.exit(1);
		}
		if (m < 1 || m > 12) {
			System.out.println(" ");
			System.out.print("ERROR: Month value is out of range.");
			System.exit(1);
		}
		if (q < 1 || q > 31) {
			System.out.println(" ");
			System.out.print("ERROR: Day of the month value is out of range.");
			System.exit(1);
		}		
		
		// Assign new values to "m" and "year" variables if special conditions are met.
		if (m == 1 || m == 2) {
			m += 12;
			year -= 1;
		}
		
		// Calculate j and k variables using "year" input.
		int j = year / 100;
		int k = year % 100;
		
		// Declare variable "h" calculating day of the week (in number form) according to Zeller's Congruence Algorithm.
		int h = (q + ((26 * (m + 1))/10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		// Declare/initialize variable for English-languange day of the week value.
		String dayOfWeek = "Placeholder";
		
		// Assign a string value to dayOfWeek variable according to number calculated in variable h.
		switch (h) {
			case 0:
				dayOfWeek = "Saturday";
				break;
			case 1:
				dayOfWeek = "Sunday";
				break;
			case 2:
				dayOfWeek = "Monday";
				break;
			case 3:
				dayOfWeek = "Tuesday";
				break;
			case 4:
				dayOfWeek = "Wednesday";
				break;
			case 5:
				dayOfWeek = "Thursday";
				break;
			case 6:
				dayOfWeek = "Friday";
				break;
		}
		
		// Print the day of the week.	
		System.out.println(" ");
		System.out.print("The day of the week is " + dayOfWeek + ".");
	}
}