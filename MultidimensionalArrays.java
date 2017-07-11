import java.util.Scanner;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		int[][] matrix = getMatrix();
		printFlippedCell(matrix);
	}
	
	public static int[][] getMatrix() {
		Scanner input = new Scanner(System.in);
		
		int[][] matrix = new int[6][6];
		System.out.println("Enter a 6-by-6 matrix row-by-row: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = input.nextInt();
			}
		}
		
		return matrix;
	}
	
	public static void printFlippedCell(int[][] matrix) {
		int r = getR(matrix);
		int c = getC(r, matrix);
		System.out.println("The flipped cell is at (" + r + ", " + c + ")");
	}
	
	public static int getR(int[][] matrix) {
		int r = 0;
		for (int row = 0; row < matrix.length; row++) {
			int oneCount = 0;
			for (int col = 0; col < matrix[0].length; col++) {
				if (matrix[row][col] == 1) {
					oneCount++;
				}
			}
			if (oneCount % 2 != 0) {
				r = row;
			}
		}
		return r;
	}
	
	public static int getC(int r, int[][] matrix) {
		int c = 0;
		
		for (int col = 0; col < matrix[0].length; col++) {
			int oneCount = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == 1) {
					oneCount++;
				}
			}
			if (oneCount % 2 != 0) {
				c = col;
			}
		}
		
		return c;
	}

}
