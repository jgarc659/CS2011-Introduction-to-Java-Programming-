// Import Scanner.
import java.util.Scanner;

public class GreatDayPractice {
	
	// Declare global Scanner object
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Initialize 2D integer array using method.
		int[][] matrix = createMatrix();
		
		// Print array above in matrix form using method.
		printMatrix(matrix);
	}
	
	public static int[][] createMatrix() {
		System.out.print("Please enter the values for a 3 x 3 matrix: ");
		
		int[][] matrix = new int[3][3];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
			}
		}
	
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		System.out.println("\nThe matrix is printed as follows:\n");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
