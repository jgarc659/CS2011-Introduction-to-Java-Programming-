/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/14/2017
 Purpose: (HW04P01) Write a program that asks the user for the
 price of a piece of software and the number of units sold, then
 computes and displays the total cost.
 */

// Import scanner from Java class.
import java.util.Scanner;

public class HW04P01 {
	public static void main(String[] args) {
		// Establish scanner object.
		Scanner input = new Scanner(System.in);
		
		// Call scanner to prompt the user for cost and quantity.
		System.out.print("Enter the cost of the software: ");
		double initialCost = input.nextDouble();
		
		System.out.print("Enter the quantity sold: ");
		int quantity = input.nextInt();
		
		// Declare "discount" varible with default 1.0 value.
		double discount = 1.0; 
		
		// Validate that both user input variables are positive. 
		if (initialCost < 0 || quantity < 0) {
			System.out.println(" ");
			System.out.println("ERROR: Neither the cost nor quantity can be negative.");
			System.exit(1);
		}		
		// Apply new discount value according to quantity.
		else {
			if (quantity >= 10 && quantity <= 19) {
				discount = 0.8;
			}
			else if (quantity >= 20 && quantity <= 49) {
				discount = 0.7;
			}
			else if (quantity >= 50 && quantity <= 99) {
				discount = 0.6;
			}
			else if (quantity >= 100) {
				discount = 0.5;
			}
			// Store formula for total cost (considering applied discounts) in a variable.
			double totalCost = (initialCost * quantity) * discount;
			// Print total cost.
			System.out.println(" ");
			System.out.print("Total Cost: $" + totalCost);
		}
	}
}