/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/27/2017
 Purpose: (HW11P04) Write a program that generates an array of
 n random values between [1, 4], then displays the array with the
 adjacent repeated values in parentheses.
*/

// Import Scanner.
import java.util.Scanner;

public class HW11P04 {
	
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many random values?: ");
		int n = input.nextInt();
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Use void method to print array (with parentheses added).
		printArrayValues(n);
	}
	
	// Define method which returns an array of n elements and assigns random values on [1, 4] to each.
	public static int[] generateRandomArray(int n) {
		int[] randomArray = new int[n];
		for (int i = 0; i < n; i++) {
			int randomNum = (int)((Math.random() * 4) + 1);
			randomArray[i] = randomNum;
		}
		return randomArray;
	}

	// Define a void method which prints all values in the array and adds parentheses around repeating values.
	public static void printArrayValues(int n) {
		// Call method which generates array, then store array in newly-declared reference variable.
		int[] array = generateRandomArray(n);
		
		// Use loops to go through each index of array.
		for (int i = 0; i < n; i++) {
			/* Special Case: Once loop reaches last index (and it 
			   isn't a repeated value), simply print to avoid runtime error. */
			if (i == n - 1) {
				System.out.print(array[i]);
			}
			// If the current array value will repeat...
			else if (array[i] == array[i + 1]) {
				// Print open parenthesis.
				System.out.print("(");
				// As long as the value keeps repeating...
				while (array[i] == array[i + 1]) {			
					// Print the repeating value within the parenthesis.
					System.out.print(array[i] + " ");
					// Iterate current index.
					i++;
					/* Special Case: If loop reaches last index (and it is a
					   repeating value), break out of loop to avoid runtime error. */
					if (i == n - 1) {
						break;
					}
				}
				// Print last instance of repeating value and close parenthesis.
				System.out.print(array[i] + ") ");
			} 
			/* If the current index isn't repeating and the loop hasn't reached the last index, 
			   simply print value in current index. */
			else {
				System.out.print(array[i] + " ");
			}	
		}
		
	}
}
