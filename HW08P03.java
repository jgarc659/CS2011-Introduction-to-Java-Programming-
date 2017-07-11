/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/20/2017
 Purpose: (HW08P03) Write a program that asks the user for the total
 sales for a chain of stores, and the number of stores. Then, display
 the total sales in a bar graph for each store (using asterisks).
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW08P03 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for the number of stores, then store value in integer variable.
		System.out.print("How many stores are there?: ");
		int numStores = input.nextInt();
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Declare and initialize String variable storing the beginning of the bar graph (title and subtitle).
		// This will be added to and completed within loop below.
		String barGraph = "GRAPH OF TOTAL SALES\n" + "(Each * = $100)\n";
		 
		// Go through the following loop for each store.
		for (int count = 1; count <= numStores; count++) {
			// Prompt user for the total sales for the current store, then store input in int variable.
			System.out.print("Enter the total sales for Store " + count + ": ");
			int sales = input.nextInt();
			
			// Create dummy String variable to later become a "bar" in loop below.
			String singleBarGraph = "";
						
			// Input Validation: If user input isn't divisible by 100, print error message and retry loop.
			if (sales % 100 != 0) {
				System.out.println("ERROR: Please enter a value that is evenly divisible by 100.");
				count -= 1;
			}	
			// If user input passes verification, follow directions within.
			else {
				// Create a single bar representing the current store.
				for (int i = 1; i <= (sales / 100); i++) {
					singleBarGraph += "*";	
				}
			// Add a line to the final bar graph representing the current store.
			barGraph += "Store " + count + ": " + singleBarGraph + "\n";
			}
		}
		
		// Empty line.
		System.out.println();
		
		// Print bar graph.
		System.out.println(barGraph);
	}
}
