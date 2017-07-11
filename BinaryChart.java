// Import Scanner.
import java.util.Scanner;

public class BinaryChart {
	// Create global Scanner object.
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			int decimalNumber = getDecimalNum();
			
			String binaryNum = decimalToBinary(decimalNumber);
			char[][] coinChart = createCoinChart(binaryNum);
			
			printCoinChart(coinChart);
		}
	}

	
	public static int getDecimalNum() {
		int number = 512;
		while (!isValid(number)) {
			System.out.print("Enter a number between 0 and 511: ");
			number = input.nextInt();
			if (!isValid(number)) {
				System.out.println("\nERROR: Number entered is out-of-bounds [0, 511]. Please try again.\n");
			}
		}
			
		return number;
	}
	
	public static boolean isValid(int number) {
		if (number >= 0 && number <= 511) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String decimalToBinary(int decimalNumber) {
		String binaryNumber = Integer.toBinaryString(decimalNumber);
		if (binaryNumber.length() < 9) {
			int difference = 9 - binaryNumber.length();
			String newBinaryNum = "";
			
			for (int i = 1; i <= difference; i++) {
				newBinaryNum += "0";
			}
			
			newBinaryNum += binaryNumber;
			
			return newBinaryNum;
		}
		
		return binaryNumber;
	}
	
	public static char[][] createCoinChart(String binaryNum) {
		char[][] coinChart = new char[3][3];
		int count = 0;
		
		for (int row = 0; row < coinChart.length; row++) {
			for (int col = 0; col < coinChart[row].length; col++) {
				coinChart[row][col] = convertToLetter(binaryNum.charAt(count));
				count++;
			}
		}
		
		return coinChart;
	}
	
	public static char convertToLetter(char binaryDigit) {
		if (binaryDigit == '1') {
			return 'T';
		}
		else {
			return 'H';
		}
	}
	
	public static void printCoinChart(char[][] coinChart) {
		System.out.println();
		for (int row = 0; row < coinChart.length; row++) {
			for (int col = 0; col < coinChart[row].length; col++) {
				System.out.print(coinChart[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
