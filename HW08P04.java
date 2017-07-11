/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/20/2017
 Purpose: (HW08P04) Write a program that asks the user for
 an integer and then prints the listed patterns based on 
 that integer.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW08P04 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for number of rows in pattern 1, then store value in integer variable.
		System.out.print("How many rows for Pattern 1?: ");
		int rows1 = input.nextInt();
		
		// Input Validation: If user input is out of range, print error message and retry input.
		// Note that this is a for loop instead of a more efficient while loop, since we're restricted to for loops for this problem.
		for ( ; rows1 < 1 || rows1 > 999; ) {
				System.out.println("ERROR: Please enter a value on [1, 999].\n");
				System.out.print("How many rows for Pattern 1?: ");
				rows1 = input.nextInt();
		}
		
		// Empty line (for aesthetic purposes).
		System.out.println();
				
		
		// If user input passes validation, print table - formatted according to sample.
		for (int count = 1; count <= rows1; count++) {
				int num = rows1;
				for (int i = 1; i <= count; i++, num--) {
					System.out.printf("%-4d", num);
				}
				System.out.println();
		}
		
		// Prompt user for number of rows in pattern 2, then store value in integer variable.
		System.out.print("\nHow many rows for Pattern 2?: ");
		int rows2 = input.nextInt();
		
		// Input Validation: If user input is out of range, print error message and retry input.
		// Note that this is a for loop instead of a more efficient while loop, since we're restricted to for loops for this problem.
		for ( ; rows2 < 1 || rows2 > 26; ) {
			System.out.println("ERROR: Please enter a value on [1, 26].\n");
			System.out.print("How many rows for Pattern 2?: ");
			rows2 = input.nextInt();
		}
		
		// Empty line.
		System.out.println("");
		
		// If user input passes validation, print table - formatted according to sample.
		for (int count = 0; count < rows2; count++) {
			for (int i = 0; i < (rows2 - count); i++) {
				if (i % 2 == 0) {
					System.out.print((char)('A' + i) + " ");
				}
				else {
					System.out.print((char)('A'+ 32 + i) + " ");
				}
			}
			System.out.println();
		}	
	}
}
