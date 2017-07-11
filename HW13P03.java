/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/10/2017
 Purpose: (HW13P03) Write a program that prompts the user to enter a number between 0 and 511
 and prints the corresponding boolean matrix.
 */

// Import Scanner.
import java.util.Scanner;

public class HW13P03 {
	// Main method.
	public static void main(String[] args) {
		// Use method to store initial user-defined number.
		int number = getNumber();
		// Empty line (for aesthetic purposes).
		System.out.println();
		// Use method to print matrix of "T"s and "F"s.
		printMatrix(number);
	}
	
	// Define method which prompts the user for a number on [0, 511] and returns the response.
	public static int getNumber() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int number = input.nextInt();
		return number;
	}
	
	// Define method which prints a 3x3 grid of "T"s and "F"s based on values in a boolean matrix.
	public static void printMatrix(int number) {
		// Declare 2D boolean array using method.
		boolean[][] isOneValue = computeMatrix(number);
		// Use loops to print either "T" or "F" depending on current 2D boolean array value.
		for (int row = 0; row < isOneValue.length; row++) {
			for (int column = 0; column < isOneValue[row].length; column++) {
				if (isOneValue[row][column]) {
					System.out.print("T ");
				}
				else {
					System.out.print("F ");
				}
			}
			System.out.println();
		}
	}
	
	// Define method which creates a boolean matrix based on the values in a string representing a binary number.
	public static boolean[][] computeMatrix(int number) {
		// Use method to store a binary version of the user's decimal number.
		String binaryStr = decToBinary(number);
		// Create 3x3 2D boolean array.
		boolean[][] isOneValue = new boolean[3][3];
		
		// Initialize 2D boolean array according to corresponding value in binary number.
		int indexCount = 0;
		for (int row = 0; row < isOneValue.length; row++) {
			for (int column = 0; column < isOneValue[row].length; column++) {
				if (binaryStr.charAt(indexCount) == '1') {
					isOneValue[row][column] = true;
				}
				indexCount++;
			}
		}
		
		return isOneValue;
	}
	
	// Define method which converts a decimal number to a binary number (in string form).
	public static String decToBinary(int decimalNum) {
		String binaryStr = "";
		
		while (decimalNum != 0) {
			int remainder = decimalNum % 2;
			binaryStr += remainder;
			decimalNum /= 2;
		}
		String revBinaryStr = "";
		for (int i = binaryStr.length() - 1; i >= 0; i--) {
			revBinaryStr += binaryStr.charAt(i);
		}
		if (revBinaryStr.length() != 9) {
			int difference = 9 - revBinaryStr.length();
			String extraZeroes = "";
			for (int j = 0; j < difference; j++) {
				extraZeroes += "0";
			}
			revBinaryStr = extraZeroes + revBinaryStr;
		}
		return revBinaryStr;
	}
}