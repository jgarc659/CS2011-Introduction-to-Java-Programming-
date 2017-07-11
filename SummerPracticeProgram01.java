// Import scanner.
import java.util.Scanner;

public class SummerPracticeProgram01 {
	
	// Declare global scanner object.
	static Scanner input = new Scanner(System.in);
	
	// Main method.
	public static void main(String[] args) {
		double[][] a = getFirstMatrix();
		double[][] b = getSecondMatrix();
		
		double[][] c = multiplyMatrix(a, b);
		
		displayMultiplicationResults(a, b, c);
	}
	
	// Define method which initializes and returns matrix a.
	public static double[][] getFirstMatrix() {
		double[][] a = new double[3][3];
		System.out.print("Enter matrix a: ");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				a[row][col] = input.nextDouble();
			}
		}
		
		return a;
	}
	
	// Define method which initializes and returns matrix b.
	public static double[][] getSecondMatrix() {
		double[][] b = new double[3][3];
		System.out.print("Enter matrix b: ");
		for (int row = 0; row < b.length; row++) {
			for (int col = 0; col < b[row].length; col++) {
				b[row][col] = input.nextDouble();
			}
		}
		
		return b;
	}
	
	// Define method which multiplies matrices a and b, and returns a new matrix, c.
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] = (a[row][0] * b[0][col]) + (a[row][1] * b[1][col]) + (a[row][2] * b[2][col]);
			}
		}
		
		return c;
	}
	
	// Define method which prints the multiplication of matrices a, b, and c as an equation.
	public static void displayMultiplicationResults(double[][] a, double[][] b, double[][] c) {
		System.out.println("\nThe multiplication of the matrices is\n");
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.printf("%-5.1f", a[row][col]);
			}
			
			if (row == 1) {
				System.out.print("   *  ");
			}
			else {
				System.out.print("      ");
			}
			
			for (int col = 0; col < b[0].length; col++) {
				System.out.printf("%-5.1f", b[row][col]);
			}
			
			if (row == 1) {
				System.out.print("   =  ");
			}
			else {
				System.out.print("      ");
			}
				
			for (int col = 0; col < c[0].length; col++) {
				System.out.printf("%-6.1f", c[row][col]);
			}
		
		System.out.println();
		}
	}

}
