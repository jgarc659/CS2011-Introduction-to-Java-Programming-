import java.util.Scanner;

public class Practice002 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		double[][] points = createArray();
		
		printTriangleArea(points);
	}
	
	public static double[][] createArray(){
		double[][] points = new double[3][2];
		System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
		
		for(int row = 0; row < points.length; row++) {
			for(int col = 0; col < points[row].length; col++) {
				points[row][col] = input.nextDouble();
			}
		}
		
		return points;
	}
	
	public static void printTriangleArea(double[][] points) {
		double area = getTriangleArea(points);
		
		if (isValid(area)) {
			System.out.printf("%1s%1.2f", "The area of the triangle is ", area);
		}
		else {
			System.out.println("The three points are on the same line");
		}
	}
	
	public static boolean isValid(double area) {
		final double EPSILON = 10E-14;
		
		if (area < EPSILON) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static double getTriangleArea(double[][] points) {
		double side1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow(points[1][1] - points[0][1], 2));
		double side2 = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2) + Math.pow(points[2][1] - points[1][1], 2));
		double side3 = Math.sqrt(Math.pow((points[0][0] - points[2][0]), 2) + Math.pow(points[0][1] - points[2][1], 2));
		
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}

}
