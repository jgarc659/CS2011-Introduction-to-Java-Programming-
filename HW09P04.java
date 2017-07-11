/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/13/2017
 Purpose: (HW09P04) Write a program that asks the user
 to enter the size of a grid and then prints the corresponding
 grid (using methods).
*/

// Import Scanner
import java.util.Scanner;

public class HW09P04 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the size of the grid, then store as integer.
		System.out.print("Enter the size of the grid: ");
		int gridSize = input.nextInt();
		
		// (ADDITIONAL) Use method for input validation.
		gridSize = inputValidation(gridSize);
		
		// Create two String variables for storing the two types of rows to be printed.
		String row = returnRow(gridSize);
		String columns = returnColumns(gridSize);
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Use void method to print entire grid.
		printGrid(gridSize, row, columns);
	}
	
	// Define method for input validation.
	public static int inputValidation(int gridSize) {
		Scanner input = new Scanner(System.in);
		if (gridSize <= 0) {
			while (gridSize <= 0) {
				System.out.print("ERROR: Please enter a positive integer: ");
				gridSize = input.nextInt();
			}
			return gridSize;
		}
		else {
			return gridSize;
		}
	}
	
	// Define method to return a String containing a row of pluses (+) and dashes (-).
	public static String returnRow(int gridSize) {
		String row = "+";
		for (int i = 1; i <= gridSize; i++) {
			row += "--+";
		}
		return row;
	}
	
	// Define method to return a String containing a row of vertical pipes (named columns for simplicity).
	public static String returnColumns(int gridSize) {
		String columns = "|";
			for (int i = 1; i <= gridSize; i++) {
				columns += "  |";
			}
		return columns;
	}
	
	// Define void method which prints the entire grid.
	public static void printGrid(int gridSize, String row, String columns) {
		for (int i = 1; i <= gridSize; i++) {
			System.out.println(row);
			System.out.println(columns);
		}
		System.out.print(row);
	}
}