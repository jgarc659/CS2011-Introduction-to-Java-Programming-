/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/10/2017
 Purpose: (HW13P04) Write a program that asks the user for the dimensions
 of an n-by-n matrix, then randomly populates and prints one storing the 
 characters x and o.
 */

// Import Scanner.
import java.util.Scanner;

public class HW13P04 {
	// Main method.
	public static void main(String[] args) {
		// Use method to store the size of the matrix.
		int size = getSize();
		// Empty line (for aesthetic purposes).
		System.out.println();
		// Use method to compute 2D array of user-defined dimensions.
		char[][] matrix = computeMatrix(size);
		// Use method to print matrix of x's and o's.
		printMatrix(matrix);
		// Use method to test for any repetitions in the 2D character array, and print results.
		testForRepetitions(matrix);
		
	}

	// Define method which prompts the user for the size of the matrix and returns the input.
	public static int getSize() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix size: ");
		int size = input.nextInt();
		return size;
	}
	
	// Define method of which creates a matrix (of user-defined size) of random x's and o's.
	public static char[][] computeMatrix(int size) {
		char[][] matrix = new char[size][size];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = randomChar();
			}
		}
		
		return matrix;
	}
	
	// Define method which randomly generates and returns either an 'x' or 'o' character.
	public static char randomChar() {
		char randomChar;
		int randomNum = (int)(Math.random() * 2);
		
		if (randomNum == 1) {
			randomChar = 'x';
		}
		else {
			randomChar = 'o';
		}
		
		return randomChar;
	}
	
	// Define method which prints the 2D character array.
	public static void printMatrix(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Define method which uses multiple other methods to check for repetitions in the 2D array.
	public static void testForRepetitions(char[][] matrix) {
		testRows(matrix);
		testCols(matrix);
		testDiagonals(matrix);
	}
	
	// Define method which tests for repetition of characters by row.
	public static void testRows(char[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			int numberOfO = 0;
			int numberOfX = 0;
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == 'o') {
					numberOfO++;
				}
				else if (matrix[row][column] == 'x') {
					numberOfX++;
				}
			}
			if (numberOfO == matrix.length) {
				System.out.println("All o's in row " + (row + 1) + ".");
			}
			else if (numberOfX == matrix.length) {
				System.out.println("All x's in row " + (row + 1) + ".");
			}
		}
	}
	
	// Define method which tests for repetition of characters by column.
	public static void testCols(char[][] matrix) {
		for (int column = 0; column < matrix.length; column++) {
			int numberOfO = 0;
			int numberOfX = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][column] == 'o') {
					numberOfO++;
				}
				else if (matrix[row][column] == 'x') {
					numberOfX++;
				}
			}
			if (numberOfO == matrix.length) {
				System.out.println("All o's in column " + (column + 1) + ".");
			}
			else if (numberOfX == matrix.length) {
				System.out.println("All x's in column " + (column + 1) + ".");
			}
		}
	}
	
	// Define method which uses two other methods to test for repetition of characters in diagonals.
	public static void testDiagonals(char[][] matrix) {
		testMajorDiagonal(matrix);
		testMinorDiagonal(matrix);
	}
	
	// Define method which tests for repetition of characters in major diagonal.
	public static void testMajorDiagonal(char[][] matrix) {
		int numberOfO = 0;
		int numberOfX = 0;
		for (int count = 0; count < matrix.length; count++) {
			if (matrix[count][count] == 'o') {
				numberOfO++;
			}
			else if (matrix[count][count] == 'x') {
				numberOfX++;
			}
		}
		
		if (numberOfO == matrix.length) {
			System.out.println("All o's in major diagonal.");
		}
		else if (numberOfX == matrix.length) {
			System.out.println("All x's in major diagonal.");
		}
	}
	
	// Define method which tests for repetition of characters in minor diagonal.
	public static void testMinorDiagonal(char[][] matrix) {
		int numberOfO = 0;
		int numberOfX = 0;
		int column = matrix.length - 1;
		for (int row = 0; row < matrix.length; row++) {
			if (matrix[row][column] == 'o') {
				numberOfO++;
			}
			else if (matrix[row][column] == 'x') {
				numberOfX++;
			}
			column--;
		}
		
		if (numberOfO == matrix.length) {
			System.out.println("All o's in minor diagonal.");
		}
		else if (numberOfX == matrix.length) {
			System.out.println("All x's in minor diagonal.");
		}
	}
}