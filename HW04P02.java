/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/14/2017
 Purpose: (HW04P02) Write a program that generates a random card
 from the standard deck of 52 cards.
 */

public class HW04P02 {
	public static void main(String[] args) {
		
		// Declare two variables that store random numbers within a defined range.
		// These will eventually correspond to the output string values for rank and suit.
		int rankNum = 1 + (int)(Math.random() * (13 - 1 + 1));
		int suitNum = 1 + (int)(Math.random() * (4 - 1 + 1));
		
		// Declare and initialize two string variables for rank and suit values, respectively.
		String rank = " ";
		String suit = " ";
		
		// Use switch to assign a rank to the "rank" variable based on randomly-generated number in "rankNum" variable.	
		switch (rankNum) {
			case 1:
				rank = "Ace";
				break;
			case 2:
				rank = "2";
				break;
			case 3: 
				rank = "3";
				break;
			case 4:
				rank = "4";
				break;
			case 5:
				rank = "5";
				break;
			case 6: 
				rank = "6";
				break;
			case 7:
				rank = "7";
				break;
			case 8:
				rank = "8";
				break;
			case 9: 
				rank = "9";
				break;
			case 10:
				rank = "10";
				break;
			case 11:
				rank = "Jack";
				break;
			case 12:
				rank = "Queen";
				break;
			case 13:
				rank = "King";
				break;
		}
		
		// Use switch to assign a suit to the "suit" variable based on randomly-generated number in "suitNum" variable.
		switch (suitNum) {
			case 1:
				suit = "Clubs";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3: 
				suit = "Hearts";
				break;
			case 4:
				suit = "Spades";
				break;
		}
		
		// Print final result (randomly-generated card) using values of both strings.
		System.out.print("You picked the " + rank + " of " + suit);
	}
}