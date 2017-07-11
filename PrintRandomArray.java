import java.util.Scanner;

public class PrintRandomArray {
	public static void main(String[] args) {
		int[][] array = createArray();
		printArray(array);
	}
	
	public static int[][] createArray() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int numRows = input.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int numCols = input.nextInt();
		
		int[][] array = new int[numRows][numCols];
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				int randomNum = (int)(Math.random() * 4) + 3;
				array[row][col] = randomNum;
			}
		}
		
		return array;
	}
	
	public static void printArray(int[][] array){
		System.out.println("\nBelow is the randomly-generated 2D array: \n");
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + " ");
			}
			System.out.println();
		}
	}
}