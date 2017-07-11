/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P04) Write a program that implements a simple
 chat interface that accepts slash commands and displays the
 required output.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW06P04 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for character name, then store string in variable.
		System.out.print("Enter your character name: ");
		String userName = input.next();
		
		// Print chat prompt.
		System.out.print("> ");
		
		// Bypass Scanner irregularity.
		input.nextLine();
		// Store user input (a command) in a string variable.
		String command = input.nextLine();
		
		// Print chat prompt.
		System.out.print("> ");
		
		// If user enters roll command, print random number on [0, 100] in a statement.
		if (command.equals("/roll")) {
			int randomNum = (int)(Math.random() * 101);
			System.out.print(userName + " rolled a " + randomNum + ".");
		}
		// If user enters dance command, print statement indicating the action.
		else if (command.equals("/dance")) {
			System.out.print(userName + " performs a lively dance.");
		}
		/* If user enters invite command, print statement indicating the action - including username and 
		the name of the person invited.*/
		else if (command.startsWith("/invite ")) {
			String friendName = command.substring(8);
			System.out.print(friendName + " has been invited to " + userName + "'s party.");
		}
		// If user enters say command, print full statement indicating user and message.
		else if (command.startsWith("/say ")) {
			String message = command.substring(5);
			System.out.print(userName + " says: " + message);
		}
		// If command doesn't satisfy any of the above conditions, print error statement and terminate program.
		else {
			System.out.println("ERROR: Input is not valid. Are you following the corrext format?");
			System.out.println("> Program will now exit.");
			System.exit(1);
		}
	}
}
