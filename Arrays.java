
public class Arrays {
	
	// Main method.
	public static void main(String[] args) {
		
		int[][] matrix = createMatrix();
		printMatrix(matrix);
		printIndexes(matrix);
	}

	public static int[][] createMatrix() {
		int[][] matrix = new int[4][4];
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				int randomNum = (int)(Math.random() * 2);
				matrix[row][col] = randomNum;
			}
		}
		
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static void printIndexes(int[][] matrix) {
		System.out.println("The largest row index: " + getLargestRowIndex(matrix));
		System.out.println("The largest column index: " + getLargestColIndex(matrix));
	}

	public static int getLargestRowIndex(int[][] matrix) {
		int max = 0;
		int index = 0;
		for (int row = 0; row < matrix.length; row++) {
			int oneCount = 0;
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 1) {
					oneCount++;
				}
			}
			if (oneCount > max) {
				max = oneCount;
				index = row;
			}
		}
		
		return index;
	}
	
	public static int getLargestColIndex(int[][] matrix) {
		int max = 0;
		int index = 0;
		for (int col = 0; col < matrix[0].length; col++) {
			int oneCount = 0;
			for (int row = 0; row < matrix.length; row++) {
				if (matrix[row][col] == 1) {
					oneCount++;
				}
			}
			if (oneCount > max) {
				max = oneCount;
				index = col;
			}
		}
		
		return index;
	}
	
}
