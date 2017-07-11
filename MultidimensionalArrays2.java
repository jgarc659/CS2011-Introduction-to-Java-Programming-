
public class MultidimensionalArrays2 {

	public static void main(String[] args) {
		int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}}; 
		
		System.out.println("Original matrix:");
		printMatrix(m);
		System.out.println();
		
		shuffle(m);
		System.out.println("Shuffled matrix:");
		printMatrix(m);
	}

	public static void shuffle(int[][] m) {
		for (int row = 0; row < m.length; row++) {
			int randomNum = (int)(Math.random() * 5);
			int[] temp = new int[2];
			temp = m[row];
			m[row] = m[randomNum];
			m[randomNum] = temp;
		}
	}
	
	public static void printMatrix(int[][] m){
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
	}
}
