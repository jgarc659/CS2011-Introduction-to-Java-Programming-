/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 03/07/2017
 Purpose: (HW06P06) Write a program that asks the user for a date,
 a name, and the amount of a check, then uses them to print a fully-
 formatted check.
*/

// Import Scanner from Java class.
import java.util.Scanner;

public class HW06P06 {
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Prompt user for check amount, then store input in double variable and formatted amount in string variable.
		System.out.print("What is the amount of the check?: ");
		double amount = input.nextDouble();
		String formattedAmount = String.format("%1.2f", amount);
		
		
		// Input Validation: If amount entered is out of specified range, terminate program.
		if (amount < 0 || amount > 5000) {
			System.out.println("ERROR: Amount entered must be from $0 - $5000.");
			System.out.println("Program will now exit.");
			System.exit(1);
		}
		
		// Prompt user for date, then store in String variable.
		System.out.print("Enter the date of the check: ");
		String date = input.next();
		
		// Bypass Scanner irregularity.
		input.nextLine();
		
		// Prompt user for his/her name, then store in String variable.
		System.out.print("Who is the check for?: ");
		String name = input.nextLine();
		
		// Empty line (for aesthetic purposes).
		System.out.println(" ");
		
		// Print date, formatted according to the spacing of the sample output.
		System.out.printf("%68s%1s\n", "Date: ", date);
		
		// Empty line.
		System.out.println(" ");
		
		// Print name and (formatted) amount according to the spacing of the sample output.
		System.out.printf("%1s%1s%18s%1s\n", "Pay to the Order of: ", name, "$", formattedAmount);
		
		// Empty line.
		System.out.println(" ");
		
		// Declare and initialize char variables for all potential numbers before decimal point.
		char onesValue = '0';
		char tensValue = '0';
		char hundredsValue = '0';
		char thousandsValue = '0';
		
		// Re-declare above char variables according to length of check amount (formatted).
		if (formattedAmount.length() == 4) {
			onesValue = formattedAmount.charAt(0);
		}
		else if (formattedAmount.length() == 5) {
			onesValue = formattedAmount.charAt(1);
			tensValue = formattedAmount.charAt(0);
		}
		else if (formattedAmount.length() == 6) {
			onesValue = formattedAmount.charAt(2);
			tensValue = formattedAmount.charAt(1);
			hundredsValue = formattedAmount.charAt(0);
		}
		else if (formattedAmount.length() == 7) {
			onesValue = formattedAmount.charAt(3);
			tensValue = formattedAmount.charAt(2);
			hundredsValue = formattedAmount.charAt(1);
			thousandsValue = formattedAmount.charAt(0);
		}
		
		// Declare and initialize String variables that will correspond to char values above, to be written in plain English.
		String onesWord = "";
		String teensWord = "";
		String tensWord = "";
		String hundredsWord = "";
		String thousandsWord = "";
		
		// Store cents value in a String variable.
		String cents = formattedAmount.substring(formattedAmount.lastIndexOf(".") + 1);
		
		// Assign word value to onesWord String variable corresponding to the number in the "ones" place.
		if (onesValue == '0') {
			onesWord = " ";
		}
		else if (onesValue == '1') {
			onesWord = "One ";
		}
		else if (onesValue == '2') {
			onesWord = "Two ";
		}
		else if (onesValue == '3') {
			onesWord = "Three ";
		}
		else if (onesValue == '4') {
			onesWord = "Four ";
		}
		else if (onesValue == '5') {
			onesWord = "Five ";
		}
		else if (onesValue == '6') {
			onesWord = "Six ";
		}
		else if (onesValue == '7') {
			onesWord = "Seven ";
		}
		else if (onesValue == '8') {
			onesWord = "Eight ";
		}
		else if (onesValue == '9') {
			onesWord = "Nine ";
		}
		
		// Assign word value to tensWord String variable corresponding to the number in the "tens" place.
		if (tensValue == '0') {
			tensWord = "";
		}
		// Special case: The words for values 10-19 represent both the "tens" place and "ones" place ("teens" values).
		else if (tensValue == '1') {
			if (onesValue == '0') { 
				teensWord = "Ten ";
			}
			if (onesValue == '1') { 
				teensWord = "Eleven ";
			}
			if (onesValue == '2') { 
				teensWord = "Twelve ";
			}
			if (onesValue == '3') { 
				teensWord = "Thirteen ";
			}
			if (onesValue == '4') { 
				teensWord = "Fourteen ";
			}
			if (onesValue == '5') { 
				teensWord = "Fifteen ";
			}
			if (onesValue == '6') { 
				teensWord = "Sixteen ";
			}
			if (onesValue == '7') { 
				teensWord = "Seventeen ";
			}
			if (onesValue == '8') { 
				teensWord = "Eighteen ";
			}
			if (onesValue == '9') { 
				teensWord = "Nineteen ";
			}
		}
		else if (tensValue == '2') {
			tensWord = "Twenty ";
		}
		else if (tensValue == '3') {
			tensWord = "Thirty ";
		}
		else if (tensValue == '4') {
			tensWord = "Forty ";
		}
		else if (tensValue == '5') {
			tensWord = "Fifty ";
		}
		else if (tensValue == '6') {
			tensWord = "Sixty ";
		}
		else if (tensValue == '7') {
			tensWord = "Seventy ";
		}
		else if (tensValue == '8') {
			tensWord = "Eighty ";
		}
		else if (tensValue == '9') {
			tensWord = "Ninety ";
		}
		
