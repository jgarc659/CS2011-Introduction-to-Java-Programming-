/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/02/2017
 Purpose: (HW02P03) Write a program that asks the user for the x
 and y values of two points (x1, y1) and (x2, y2) and displays 
 the distance between them.
*/

// Import a Scanner from the java.util package.
import java.util.Scanner;

public class HW02P03 {
	public static void main(String[] args) {
		// Establish Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Use scanner's double method to record user input 
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Define variable containing the distance formula that implements previous user input.
		double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		// Print the result.
		System.out.println(" ");
		System.out.println("The distance between point (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is : " + dist);
	}
}