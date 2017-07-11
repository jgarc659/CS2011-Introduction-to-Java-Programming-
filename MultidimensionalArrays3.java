// Import scanner.
import java.util.Scanner;

public class MultidimensionalArrays3 {
	// Create global scanner object.
	static Scanner input = new Scanner(System.in);
	
	// Main method.
	public static void main(String[] args) {
		double[][] matrix = createMatrix();
		
		initializeMatrix(matrix);
		printResults(matrix);
	}
	
	// Define method which 
	public static double[][] createMatrix() {
		System.out.print("Enter the number of rows and columns in the array: ");
		int numRows = input.nextInt();
		int numCols = input.nextInt();
		
		double[][] matrix = new double[numRows][numCols];
		return matrix;
	}
	
	// Define method which 
	public static void initializeMatrix(double[][] matrix) {
		System.out.println("Enter the array:");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextDouble();
			}
		}
	}
	
	// Define method which 
	public static void printResults(double[][] matrix) {
		int[] largestLocation = locateLargest(matrix);
		
		System.out.println("The location of the largest element is at (" + largestLocation[0] + ", " + largestLocation[1] + ")");
	}
	
	// Define method which 
	public static int[] locateLargest(double[][] a) {
		double max = a[0][0];
		int rowNum = 0;
		int colNum = 0;
		
		for (int row = 1; row < a.length; row++) {
			for (int col = 1; col < a[row].length; col++) {
				if (a[row][col] > max) {
					max = a[row][col];
					rowNum = row;
					colNum = col;
				}
			}
		}
		
		int[] largestLocation = {rowNum, colNum};
		return largestLocation;
	}

}
