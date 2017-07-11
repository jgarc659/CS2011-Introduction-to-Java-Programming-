/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/20/2017
 Purpose: (HW08P02) Write a program which reads a String
 and displays the following: Only the upper case letters, the
 string with all vowels replaced by an underscore, the number
 of vowels in the string, the number of consonants in the string,
 and the indexes of all vowels in the string.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW08P02 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for String, then store input in variable.
		System.out.print("Enter a String: ");
		String userString = input.nextLine();
		
		// Empty line (for aesthetic purposes).
		System.out.println();
	
		// Declare and initialize dummy variables for use in the loop below.
		String upper = "";
		String vowelsReplaced = "";
		int numVowels = 0;
		int numConsonants = 0;
		String vowelPositions = "";
		
		// Loop for each each character in the user's string.
		for (int i = 0; i < userString.length(); i++) {
			// Declare char variable storing current character.
			char currentCh = userString.charAt(i);
			
			// If current character is upper case, add it to the "capital letters" string.
			if (Character.isUpperCase(currentCh)) {
				char capitalLetter = userString.charAt(i);
				upper += capitalLetter + " ";
			}
			
			// Declare char variable storing upper case version of current character.
			// This will make the vowel testing below simpler.
			char testChar = Character.toUpperCase(currentCh);
			
			// If current character is a vowel, follow instructions within.
			if (testChar == 'A' || testChar == 'E' || testChar == 'I' || testChar == 'O' || testChar == 'U') {
				// Add current position index to string storing them.
				vowelPositions += i + " ";
				// Increase the "number of vowels" integer by 1.
				numVowels++;
				// Replace vowels with "_"s.
				currentCh = '_';
			}
			// If the character isn't a vowel or a space, it should theoretically be a consonant.
			// Thus, if conditions are met, increase the "number of consonants" integer variable by 1.
			else if (testChar != ' ') {
				numConsonants++;
			}
			
			// Add the current character to the new string with vowels replaced.
			vowelsReplaced += currentCh;
		}
		
		// Print results, formatted according to sample output.
		System.out.printf("%-25s%1s\n", "Uppercase Letters: ", upper);
		System.out.printf("%-25s%1s\n", "Vowels Replaced: ", vowelsReplaced);
		System.out.printf("%-25s%1d\n", "Number of Vowels: ", numVowels);
		System.out.printf("%-25s%1d\n", "Number of Consonants: ", numConsonants);
		System.out.printf("%-25s%1s\n", "Positions of Vowels: ", vowelPositions);
	}
}
