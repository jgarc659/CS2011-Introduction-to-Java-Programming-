/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/02/2017
 Purpose: (HW12P05) (Problem 8.1) Write a program that reads a
 3-by-4 matrix and displays the sum of each column.
 */

// Import Scanner
import java.util.Scanner;

public class HW12P05 {
	// Main method.
	public static void main(String[] args) {
		// Use method to store matrix.
		double[][] matrix = getMatrix();
		// Use method to print matrix sums by columns.
		printSums(matrix);
	}
	
	// Define method which returns matrix after prompting the user for values and storing those values.
	public static double[][] getMatrix() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
	
		// Declare & initialize 3-by-4 multidimensional array.
		double[][] matrix = new double[3][4];
		
		// Prompt user for matrix values, then store in 2D array.
		System.out.print("Enter a 3-by-4 matrix row-by-row: ");
		for (int rows = 0; rows < 3; rows++) {
			for (int columns = 0; columns < 4; columns++) {
				matrix[rows][columns] = input.nextDouble();
			}
		}
		
		return matrix;
	}
	
	// Define void method which prints the sum of each column.
	public static void printSums(double[][] matrix) {
		for (int column = 0; column < 4; column++) {
			System.out.println("Sum of the elements at column " + column + " is " + getSum(matrix, column));
		}
	}
	
	// Define method which returns the sum of a single column.
	public static double getSum (double[][] matrix, int column) {
		double sum = 0;
		for (int row = 0; row < 3; row++) {
			sum += matrix[row][column];
		}
		return sum;
	}

}
