/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/27/2017
 Purpose: (HW11P05) Write a program that simulates how theater seats
 may fill as people walk into the theater. The program should maximize the
 distance between each person by finding a seat in the middle of the longest 
 sequence of unoccupied seats.
*/

// Import Scanner class.
import java.util.Scanner;

public class HW11P05 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for number of seats, then store response as integer variable.
		System.out.print("Enter the number of seats: ");
		int numSeats = input.nextInt();
		
		// Create boolean array with length based on user input.
		boolean[] isFilled = new boolean[numSeats];
		
		// Print diagram of row of seats as it changes over time.
		printDiagram(isFilled);
	}
	
	// Define method which prints the entire diagram of the row of seats as it changes over time.
	public static void printDiagram(boolean[] isFilled) {
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Print empty row of seats.
		printRow(isFilled, isFilled.length);
		
		// Repeatedly print row after adding a "person" to the row each time.
		for (int i = 0; i < isFilled.length; i++) {
			isFilled = addSeat(isFilled);
			printRow(isFilled, isFilled.length);
		}
	}
	
	/* Define method which accepts an array of booleans, determines the "middle index" in 
	   the largest sequence of false values, changes the value at that index to true, and 
	   returns the array. */
	public static boolean[] addSeat(boolean[] isFilled) {
		// Declare and initialize four integer variables for use in loop computations below.
		int currentStartingIndex = 0;
		int startingIndex = 0;
		int max = 0;
		int countEmptySeats = 0;
		
		// Run through each index of the boolean array to determine the largest segment and its starting index.
		for (int i = 0; i < isFilled.length; i++) {
			// Execute code if the current index starts a new segment or final index is reached.
			if (isNewSegment(isFilled, i) || (i == isFilled.length - 1 && !isFilled[i]) ) {
				// If the current maximum segment length has been surpassed, update it.
				if (countEmptySeats >= max) {
					max = countEmptySeats;
					// Special case: If this is the first time computing segment length within loop, set the starting index equal to current index.
					if (max == 0) {
						startingIndex = i;
					}
					// Set official starting index to the one corresponding to the maximum segment length.
					else {
						startingIndex = currentStartingIndex;
					}
				}
				// At the start of a new segment, reset count and starting index.
				countEmptySeats = 0;
				currentStartingIndex = i;
			}
			// If seat is empty, increment the current count of empty seats.
			if (!(isFilled[i])) {
				countEmptySeats++;
			}
		}
		
		// Compute index of boolean value to be changed to true (index of seat to be occupied).
		int middleIndex = (max / 2) + startingIndex;
		
		// Set the boolean value at the index determined above to be true.
		isFilled[middleIndex] = true;		
		return isFilled;
	}
	
	// Define method which determines if an indexed variable denotes the start of a new segment.
	public static boolean isNewSegment(boolean[] isFilled, int i) {
		boolean isNewSegment;
		if (i == 0) {
			if (isFilled[i]) {
				isNewSegment = false;
			}
			else {
				isNewSegment = true;
			}
		}
		else if (isFilled[i - 1] && !(isFilled[i])) {
			isNewSegment = true;
		}
		else {
			isNewSegment = false;
		}
		
		return isNewSegment;
	}
	
	// Define method which prints an individual row of seats based on the values of a boolean array.
	public static void printRow(boolean[] isFilled, int numSeats) {
		for (int i = 0; i < numSeats; i++) {
			if (isFilled[i]) {
				System.out.print("X");
			}
			else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
}
