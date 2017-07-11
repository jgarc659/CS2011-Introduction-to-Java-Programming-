/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/23/2017
 Purpose: (HW05P01) Write a program that asks the user for the
 side length of a hexagon, then computes and prints the hexagon's 
 area.
*/

// Import scanner from Java class.
import java.util.Scanner;

public class HW05P01 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
				
		// Prompt user for side length, then store value in variable
		System.out.print("Enter the length of a side of the hexagon: ");
		double length = input.nextDouble();
		System.out.println(" ");
		
		// Input Validation: If input (side length) is negative, terminate program.
		if (length < 0) {
			System.out.println("ERROR: Side length cannot be negative.");
			System.out.println("Program will now exit.");
			System.exit(1);
		}
		// If input is positive, compute and print area to three decimal places.
		else {
			double area = (6 * Math.pow(length, 2)) / (4 * (Math.tan(Math.PI / 6.0)));
			double output = Math.round(area * 1000) / 1000.0;
			System.out.println("Area is " + output);
		}		
	}
}