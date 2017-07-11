/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/02/2017
 Purpose: (HW12P04) (Problem 7.19) Write a program that displays whether
 or not a user-defined list of integers is sorted.
 */

// Import Scanner.
import java.util.Scanner;

public class HW12P04 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the number of elements in the forthcoming list.
		System.out.print("Enter the number of elements: ");
		int numElements = input.nextInt();
		
		// Create array of length numElements (as defined by the user).
		int[] list = new int[numElements];
		
		// Prompt user for the list of integers and store in array.
		System.out.print("Enter list: ");
		for (int i = 0; i < numElements; i++) {
			list[i] = input.nextInt();
		}
		
		// Print whether or not the list is sorted using method.
		printSortStatus(list);
	}
	
	// Define void method which prints whether or not a list is sorted.
	public static void printSortStatus(int[] list) {
		if (isSorted(list)) {
			System.out.println("\nThe list is already sorted");
		}
		else {
			System.out.println("\nThe list is not sorted");
		}
	}
	
	// Define a method which returns a boolean value reflecting whether or not a list is sorted.
	public static boolean isSorted(int[] list) {
		// Declare and initialize boolean variable for use in loop below.
		boolean sortStatus = true;
		
		// Use loop to traverse each element in array and ultimately determine if the list is sorted.
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] <= list[i + 1]) {
				sortStatus = true;
			}
			else {
				sortStatus = false;
				return sortStatus;
			}
		}
		
		return sortStatus;
	}
	
}
