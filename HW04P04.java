/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/16/2017
 Purpose: (HW04P04) Write a program that presents a menu to the
 user asking what kind of math problem they'd want to solve, then
 carry out the problem based on the user's input.
*/

// Import scanner from Java class.
import java.util.Scanner;

public class HW04P04 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Create string variable storing menu text.
		final String USER_MENU =
			"1. Compute the Surface Area of a Sphere\n" +
			"2. Compute the Volume of a Sphere\n" +
			"3. Compute the Surface Area of a Rectangular Prism\n" +
			"4. Compute the Volume of a Rectangular Prism\n" +
			"5. Exit the program\n" +
			" \n" +
			"Enter your choice: ";
		
		// Create constants corresponding to possible user input values.
		final int SPHERE_SURFACE_AREA = 1;
		final int SPHERE_VOLUME = 2;
		final int PRISM_SURFACE_AREA = 3;
		final int PRISM_VOLUME = 4;
		final int EXIT = 5;
		
		// Print menu and prompt user for input.
		System.out.print(USER_MENU);
		int choice = input.nextInt();
		
		// Input Validation: If user input is out of range, terminate program.
		if (choice < 1 || choice > 5) {
			System.out.println(" ");
			System.out.println("ERROR: Please choose a value from 1-5.");
			System.out.print("Program will now exit.");
			System.exit(1);
		}
		
		// Declare constant value for pi to be called later in the switch.
		final double PI = 3.141592653589793;

		// Declare and initialize variables to be called & redefined later in the switch.
		double radius = 0;
		double length = 0;
		double width = 0;
		double height = 0;
		
		// Use switch to complete actions according to user menu choices 1-5.
		switch (choice) {
			case SPHERE_SURFACE_AREA:
				// Prompt user for radius measurement.
				System.out.print("Enter radius: ");
				radius = input.nextDouble();
				// Input Validation: If user input is negative, terminate program.
				if (radius < 0) {
					System.out.println("ERROR: Radius cannot be negative.");
					System.exit(1);
				}
				// If conditions are met, print surface area of sphere using formula stored in variable.
				else {
					double sphereSurfaceArea = 4 * PI * Math.pow(radius, 2);
					System.out.println("The surface area of the sphere is " + sphereSurfaceArea);
				}
				break;
			case SPHERE_VOLUME:
				// Prompt user for radius measurement.
				System.out.print("Enter radius: ");
				radius = input.nextDouble();
				// Input Validation: If user input is negative, terminate program.
				if (radius < 0) {
					System.out.println("ERROR: Radius cannot be negative.");
					System.exit(1);
				}
				// If conditions are met, print volume of sphere using formula stored in variable.
				else {
					double sphereVolume = (4.0/3) * PI * Math.pow(radius, 3);
					System.out.println("The volume of the sphere is " + sphereVolume);
				}
				break;
			case PRISM_SURFACE_AREA:
				System.out.print("Enter length, width, and height: ");
				// Prompt user for length, width, and height measurements.
				length = input.nextDouble();
				width = input.nextDouble();
				height = input.nextDouble();
				// Input Validation: If user input is negative, terminate program.
				if (length < 0 || width < 0 || height < 0) {
					System.out.println("ERROR: Neither length, width, or height can be negative.");
					System.exit(1);
				}
				// If conditions are met, print surface area of rectangular prism using formula stored in variable.
				else {
					double prismSurfaceArea = (2 * length * width) + (2 * height * width) + (2 * length * height);
					System.out.println("The surface area of the rectangular prism is " + prismSurfaceArea);
				}
				break;
			case PRISM_VOLUME:
				System.out.print("Enter length, width, and height: ");
				// Prompt user for length, width, and height measurements.
				length = input.nextDouble();
				width = input.nextDouble();
				height = input.nextDouble();
				// Input Validation: If user input is negative, terminate program.
				if (length < 0 || width < 0 || height < 0) {
					System.out.println("ERROR: Neither length, width, or height can be negative.");
					System.exit(1);
				}
				// If conditions are met, print volume of rectangular prism using formula stored in variable.
				else {
					double prismVolume = length * width * height;
					System.out.println("The volume of the rectangular prism is " + prismVolume);
				}
				break;
			case EXIT:
				// Exit the program.
				System.out.print("The program will now exit.");
				System.exit(0);
				break;
		}
	}
}