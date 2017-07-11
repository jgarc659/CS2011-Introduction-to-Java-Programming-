/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/14/2017
 Purpose: (HW04P05) Write a program that asks the user, via menu
 choice, which internet service they have, which month they are
 being billed, and how many hours they used. Then, display the cost 
 of his/her bill and how much this person would save by purchasing
 other packages.
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW04P05 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Create string variable storing menu text.
		final String USER_MENU =
			"Package 1: $15.95 a month for up to 10 hours of service. Additional hours are $2.00 per hour.\n" +
			"Package 2: $20.95 a month for up to 20 hours of service. Additional hours are $1.00 per hour.\n" +
			"Package 3: $30.99 per month unlimited access.\n" +
			" \n" +
			"Enter your plan: ";
		
		// Create constants corresponding to possible user input values.
		final int PLAN_1 = 1;
		final int PLAN_2 = 2;
		final int PLAN_3 = 3;
		
		// Print menu and prompt user for choice.
		System.out.print(USER_MENU);
		int planChoice = input.nextInt();
		
		// Input Validation: If plan choice is out of range, terminate program.
		if (planChoice < 1 || planChoice > 3) {
			System.out.println(" ");
			System.out.println("ERROR: Please choose a value from 1-3.");
			System.out.print("Program will now exit.");
			System.exit(1);
		}
		
		// Prompt user for month number, then store value in variable.
		System.out.print("Enter the month number (1-12) you are being billed: ");
		int monthNum = input.nextInt();
		
		// Input Validation: If month number is out of range, terminate program.
		if (monthNum < 1 || monthNum > 12) {
			System.out.println(" ");
			System.out.println("ERROR: Please enter a month number from 1-12.");
			System.out.print("Program will now exit.");
			System.exit(1);
		}
		
		// Prompt user for number of hours used, then store value in variable.
		System.out.print("Enter the number of hours used: ");
		int hoursUsed = input.nextInt();
		
		// Input Validation: If hours used value is negative, terminate program.
		if (hoursUsed < 0) {
			System.out.println(" ");
			System.out.println("ERROR: Hours entered cannot be negative.");
			System.out.print("Program will now exit.");
			System.exit(1);
		}
		
		// Input Validation: If hours used exceeds amount possible in month, terminate program.
		if (monthNum == 1 || monthNum == 3 || monthNum == 5 || monthNum == 7 || monthNum == 8 || monthNum == 10 || monthNum == 12) { 
			if (hoursUsed > 744) {
				System.out.println(" ");
				System.out.println("ERROR: Hours entered exceed amount possible in month.");
				System.out.print("Program will now exit.");
				System.exit(1);
			}
		}
		else if (monthNum == 4 || monthNum == 6 || monthNum == 9 || monthNum == 11) {
			if (hoursUsed > 720) {
				System.out.println(" ");
				System.out.println("ERROR: Hours entered exceed amount possible in month.");
				System.out.print("Program will now exit.");
				System.exit(1);
			}
		}
		else if (monthNum == 2) {
			if (hoursUsed > 672) {
				System.out.println(" ");
				System.out.println("ERROR: Hours entered exceed amount possible in month.");
				System.out.print("Program will now exit.");
				System.exit(1);
			}
		}
		
		// Declare and initialize variables for all 3 possible total cost values.
		double total1 = 0;
		double total2 = 0;
		final double TOTAL_3 = 30.99;
		
		// Redefine total cost variables according to listed formulae.
		if (hoursUsed <= 10) {
			total1 = 15.95;
		}
		else {
			total1 = 15.95 + ((hoursUsed - 10) * 2.0);
		}
		
		if (hoursUsed <= 20) {
			total2 = 20.95;
		}
		else {
			total2 = 20.95 + (hoursUsed - 10);
		}
		
		// Print total cost according to user's plan choice.
		if (planChoice == PLAN_1) {
			System.out.println("The total cost of the bill will be $" + total1);
		}
		else if (planChoice == PLAN_2) {
			System.out.println("The total cost of the bill will be $" + total2);
		}
		else if (planChoice == PLAN_3) {
			System.out.println("The total cost of the bill will be $" + TOTAL_3);
		}
		
		// If there exist possibilities for savings with other plans, calculate and print the theoretical amount.
		if (planChoice == PLAN_1) {
			if (total1 > total2) {
				System.out.println("You would have saved $" + (total1 - total2) + " by switching to package 2.");
			}	
			if (total1 > TOTAL_3) {
				System.out.println("You would have saved $" + (total1 - TOTAL_3) + " by switching to package 3.");
			}
		}
		if (planChoice == PLAN_2) {
			if (total2 > TOTAL_3) {
				System.out.println("You would have saved $" + (total2 - TOTAL_3) + " by switching to package 3.");
			}
		}
	}
}