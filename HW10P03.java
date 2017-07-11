/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/20/2017
 Purpose: (HW10P03) Write a program that conducts operations
 based on the following 3 menu choices: display prime palindromes,
 display mirrored primes, and exit program. 
*/

// Import Scanner
import java.util.Scanner;

public class HW10P03 {
	// Declare Scanner object.
	static Scanner input = new Scanner(System.in);
	
	// Main method.
	public static void main(String[] args) {
		// Store menu in String constant.
		final String USER_MENU = 
				"PRIME VARIATIONS"
				+ "\n----------------"
				+ "\n\n1. Display Prime Palindromes"
				+ "\n2. Display Mirrored Primes"
				+ "\n3. Exit Program"
				+ "\n\nPlease enter a choice from the menu above: ";
		
		// Define menu choices as constant integer values.
		final int PRIME_PALINDROMES_CHOICE = 1;
		final int MIRRORED_PRIMES_CHOICE = 2;
		final int EXIT_CHOICE = 3;
		
		// Infinite loop - broken if user chooses to exit program.
		while (true) {
			// Prompt user for menu choice, then store choice in integer variable.
			System.out.print(USER_MENU);
			int menuChoice = input.nextInt();
			
			// Conduct operations corresponding to user input.
			if (menuChoice == PRIME_PALINDROMES_CHOICE) {
				primePalindromesChoice();
			}
			else if (menuChoice == MIRRORED_PRIMES_CHOICE) {
				mirroredPrimesChoice();
			}
			else if (menuChoice == EXIT_CHOICE) {
				exitProgram();
			}
			// Input Validation: If user's menu choice is not valid, print statement notifying user and restart loop.
			else {
				System.out.println("\nERROR: Please enter a valid menu choice on [1, 3].\n");
			}
			
			// Empty line (for aesthetic purposes).
			System.out.println();
		}
	}
	
	// Define void method which asks user to enter the number of prime palindromes and calls another method to print them.
	public static void primePalindromesChoice() {
		System.out.print("How many prime palindromes to display?: ");
		int n = input.nextInt();
		System.out.println();
		printPrimePalindromes(n);
	}

	// Define void method which asks user to enter the number of mirrored primes and calls another method to print them.
	public static void mirroredPrimesChoice() {
		System.out.print("How many mirrored primes to display?: ");
		int n = input.nextInt();
		System.out.println();
		printMirroredPrimes(n);
	}
	
	/* Define a void method that takes the user-defined number of prime palindromes "n" and prints the 
	first n numbers meeting the criteria, formatted as indicated. */
	public static void printPrimePalindromes(int n) {
		int currentPrimePalindrome = 2;
		
		for (int i = 1; i <= n; i++) {
			currentPrimePalindrome = computePrimePalindrome(currentPrimePalindrome);
			
			System.out.print(currentPrimePalindrome + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
			// Increment current number stored in prime palindrome variable for further testing in the method at the start of the loop.
			currentPrimePalindrome++;
		}
		// Print an empty line at the end if one isn't already there.
		if (!(n % 10 == 0)) {
			System.out.println();
		}
	}
	
	/* Define a void method that takes the user-defined number of mirrored primes "n" and prints the 
	first n numbers meeting the criteria, formatted as indicated. */
	public static void printMirroredPrimes(int n) {
		int currentMirroredPrime = 2;
		for (int i = 1; i <= n; i++) {
			currentMirroredPrime = computeMirroredPrime(currentMirroredPrime);
			
			System.out.print(currentMirroredPrime + " ");
			
			if (i % 10 == 0) {
				System.out.println();
			}
			// Increment current number stored in mirrored prime variable for further testing in the method at the start of the loop.
			currentMirroredPrime++;
		}
		// Print an empty line at the end if one isn't already there.
		if (!(n % 10 == 0)) {
			System.out.println();
		}
	}
	
	// Define a method that increments until it finds a prime palindrome, then returns it.
	public static int computePrimePalindrome(int currentPrimePalindrome) {
		while (true) {
			if (isPrime(currentPrimePalindrome) && isPalindrome(currentPrimePalindrome)) {
				return currentPrimePalindrome;
			}
			currentPrimePalindrome++;
		}
	}
	
	// Define a method that increments until it finds a mirrored prime, then returns it.
	public static int computeMirroredPrime(int currentMirroredPrime) {
		while (true) {
			if (isPrime(currentMirroredPrime) && mirrorIsPrime(currentMirroredPrime)) {
				return currentMirroredPrime;
			}
			currentMirroredPrime++;
		}
	}
	
	// Define boolean-returning method that checks if a number is prime.
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Define boolean-returning method that checks if a number is a palindrome.
	public static boolean isPalindrome(int number) {
		String numString = "" + number;
		String reverseNumString = "";
		
		for (int i = (numString.length() - 1); i >= 0; i--) {
			reverseNumString += numString.charAt(i);
		}
		
		if (numString.equals(reverseNumString)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean-returning method that determines if a number's mirror is prime.
	public static boolean mirrorIsPrime(int number) {
		String numString = "" + number;
		String reverseNumString = "";
		for (int i = (numString.length() - 1); i >= 0; i--) {
			reverseNumString += numString.charAt(i);
		}
		
		int reverseNum = Integer.parseInt(reverseNumString);
		
		// Special case: If the number happens to be 2, return false.
		if (reverseNum == 2) {
			return false;
		}
		
		for (int i = 2; i < reverseNum; i++) {
			if (reverseNum % i == 0 || reverseNum == number) {
				return false;
			}
		}
		return true;
	}
	
	// Define a method which exits program and prints a statement saying so.
	public static void exitProgram() {
		System.out.println("Program will now exit.");
		System.exit(0);
	}
}