// Import Scanner.
import java.util.Scanner;
import javax.swing.JFileChooser;

public class MorePractice {
	
	// Main method.
	public static void main(String[] args) {
		// Declare scanner object.
		Scanner input = new Scanner(System.in);
		
		// Constantly run program until user chooses to exit manually.
		while (true) {
			int num = getNumber(input);
			printGraph(num);
		}
		
	}
	
	// Define method which stores user-defined integer in an variable.
	public static int getNumber(Scanner input) {
		System.out.print("Enter your number (0 to exit): ");
		
		int num = input.nextInt();
		inputVerification(num);
		
		return num;
	}
	
	// Define method which checks whether the user input equals 0.
	public static void inputVerification (int num) {
		// If user input equals 0, exit program.
		if (num == 0) {
			System.out.println("\nThe program will now exit. \nThank you.");
			System.exit(0);
		}
	}
	
	// Define method which prints two-dimensional array in the form of a matrix.
	public static void printGraph(int num) {
		int[][] matrix = createMatrix(num);
		System.out.println("\nThe graph is printed as follows:\n");
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (row % 2 == 0) {
					System.out.print(matrix[row][col] - col + " ");
				}
				else {
					System.out.print((col + 1) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// Define method which initializes the values in a 2D array using the user-defined number.
	public static int[][] createMatrix(int num) {
		int[][] matrix = new int[num][num];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = num;
			}
		}
		
		return matrix;
	}

}
