/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/02/2017
 Purpose: (HW02P02) Write a program that computes 
 the volume of a pyramid.
*/

// Import a Scanner from the java.util package.
import java.util.Scanner;

public class HW02P02 {
	public static void main(String[] args) {
		// Establish Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Use scanner's double method to create variables for length, width, and height inputs.
		System.out.println("Enter the length, width, and height of a pyramid: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		double height = input.nextDouble();
		
		// Create variables for area and volume of pyramid based on input values.
		double area = length * width;
		double volume = ((1.0/3) * area * height);
		
		// Print the results.
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}