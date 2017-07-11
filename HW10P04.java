/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/20/2017
 Purpose: (HW10P04) Write a program that checks each credit card number in a
 text file and determines whether or not the card is valid.
*/

// Import Scanner class.
import java.util.Scanner;
// Import File class.
import java.io.File;
// Import JFileChooser.
import javax.swing.JFileChooser;
// Import FileNotFoundException class.
import java.io.FileNotFoundException;
// Import PrintWriter class.
import java.io.PrintWriter;

public class HW10P04 {
	// Declare Scanner object.
	static Scanner input = null;
	// Main method.
	public static void main(String[] args) {
		// Create new file credit_card_results.txt for program output below.
		File outputFile = new File("credit_card_results.txt");
		
		// Create PrintWriter object to send program output to file created above.
		PrintWriter output = null;
		try {
			output = new PrintWriter(outputFile);
		} catch (FileNotFoundException e1) {
			System.out.println("Output file not found! Program will now exit!");
			System.exit(1);
		}
		
		
		// Declare JFlieChooser object.
		JFileChooser jfc = new JFileChooser();
				
		// Declare and initialize File variable to be properly in the if statement below.
		File inputFile = null;
		
		// Assign actions to carry out depending on user's actions in JFC dialog box.
		int jfcUserOption = jfc.showOpenDialog(null);
		if (jfcUserOption == JFileChooser.APPROVE_OPTION) {
			inputFile = jfc.getSelectedFile();
		}
		else if(jfcUserOption == JFileChooser.CANCEL_OPTION) {
			output.println("Program was cancelled.");
			System.exit(0);
		}
		else if (jfcUserOption == JFileChooser.ERROR_OPTION) {
			output.println("An unknown error has occured. Program terminated.");
			System.exit(1);
		}
		
		// Use try/catch to make Scanner read values from user-defined input file.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e2) {
			// If the file name doesn't exist, exit program.
			output.println("\nERROR: File not found. Program will now exit.");
			System.exit(1);
		}
		
		// For every credit card number in input file, print a line including the number, company name, and validity status in output file.
		while (input.hasNext()) {
			long number = input.nextLong();
			String companyName = getCompanyName(number);
			String validity = getValidity(number);
		
			String results = String.format("%-20d%-20s%-1s", number, companyName, validity);
			output.println(results);
		}
		
		// Close PrintWriter.
		output.close();
	}
	
	/* Define method which takes the credit card number and returns the 
	corresponding company's name (as a String) according to the first 
	(or first two) digits.*/
	public static String getCompanyName(long number) {
		String numString = "" + number;
		if (numString.charAt(0) == '4') {
			return "Visa";
		}
		else if (numString.charAt(0) == '5') {
			return "Master Card";
		}
		else if (numString.charAt(0) == '6') {
			return "Discover Card";
		}
		else if (numString.startsWith("34") || numString.startsWith("37")) {
			return "American Express";
		}
		else {
			return "None";
		}
	}
	
	// Define method which returns, as a string, whether the CC number is valid or not.
	public static String getValidity(long number) {
		String numString = "" + number;
		
		if (isValid(numString) && (isValidLength(numString))) {
			return "Valid";
		}
		else {
			return "Invalid";
		}
	}
	
	// Define boolean method which determines whether a CC number's length is valid or not.
	public static boolean isValidLength(String numString) {
		int ccNumberLength = numString.length();
		if (ccNumberLength >= 13 && ccNumberLength <= 16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define boolean method which determines the validity of a CC number (assuming its length is valid) after some computations. 
	public static boolean isValid(String numString) {
		int firstSum = firstSum(numString);
		int secondSum = secondSum(numString);
		
		int totalSum = firstSum + secondSum;
		
		if (totalSum % 10 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Define method which computes the first sum listed in the algorithm.
	public static int firstSum(String numString) {
		int firstSum = 0;
		for (int i = numString.length() - 2; i >= 0; i -= 2) {
			firstSum += digitToAdd(numString, i);
		}
		return firstSum;
	}
	
	// Define method which determines the correct integer to add (for use in computing the first sum). 
	public static int digitToAdd(String numString, int i) {
		int digitToAdd = 0;
		String currentDigitStr = "" + numString.charAt(i);
		int currentDigit = Integer.parseInt(currentDigitStr);
		int doubleCurrentDigit = currentDigit * 2;
		// Special case - if doubling a digit results in a two-digit number, add both digits individually to the sum.
		if (doubleCurrentDigit >= 10) {
			String doubleCurrentDigitStr = "" + doubleCurrentDigit;
			String firstNumStr = "" + doubleCurrentDigitStr.charAt(0);
			String secondNumStr = "" + doubleCurrentDigitStr.charAt(1);
			
			int firstNum = Integer.parseInt(firstNumStr);
			int secondNum = Integer.parseInt(secondNumStr);
			
			digitToAdd += firstNum;
			digitToAdd += secondNum;
		}
		else {
			digitToAdd += doubleCurrentDigit;
		}
		
		return digitToAdd;
	}
	
	// Define method which computes the second sum listed in the algorithm by adding all CC digits in the odd places from right to left.
	public static int secondSum(String numString) {
		int secondSum = 0;
		
		for (int i = numString.length() - 1; i >= 0; i -= 2) {
			String currentDigitStr = "" + numString.charAt(i);
			int currentDigit = Integer.parseInt(currentDigitStr);
			
			secondSum += currentDigit;
		}
		return secondSum;
	}
	
}