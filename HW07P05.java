/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/14/2017
 Purpose: (HW07P05) Write a program which will convert a binary
 number to decimal, or a decimal number to binary.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW07P05 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize String constant which stores user menu.
		final String USER_MENU = 
			"---------------------------------\n" +
			"|    Binary Number Converter    |\n" +
			"---------------------------------\n" +
			"| 1. Convert Binary to Decimal  |\n" +
			"| 2. Convert Decimal to Binary  |\n" +
			"| 3. Exit the Program           |\n" +
			"---------------------------------\n" +
			"Enter your menu choice (1 - 3): ";
		
		// Store remaining code within infinite loop so user can repeatedly choose menu options and exit voluntarily.
		while (true) {
			// Print menu and ask user for choice.
			System.out.print(USER_MENU);
			int menuChoice = input.nextInt();
			System.out.println("");
			
			// If user's menu choice is 1, convert binary value to decimal value.
			if (menuChoice == 1) {
				// Prompt user for binary value, then store user input in a String variable.
				System.out.print("Enter the binary string: ");
				String binaryInput = input.next();
				
				// Declare and initialize four integer variables for use in the loop below.
				int decimalValue = 0;
				int count = 1;
				int index = binaryInput.length() - 1;
				int powerOfTwo = 1;
				
				// Convert binary to decimal by multiplying the value of each index by its corresponding power of two, then adding.
				while (count <= binaryInput.length()) {
					String binaryValueStr = "" + binaryInput.charAt(index);
					int binaryValue = Integer.parseInt(binaryValueStr);
					decimalValue += binaryValue * powerOfTwo;
					count++;
					index--;
					powerOfTwo *= 2;
				}
				// Print result (full binary-to-decimal conversion statement).
				System.out.println(binaryInput + " in decimal is: " + decimalValue);
			}
			
			// If user's menu choice is 2, convert decimal value to binary value.
			else if (menuChoice == 2) {
				// Prompt user for decimal value, then store user input in a long variable.
				System.out.print("Enter the decimal number: ");
				long decimalInput = input.nextLong();
				System.out.println("");
				
				// Declare and initialize string binaryValueTemp to be used in loop below.
				String binaryValueTemp = "";
				// Declare long variable decimalValue and set it equal to decimalInput.
				// I used the "long" variable type because it was the only one compatible with the relatively lengthy sample input.
				// decimalValue will be used for computations, thus leaving the original input variable unaltered for printing below.
				long decimalValue = decimalInput;
				
				// First step of decimal-to-binary conversion: successive division.
				while (decimalValue > 0) {
					long remainder = decimalValue % 2;
					decimalValue /= 2;
					binaryValueTemp += remainder;
				}
				
				// Declare and initialize count, index, and binaryValue variables for upcoming loop.
				int count = 1;
				int index = binaryValueTemp.length() - 1;
				String binaryValue = "";
				
				// Store a reversed version of the result previously computed (binaryValueTemp) for a final, accurate binary value.
				while (count <= binaryValueTemp.length()) {
					binaryValue += binaryValueTemp.charAt(index); 
					index--;
					count++;
				}
				
				// Remove unnecessary "0"s from beginning of binary value.
				if (binaryValue.startsWith("0")) {
					binaryValue = binaryValue.substring(1);
				}
				
				// Print result (full decimal-to-binary conversion statement).
				System.out.println(decimalInput + " in binary is: \n" + binaryValue);
			}
			
			// If user's menu choice is 3, exit program.
			else if (menuChoice == 3) {
				System.out.println("Program will now exit.");
				System.exit(0);
			}
			
			// If user's menu choice is not valid, print error message.
			else {
				System.out.println("ERROR: Please enter an integer value from 1-3.");
			}
			
			System.out.println("");
		}
	}
}
