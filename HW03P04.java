/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/09/2017
 Purpose: (HW03P04) Write a program that asks the user for today's
 day of the week, a future day of the week, prints both, and prints
 the days elapsed between both.
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW03P04 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		
		// Prompt the user to enter today's day (on [1,6]) amd the number of days elapsed to reach the future day.
		System.out.print("Enter today's day: ");
		int todayNum = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		
		// Calculate the day of the week the future day lands on.
		int futureDayNum = (daysElapsed + todayNum) % 7;
		
		// Declare two strings to store the names of the days of the week.
		String todayName = "Placeholder string";
		String futureDayName = "Placeholder string";
		
		// Match user input with the corresponding English day of the week.
		if (todayNum == 0){
			todayName = "Sunday";
		}
		else if (todayNum == 1){
			todayName = "Monday";
		}
		else if (todayNum == 2){
			todayName = "Tuesday";
		}
		else if (todayNum == 3){
			todayName = "Wednesday";
		}
		else if (todayNum == 4){
			todayName = "Thursday";
		}
		else if (todayNum == 5){
			todayName = "Friday";
		}
		else if (todayNum == 6){
			todayName = "Saturday";
		}
		
		// Match calculated future day number with English name of day.
		if (futureDayNum == 0){
			futureDayName = "Sunday";
		}
		else if (futureDayNum == 1){
			futureDayName = "Monday";
		}
		else if (futureDayNum == 2){
			futureDayName = "Tuesday";
		}
		else if (futureDayNum == 3){
			futureDayName = "Wednesday";
		}
		else if (futureDayNum == 4){
			futureDayName = "Thursday";
		}
		else if (futureDayNum == 5){
			futureDayName = "Friday";
		}
		else if (futureDayNum == 6){
			futureDayName = "Saturday";
		}
		
		// Print the results if the initial user input was between 0 and 6. Otherwise, display error message.
		if (0 <= todayNum) {
			if (todayNum <= 6) {
			System.out.print("Today is " + todayName + " and the future day is " + futureDayName);
			}
			else {
			System.out.print("ERROR: For the current day value, please enter an integer from zero to six.");
			}
		}
		else {
		System.out.print("ERROR: For the current day value, please enter an integer from zero to six.");
		}
	}
}