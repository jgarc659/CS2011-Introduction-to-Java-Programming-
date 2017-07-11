/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/09/2017
 Purpose: (HW03P03) Write a program that generates a 
 random number between 1 and 12 and displays the English
 month name corresponding to that number.
 */

public class HW03P03 {
	public static void main(String[] args) {
		// Define variable "month" for randomly-generated number on [1, 12].
		int month = 1 + (int) (Math.random() * (12 - 1 + 1));
		System.out.print("Randomly-generated month: ");
		
		// Use "if" function to correlate "month" variable value to English month name by printing.
		if (month == 1) {
			System.out.print("January");
		}
		else if (month == 2) {
			System.out.print("February");
		}
		else if (month == 3) {
			System.out.print("March");
		}
		else if (month == 4) {
			System.out.print("April");
		}
		else if (month == 5) {
			System.out.print("May");
		}
		else if (month == 6) {
			System.out.print("June");
		}
		else if (month == 7) {
			System.out.print("July");
		}
		else if (month == 8) {
			System.out.print("August");
		}
		else if (month == 9) {
			System.out.print("September");
		}
		else if (month == 10) {
			System.out.print("October");
		}
		else if (month == 11) {
			System.out.print("November");
		}
		else if (month == 12) {
			System.out.print("December");
		}
	}
}