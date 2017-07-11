// Import Scanner.
import java.util.Scanner;

public class Arrays2 {
	// Declare Scanner object.
	static Scanner input = new Scanner(System.in);
	// Main method.
	public static void main(String[] args) {		
		// Use methods to declare matrices.
		double[][] arr1 = createArr1();
		double[][] arr2 = createArr2();
		
		printResults(arr1, arr2);
	}

	public static double[][] createArr1() {
		double[][] arr1 = new double[3][3];
		System.out.print("Enter matrix 1: ");
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				arr1[row][col] = input.nextDouble();
			}
		}
		
		return arr1;
	}
	
	public static double[][] createArr2() {
		double[][] arr2 = new double[3][3];
		System.out.print("Enter matrix 2: ");
		for (int row = 0; row < arr2.length; row++) {
			for (int col = 0; col < arr2[row].length; col++) {
				arr2[row][col] = input.nextDouble();
			}
		}
		return arr2;
	}
	
	public static void printResults(double[][] arr1, double[][] arr2) {
		double[][] sum = createSumMatrix(arr1, arr2);
		System.out.println("The matrices are added as follows ");
		for (int col = 0; col < arr1[0].length; col++) {
			System.out.print(arr1[0][col] + " ");
		}
		
		System.out.print("       ");
		
		for (int col = 0; col < arr2[0].length; col++) { 
			System.out.print(arr2[0][col] + " ");
		}
		
		System.out.print("       ");
		
		for (int col = 0; col < sum[0].length; col++) { 
			System.out.print(sum[0][col] + " ");
		}
		
		System.out.println();
		
		//
		for (int col = 0; col < arr1[0].length; col++) {
			System.out.print(arr1[1][col] + " ");
		}
		
		System.out.print("  +    ");
		
		for (int col = 0; col < arr2[0].length; col++) { 
			System.out.print(arr2[1][col] + " ");
		}
		
		System.out.print("  =    ");
		
		for (int col = 0; col < sum[0].length; col++) { 
			System.out.print(sum[1][col] + " ");
		}
		
		System.out.println();
		
		//
		for (int col = 0; col < arr1[0].length; col++) {
			System.out.print(arr1[2][col] + " ");
		}
		
		System.out.print("       ");
		
		for (int col = 0; col < arr2[0].length; col++) { 
			System.out.print(arr2[2][col] + " ");
		}
		
		System.out.print("       ");
		
		for (int col = 0; col < sum[0].length; col++) { 
			System.out.print(sum[2][col] + " ");
		}
		
		System.out.println();
	}
	
	public static double[][] createSumMatrix(double[][] arr1, double[][] arr2) {
		double[][] sum = new double[3][3];
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				sum[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		return sum;
	}
	
}