		// Assign word value to hundredsWord String variable corresponding to the number in the "hundreds" place.
		if (hundredsValue == '0') {
			hundredsWord = "";
		}
		else if (hundredsValue == '1') {
			hundredsWord = "One hundred ";
		}
		else if (hundredsValue == '2') {
			hundredsWord = "Two hundred ";
		}
		else if (hundredsValue == '3') {
			hundredsWord = "Three hundred ";
		}
		else if (hundredsValue == '4') {
			hundredsWord = "Four hundred ";
		}
		else if (hundredsValue == '5') {
			hundredsWord = "Five hundred ";
		}
		else if (hundredsValue == '6') {
			hundredsWord = "Six hundred ";
		}
		else if (hundredsValue == '7') {
			hundredsWord = "Seven hundred ";
		}
		else if (hundredsValue == '8') {
			hundredsWord = "Eight hundred ";
		}
		else if (hundredsValue == '9') {
			hundredsWord = "Nine hundred ";
		}
		
		// Assign word value to thousandsWord String variable corresponding to the number in the "thousands" place.
		if (thousandsValue == '0') {
			thousandsWord = "";
		}
		else if (thousandsValue == '1') {
			thousandsWord = "One thousand ";
		}
		else if (thousandsValue == '2') {
			thousandsWord = "Two thousand ";
		}
		else if (thousandsValue == '3') {
			thousandsWord = "Three thousand ";
		}
		else if (thousandsValue == '4') {
			thousandsWord = "Four thousand ";
		}
		else if (thousandsValue == '5') {
			thousandsWord = "Five thousand ";
		}
		
		
		/* Print check amount in word form, formatted based on how it conforms to certain conditions (the length
		of the formatted check amount, whether or not the value in the "tens" place is a 1, whether or not the 
		value in the "ones" places is a 0, etc.*/
		if (formattedAmount.length() == 7 && tensValue == '1') {
			// Make all Strings that aren't listed first (all but thousandsWord) lower case.
			hundredsWord = hundredsWord.toLowerCase();
			teensWord = teensWord.toLowerCase();
			System.out.println(thousandsWord + hundredsWord + teensWord + "and " + cents + " cents");
		}
		else if (formattedAmount.length() == 7 && tensValue != '1') {
			// Make all Strings that aren't listed first (all but thousandsWord) lower case.
			hundredsWord = hundredsWord.toLowerCase();
			tensWord = tensWord.toLowerCase();
			onesWord = onesWord.toLowerCase();
			if (onesValue == '0') {
				System.out.println(thousandsWord + hundredsWord + tensWord + "and " + cents + " cents");
			}
			else {
				System.out.println(thousandsWord + hundredsWord + tensWord + onesWord + "and " + cents + " cents");
			}	
		}
			
		if (formattedAmount.length() == 6 && tensValue == '1') {
			// Make all Strings that aren't listed first (all but hundredsWord) lower case.
			teensWord = teensWord.toLowerCase();
			System.out.println(hundredsWord + teensWord + "and " + cents + " cents");
		}
		else if (formattedAmount.length() == 6 && tensValue != '1') {
			// Make all Strings that aren't listed first (all but hundredsWord) lower case.
			tensWord = tensWord.toLowerCase();
			onesWord = onesWord.toLowerCase();
			if (onesValue == '0') {
				System.out.println(hundredsWord + tensWord + "and " + cents + " cents");
			}
			else {
				System.out.println(hundredsWord + tensWord + onesWord + "and " + cents + " cents");
			}
		}
		
		if (formattedAmount.length() == 5 && tensValue == '1') {
			System.out.println(teensWord + "and " + cents + " cents");
		}
		else if (formattedAmount.length() == 5 && tensValue != '1') {
			// Make all Strings that aren't listed first (all but tensWord) lower case.
			onesWord = onesWord.toLowerCase();
			if (onesValue == 0) {
				System.out.println(tensWord + "and " + cents + " cents");
			}
			else {
				System.out.println(tensWord + onesWord + "and " + cents + " cents");
			}
		}
	
		if (formattedAmount.length() == 4 && onesValue > '0') {
			System.out.println(onesWord + "and " + cents + " cents");
		}
		else if (formattedAmount.length() == 4 && onesValue == '0') {
			System.out.println(cents + " cents");
		}
		
	}
}
