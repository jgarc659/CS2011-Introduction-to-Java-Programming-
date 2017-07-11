/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/02/2017
 Purpose: (HW12P03) (Problem 6.36) Write a program that computes
 the area of a regular polygon.
 */

// Import Scanner.
import java.util.Scanner;

public class HW12P03 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the number of sides and store in integer variable.
		System.out.print("Enter the number of sides: ");
		int n = input.nextInt();
		
		// Prompt user for side length and store in double variable.
		System.out.print("Enter the side : ");
		double side = input.nextDouble();
		
		// Display the area of the polygon using a method.
		System.out.println("The area of the polygon is " + area(n, side));
		
	}
	
	// Define a method which computes the area of a polygon with "n" sides and "side" side length.
	public static double area(int n, double side) {
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		return area;
	}

}
