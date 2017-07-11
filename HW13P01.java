/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/10/2017
 Purpose: (HW13P01) Write a program that, based on the user's choice,
 either randomly generates a 2D array or populates one using File I/O.
*/

// Import Scanner.
import java.util.Scanner;
//Import File class.
import java.io.File;
// Import JFileChooser.
import javax.swing.JFileChooser;
// Import FileNotFoundException class.
import java.io.FileNotFoundException;

public class HW13P01 {
	// Declare Scanner object.
	static Scanner input = new Scanner(System.in);
	// Declare JFlieChooser object.
	static JFileChooser jfc = new JFileChooser();
	// Declare and initialize File variable to be properly in the if statement below.
	static File inputFile = null;
	
	// Define method which prints menu.
	public static void printMenu() {
		final String USER_MENU = 
				"----------------------------------------\n" +
			    "|               2D ARRAYS              |\n" +
				"----------------------------------------\n" +
				"| 1. Randomly Generate 2D Array        |\n" +
				"| 2. Populate An Array Using File I/O  |\n" +
				"----------------------------------------\n" +
				"Enter your menu choice (1 - 2): ";
		System.out.print(USER_MENU);
	}

	// Main method.
	public static void main(String[] args) {
		// Ask user for menu option and store as integer.
		final int RANDOM_GENERATION_CHOICE = 1;
		final int FILE_INPUT_CHOICE = 2;
		printMenu();
		int userChoice = input.nextInt();
		
		// Empty line (for aesthetic purposes.).
		System.out.println();
		
		// Execute method corresponding to user's menu choice.
		switch (userChoice) {
			case RANDOM_GENERATION_CHOICE: 
				randomGenerationChoice();
				break;
			case FILE_INPUT_CHOICE:
				fileInputChoice();
		}
	}
	
	// Define method which executes option 1 from menu.
	public static void randomGenerationChoice() {
		// Prompt user for number of rows & columns, then store.
		System.out.print("How many rows?: ");
		int numRows = input.nextInt();
		System.out.print("How many columns?: ");
		int numCols = input.nextInt();
		System.out.println();
		
		// Prompt user for max and min of values to generate in array, then store.
		System.out.print("Enter the min of the randomly-generated integers: ");
		int minValue = input.nextInt();
		System.out.print("Enter the max of the randomly-generated integers: ");
		int maxValue = input.nextInt();
		System.out.println();
		
		// Use method to generate random array.
		int[][] randomArray = generateRandomArray(numRows, numCols, minValue, maxValue);
		
		// Use method to conduct array operations.
		conductArrayOperations(randomArray);
	}
	
	// Define method which executes option 2 from menu.
	public static void fileInputChoice() {
		// Assign actions to carry out depending on user's actions in JFC dialog box.
		int jfcUserOption = jfc.showOpenDialog(null);
		if (jfcUserOption == JFileChooser.APPROVE_OPTION) {
			inputFile = jfc.getSelectedFile();
		}
		else if(jfcUserOption == JFileChooser.CANCEL_OPTION) {
			System.out.println("Program was cancelled.");
			System.exit(0);
		}
		else if (jfcUserOption == JFileChooser.ERROR_OPTION) {
			System.out.println("An unknown error has occured. Program terminated.");
			System.exit(1);
		}
		
		// Use try/catch to make Scanner read values from user-defined input file.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e2) {
			// If the file name doesn't exist, exit program.
			System.out.println("\nERROR: File not found. Program will now exit.");
			System.exit(1);
		}
		
