/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/27/2017
 Purpose: (HW11P01) Write a program that receives an integer n as input, then computes an array 
 of length n (storing random integers) and prints the following: the array, the values in the 
 even indices, the values in the odd indices, the reverse of the index, and the first, middle, 
 and last values. 
*/

// Import Scanner.
import java.util.Scanner;

public class HW11P01 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);

		// Prompt user for number of elements, then store in integer variable.
		System.out.print("Enter the number of elements: ");
		int n = input.nextInt();
		
		// Call method to generate array and return array to new reference variable in main method.
		int[] array = generateArray(n);
		
		// Empty Line (for aesthetic purposes).
		System.out.println();
		
		// Use five void methods defined below to print the array's characteristics as defined in problem.
		printArray(array);
		printEven(array);
		printOdd(array);
		printReverse(array);
		printFirstMidLast(array);
	}

	// Define method which returns a random array of n integers on [1, 20].
	public static int[] generateArray(int n){
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			int randomNum = (int)(Math.random() * 20) + 1;
			array[i] = randomNum;
		}
		
		return array;
	}
	
	// Define method which prints the array's values in a formatted statement.
	public static void printArray(int[] array) {
		System.out.printf("%-24s", "Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// Define method which prints the values in even indexes of the initial array in a formatted statement.
	public static void printEven(int[] array) {
		System.out.printf("%-24s", "Even Indexes: ");
		for (int i = 0; i < array.length; i += 2) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// Define method which prints the odd elements of the initial array in a formatted statement.
	public static void printOdd(int[] array) {
		System.out.printf("%-24s", "Odd Elements: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}
	
	// Define method which prints the reverse of the initial array in a formatted statement.
	public static void printReverse(int[] array) {
		System.out.printf("%-24s", "Reverse: ");
		for (int i = (array.length - 1); i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	// Define method which prints the first, middle, and last elements of the array in a formatted statement.
	public static void printFirstMidLast(int[] array) {
		System.out.printf("%-24s", "First, Middle, Last: ");
		System.out.print(array[0] + " ");
		int midIndex = array.length / 2;
		if (array.length % 2 == 0) {
			System.out.print(array[midIndex - 1]+ " ");
			System.out.print(array[midIndex] + " ");
		}
		else {
			System.out.print(array[midIndex] + " ");
		}
		System.out.print(array[array.length - 1]);
	}
}
