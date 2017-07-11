/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/02/2017
 Purpose: (HW02P04) Write a program that converts 
 degrees Celsius to Fahrenheit and vice-versa, respectively.
*/

// Import a Scanner from the java.util package.
import java.util.Scanner;

public class HW02P04 {
	public static void main(String[] args) {
		// Establish Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Use scanner's double method to record user input (temperature in degrees Celsius).
		System.out.print("Enter a temperature in Celsius: ");
		double c = input.nextDouble();
		
		// Define variable for converion to Fahrenheit based on user input (temperature in degrees Celsius).
		double fahrenheit = (c * (9.0/5)) + 32;
		
		// Print the result.
		System.out.println(c + " Celsius is " + fahrenheit + " Fahrenheit");
		
		System.out.println(" ");
		
		// Use scanner's double method to record user input (temperature in degrees Fahrenheit).
		System.out.print("Enter a temperature in Fahrenheit: ");
		double f = input.nextDouble();
		
		// Define variable for converion to Celsius based on user input (temperature in degrees Fahrenheit).
		double celsius = (f - 32) * (5.0/9);
		
		// Print the result.
		System.out.println(f + " Fahrenheit is " + celsius + " Celsius");
	}
}