		// Use methods to generate array and conduct array operations.
		int[][] array = generateArray();
		conductArrayOperations(array);
	}
	
	// Define method which generates a random array, basing some elements on user input.
	public static int[][] generateRandomArray(int numRows, int numCols, int minValue, int maxValue) {
		int[][] randomArray = new int[numRows][numCols];
		for (int row = 0; row < randomArray.length; row++) {
			for (int col = 0; col < randomArray[row].length; col++) {
				randomArray[row][col] = randomInt(minValue, maxValue);
			}
		}
		return randomArray;
	}
	
	// Define method which generates an array from a file.
	public static int[][] generateArray() {
		int numRows = input.nextInt();
		int numCols = input.nextInt();
		
		int[][] array = new int[numRows][numCols];
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input.nextInt();
			}
		}
		
		return array;
	}
	
	// Define method which conducts multiple array operations using other methods.
	public static void conductArrayOperations(int[][] array) {
		printArray(array);
		
		int totalSum = calculateTotalSum(array);
		double totalAvg = calculateTotalAvg(array, totalSum);
		printTotalSumAndAvg(totalSum, totalAvg);
		
		int[] rowSums = computeRowSums(array);
		double[] rowAvgs = computeRowAvgs(array, rowSums);
		printRowSumsAndAvgs(rowSums, rowAvgs);
		
		int[] colSums = computeColSums(array);
		double[] colAvgs = computeColAvgs(array, colSums);
		printColSumsAndAvgs(colSums, colAvgs);
		
		int majorDiagonalSum = computeMajorDiagonalSum(array);
		double majorDiagonalAvg = computeMajorDiagonalAvg(array, majorDiagonalSum);
		
		int minorDiagonalSum = computeMinorDiagonalSum(array); 
		double minorDiagonalAvg = computeMinorDiagonalAvg(array, minorDiagonalSum);
		
		printDiagonalSumsAndAvgs(majorDiagonalSum, majorDiagonalAvg, minorDiagonalSum, minorDiagonalAvg);
		
		int highestAvgRow = computeHighestAvg(rowAvgs);
		int lowestAvgRow = computeLowestAvg(rowAvgs);
		
		int highestAvgCol = computeHighestAvg(colAvgs);
		int lowestAvgCol = computeLowestAvg(colAvgs);
		
		printHighestAndLowestAverages(highestAvgRow, lowestAvgRow, highestAvgCol, lowestAvgCol);
	}
	
	// Define methods which compute the number of the row/column with the highest average, and with the lowest average, respectively.
	public static int computeHighestAvg(double[] avgs) {
		double highestAvg = avgs[0];
		int highestAvgIndex = 0;
		for (int i = 1; i < avgs.length; i++) {
			if (avgs[i] > highestAvg) {
				highestAvg = avgs[i];
				highestAvgIndex = i;
			}
		}
		highestAvgIndex += 1;
		return highestAvgIndex;
	}
	public static int computeLowestAvg(double[] avgs) {
		double lowestAvg = avgs[0];
		int lowestAvgIndex = 0;
		for (int i = 1; i < avgs.length; i++) {
			if (avgs[i] < lowestAvg) {
				lowestAvg = avgs[i];
				lowestAvgIndex = i;
			}
		}
		lowestAvgIndex += 1;
		return lowestAvgIndex;
	}
	
	// Define method which prints the number of the row and column storing the highest and lowest average.
	public static void printHighestAndLowestAverages(int highestAvgRow, int lowestAvgRow, int highestAvgCol, int lowestAvgCol) {
		System.out.println("Row With Highest Average:    " + highestAvgRow);
		System.out.println("Row With Lowest Average:     " + lowestAvgRow);
		System.out.println();
		System.out.println("Column With Highest Average: " + highestAvgCol);
		System.out.println("Column With Lowest Average:  " + lowestAvgCol);
	}
	
	// Define methods which compute the major diagonal's sum and average, respectively.
	public static int computeMajorDiagonalSum(int[][] array) {
		int majorDiagSum = 0;
		for (int index = 0; index < array.length && index < array[0].length; index++) {
			majorDiagSum += array[index][index];
		}
		return majorDiagSum;
	}
	public static double computeMajorDiagonalAvg(int[][] array, int majorDiagSum) {
		int numElements = 0;
		for (int index = 0; index < array.length && index < array[0].length; index++) {
			numElements++;
		}
		
		double majorDiagAvg = majorDiagSum / (numElements * 1.0);
		return majorDiagAvg;
	}
	
	// Define methods which compute the minor diagonal's sum and average, respectively.
	public static int computeMinorDiagonalSum(int[][] array) {
		int minorDiagSum = 0;
		int row = 0;
		for (int colIndex = array[0].length - 1; colIndex >= 0 && row < array.length; colIndex--) {
			minorDiagSum += array[row][colIndex];
			row++;
		}
		return minorDiagSum;
	}
	public static double computeMinorDiagonalAvg(int[][] array, int minorDiagSum) {
		int numElements = 0;
		int row = 0;
		for (int colIndex = array[0].length - 1; colIndex >= 0 && row < array.length; colIndex--) {
			numElements++;
			row++;
		}
		
		double minorDiagAvg = minorDiagSum / (numElements * 1.0);
		return minorDiagAvg;
	}
	
	// Define method which prints both diagonals' sum and average.
	public static void printDiagonalSumsAndAvgs(int majorDiagonalSum, double majorDiagonalAvg, int minorDiagonalSum, double minorDiagonalAvg) {
		System.out.println("Sum of Major Diagonal:     " + majorDiagonalSum);
		System.out.println("Average of Major Diagonal: " + majorDiagonalAvg);
		System.out.println();
		System.out.println("Sum of Minor Diagonal:     " + minorDiagonalSum);
		System.out.println("Average of Minor Diagonal: " + minorDiagonalAvg);
		System.out.println();
	}
	
	// Define methods which compute the sum and average of each row, respectively.
	public static int[] computeRowSums(int[][] array) {
		int[] rowSums = new int[array.length];
		
		for (int row = 0; row < array.length; row++) {
			int rowSum = 0;
			for (int col = 0; col < array[row].length; col++) {
				rowSum += array[row][col];
			}
			rowSums[row] = rowSum;
		}
		
		return rowSums;
	}
	public static double[] computeRowAvgs(int[][] array, int[] rowSums) {
		double[] rowAvgs = new double[array.length];
		
		int numElements = array[0].length;
		
		for (int index = 0; index < rowAvgs.length; index++) {
			rowAvgs[index] = rowSums[index] / (numElements * 1.0);
		}
		
		return rowAvgs;
		
	}
	
	// Define method which prints the sum and average of each row.
	public static void printRowSumsAndAvgs(int[] rowSums, double[] rowAvgs) {
		for (int index = 0; index < rowSums.length; index++) {
			System.out.println("Sum of Row " + (index + 1) + ":     " + rowSums[index]);
			System.out.println("Average of Row " + (index + 1) + ": " + rowAvgs[index]);
			System.out.println();
		}
	}
	
	// Define methods which compute the sums and averages of each column, respectively.
	public static int[] computeColSums(int[][] array) {
		int[] colSums = new int[array[0].length];
		
		for (int col = 0; col < array[0].length; col++) {
			int colSum = 0;
			for (int row = 0; row < array.length; row++) {
				colSum += array[row][col];
			}
			colSums[col] = colSum;
		}
		
		return colSums;
	}
	public static double[] computeColAvgs(int[][] array, int[] colSums) {
		double[] colAvgs = new double[array[0].length];
		
		int numElements = array.length;
		
		for (int index = 0; index < colAvgs.length; index++) {
			colAvgs[index] = colSums[index] / (numElements * 1.0);
		}
		
		return colAvgs;
	}
	
	// Define method which prints the sum and average of each column.
	public static void printColSumsAndAvgs(int[] colSums, double[] colAvgs) {
		for (int index = 0; index < colSums.length; index++) {
			System.out.println("Sum of Column " + (index + 1) + ":     " + colSums[index]);
			System.out.println("Average of Column " + (index + 1) + ": " + colAvgs[index]);
			System.out.println();
		}
	}
	
	// Define method which generates a random number within a user-defined min and max.
	public static int randomInt(int minValue, int maxValue) {
		int randomInt = minValue + (int)(Math.random() * (maxValue - minValue + 1));
		return randomInt;
	}
	
	// Define method which prints a formatted array.
	public static void printArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.printf("%-4d", array[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Define methods which calculate the total sum and average of a 2D array, respectively.
	public static int calculateTotalSum(int[][] array) {
		int totalSum = 0;
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				totalSum += array[row][col];
			}
		}
		return totalSum;
	}
	public static double calculateTotalAvg(int[][] array, int totalSum) {
		int numElements = 0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				numElements++;
			}
		}
		
		double totalAverage = (totalSum * 1.0) / numElements;
		return totalAverage;
	}
	
	// Define method which prints the total sum and average of a 2D array.
	public static void printTotalSumAndAvg(int totalSum, double totalAvg) {
		System.out.println("Total Sum:     " + totalSum);
		System.out.println("Total Average: " + totalAvg);
		System.out.println();
	}
	
}