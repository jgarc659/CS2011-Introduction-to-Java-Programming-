/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/14/2017
 Purpose: (HW07P01) Write a program that asks the user for two integers
 a and b, then displays their sum, their product, the sum of all squares
 between the two, and all powers of 2 from a to b.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW07P01 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for two integers, then store them in variables.
		System.out.print("Enter two integers a and b: ");
		int aInitial = input.nextInt();
		int b = input.nextInt();
		
		// Empty line (for aesthetic purposes).
		System.out.println("");
		
		// Switch aInitial and b values if the former is smaller than the latter.
		if (aInitial > b) {
			int temp = aInitial;
			aInitial = b;
			b = temp;
		}
		
		/* Declare new integer a, which allows the input "a" variable aInitial 
		to stay intact while still using its value for easier-to-follow operations. */
		int a = aInitial;
		
		/* Declare & initialize variable for the sum of even numbers between 
		a and b (to be used in loop below). */
		int sumEven = 0;
		
		// Compute the sum of even numbers between a and b using a loop.
		while (a <= b) {
			if (a % 2 == 0) {
				sumEven += a;	
			}
			a++;
		}
		
		// Store initial "a" input value in variable a.
		a = aInitial;
		
		/* Declare & initialize variable for the product of numbers between 
		a and b (to be used in loop below). */
		int product = 1;
		
		// Compute the product of numbers between a and b using a loop.
		while (a <= b) {
			product *= a;
			a++;
		}
		
		// Store initial "a" input value in variable a.
		a = aInitial;
		
		/* Declare & initialize variable for the sum of squares
		between a and b (to be used in loop below). */
		int sumSquares = 0;
		
		// Compute the sum of all squares between a and b using a loop.
		while (a <= b) {
			if (Math.sqrt(a) % 1 == 0) {
				sumSquares += a;
			}
			a++;
		}
		
		// Store initial "a" input value in variable a.
		a = aInitial;
		
		/* Declare & initialize both String and double variables for the 
		powers of 2 between a and b (to be used in loop below). */
		String powersOfTwo = "";
		double powersOfTwoInstance = 0;
		
		// Assemble a list of the powers of 2 between a and b using a loop.
		while (a <= b) {
			powersOfTwoInstance = Math.pow(2, a);
			a++;
			powersOfTwo += "2 ^ " + (a - 1) + " = " + powersOfTwoInstance + "\n";
		}
		
		// Print all results.
		System.out.println("The sum of all even numbers between " + aInitial + " and " + b + " is: " + sumEven);
		System.out.println("The product of all numbers between " + aInitial + " and " + b + " is: " + product);
		System.out.println("The sum of all squares between " + aInitial + " and " + b + " is: " + sumSquares);
		System.out.println("All powers of 2 from " + aInitial + " to " + b + " are: \n" + powersOfTwo);
	}
}
