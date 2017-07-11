// Import Scanner.
import java.util.Scanner;

public class Practice004 {

	public static void main(String[] args) {
		// Retrieve a user-defined phone number using method.
		char[] phoneNumber = getOriginalPhoneNumber();
		
		// Convert letters to numbers using method.
		lettersToNumbers(phoneNumber);		
		
		// Print final phone number using method.
		printNumber(phoneNumber);
	}
	
	public static char[] getOriginalPhoneNumber() {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String phoneNum = input.next();
		char[] phoneNumber = new char[phoneNum.length()];
		
		for (int i = 0; i < phoneNum.length(); i++) {
			phoneNumber[i] = phoneNum.charAt(i);
		}
		
		return phoneNumber;
	}
	
	public static void lettersToNumbers(char[] phoneNumber) {
		for (int i = 0; i < phoneNumber.length; i++) {
			if (Character.isLetter(phoneNumber[i])) {
				char uppercaseLetter = Character.toUpperCase(phoneNumber[i]);
				phoneNumber[i] = getNumber(uppercaseLetter);
			}
		}
	}
	
	public static char getNumber(char uppercaseLetter) {
		if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
			return '2';
		}
		else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
			return '3';
		}
		else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
			return '4';
		}
		else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
			return '5';
		}
		else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
			return '6';
		}
		else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
			return '7';
		}
		else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
			return '8';
		}
		else {
			return '9';
		}
	}
	
	public static void printNumber(char[] phoneNumber) {
		System.out.println(phoneNumber);
	}

}
