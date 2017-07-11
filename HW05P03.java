/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/23/2017
 Purpose: (HW05P03) Write a program that asks the user, based on
 menu choice, for either a character or Unicode value, then converts
 it to the other type.
*/

// Import scanner from Java class.
import java.util.Scanner;

public class HW05P03 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);

		// Create String variable storing menu.
		final String USER_MENU =
			"a. Convert Character to Unicode\n" +
			"b. Convert Unicode to Character\n" +
			"c. Exit Program\n";
		
		// Print menu.
		System.out.println(USER_MENU);
		
		// Prompt user for menu choice.
		System.out.print("Please choose a menu option: ");
		char choice = input.next().charAt(0);
		
		// Input Validation: If menu choice is out of range, terminate program.
		if (choice < 'a' || choice > 'c') {
			System.out.println("ERROR: Your choice must be a, b, or c.");
			System.out.println("Program will now exit.");
			System.exit(1);
		}
		
		// Assign different actions to perform based on menu choice using switch.
		switch (choice) {
		case 'a':
			// Prompt the user for a character.
			System.out.print("Please enter a character: ");
			char ch = input.next().charAt(0);
			// Print full conversion-to-Unicode statement.
			System.out.println(ch + " translates to " + (int)ch + " in Unicode.");
			break;
		case 'b':
			// Prompt the user for a Unicode value.
			System.out.print("Please enter a Unicode value: ");
			int uni = input.nextInt();
			// Input Validation: If user input (uni) is negative, terminate program.
			if (uni < 0) {
				System.out.println("ERROR: Unicode value cannot be negative.");
				System.out.println("Program will now exit.");
				System.exit(1);
			}
			else {
				// Print full conversion-to-character statement.
				System.out.println("Unicode value " + uni + " translates to " + (char)uni + ".");
			}
			break;
		case 'c':
			// Terminate program under normal circumstances.
			System.out.println("Program will now exit.");
			System.exit(0);
		}
	}
}