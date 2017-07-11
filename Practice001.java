import java.util.Scanner;

public class Practice001 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[][] m1 = createArrayOne();
		int[][] m2 = createArrayTwo();
		
		testForEquality(m1, m2);
		
	}
	
	public static void testForEquality(int[][] m1, int[][] m2){
		if (equals(m1, m2)) {
			System.out.println("\nThe two arrays are identical.");
		}
		else {
			System.out.println("\nThe two arrays are not identical.");
		}
	}
	
	public static int[][] createArrayOne() {
		int[][] m1 = new int[3][3];
		System.out.print("Enter list1: ");
		
		for (int row = 0; row < m1.length; row++) {
			for(int col = 0; col < m1[row].length; col++) {
				m1[row][col] = input.nextInt();
			}
		}
		
		return m1;
	}
	
	public static int[][] createArrayTwo() {
		int[][] m2 = new int[3][3];
		System.out.print("Enter list2: ");
		
		for (int row = 0; row < m2.length; row++) {
			for(int col = 0; col < m2[row].length; col++) {
				m2[row][col] = input.nextInt();
			}
		}
		
		return m2;
	}
	
	public static boolean equals(int[][] m1, int[][] m2) {
		boolean equals = true;
		for(int row = 0; row < m1.length; row++) {
			for(int col = 0; col < m1[row].length; col++) {
				
				int count = 0;
				
				for(int row2 = 0; row2 < m2.length; row2++) {
					for(int col2 = 0; col2 < m2[row2].length; col2++) {
						if (m1[row][col] == m2[row2][col2]) {
							count++;
						}
					}
				}
				
				if (count == 0) {
					equals = false;
				}
				
			}
		}
		
		return equals;
	}

}
