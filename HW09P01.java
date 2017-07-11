/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/13/2017
 Purpose: (HW09P01) Write a program that has a method
 which prints an n-by-n matrix of random 0s and 1s.
*/

// Import Scanner
import java.util.Scanner;

public class HW09P01 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter n value (matrix dimensions), then store in int variable.
		System.out.print("Enter a value for n: ");
		int n = input.nextInt();
		
		// Use mathod to validate input.
		n = inputValidation(n);
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Use void method to print matrix.
		printMatrix(n);
	}
	
	// Define method which ensures n is a valid (positive) number.
	public static int inputValidation(int n) {
		Scanner input = new Scanner(System.in);
		if (n <= 0) {
			while (n <= 0) {
				System.out.print("ERROR: Please enter a positive integer: ");
				n = input.nextInt();
			}
			return n;
		}
		else {
			return n;
		}
	}
	
	// Define void method which takes input and uses for loops to create matrix of ones and zeroes.
	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int randomNum = (int)Math.round(Math.random());
				System.out.printf("%-2d", randomNum);
			}
			System.out.println();
		}
	}
	
}