/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/20/2017
 Purpose: (HW08P01) Write a program that prints all ASCII
 characters in a table.
*/

public class HW08P01 {
	public static void main(String[] args) {
		// Declare char variable storing numeric value for '!'.
		char ch = 33;
		
		// Loop once for each of the 94 characters from '!' to '~'.
		for (int count = 1; count <= 94; count++) {
			// Print current character.
			System.out.print(ch);
			// Increase character value by 1, thus moving on to next character.
			ch++;
			
			// Print a new line after every ten characters.
			if (count % 10 == 0) {
				System.out.println();
			}
		}
	}
}
