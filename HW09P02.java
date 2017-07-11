/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/13/2017
 Purpose: (HW09P02) Write a program that asks the user
 to enter the length and width of a rectangle, then computes
 the area (using methods).
*/

// Import Scanner
import java.util.Scanner;

public class HW09P02 {
	// Main method.
	public static void main(String[] args) {
		// Read the length and width of the rectangle using methods.	
		double length = readLength();
		double width = readWidth();
		
		// Empty line - for aesthetic purposes.
		System.out.println();
		
		// USe method to store area.
		double area = computeArea(length, width);
		
		// Call void method which prints the area.
		displaySolution(area);
	}
	
	// Define method which reads and returns the length of the rectangle.
	public static double readLength() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for length of rectangle, then store in variable.
		System.out.print("Please enter the length of the rectangle: ");
		double length = input.nextDouble();
		
		// Use method to ensure length is positive.
		length = inputValidation(length);
		
		// After passing input validation, return length.
		return length;
	}
	
	// Define method which reads and returns the width of the rectangle.
	public static double readWidth() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for width of rectangle, then store in variable.
		System.out.print("Please enter the width of the rectangle: ");
		double width = input.nextDouble();
		
		// Use method to ensure width is positive.
		width = inputValidation(width);
		
		// After passing input validation, return width.
		return width;
	}
	
	// (ADDITIONAL STEP) Define method which validates user input.
	public static double inputValidation(double x) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		if (x <= 0) {
			while (x <= 0) {
				System.out.print("ERROR: Please enter a positive value: ");
				x = input.nextDouble();
			}
			return x;
		}
		else {
			return x;
		}
	}
	
	// Define method which returns the area of the rectangle.
	public static double computeArea(double length, double width) {
		double area = length * width;
		return area;
	}
	
	// Define void method which prints the area.
	public static void displaySolution(double area) {
		System.out.println("The area of the rectangle is: " + area);
	}
		
}