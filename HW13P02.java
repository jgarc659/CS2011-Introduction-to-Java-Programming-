/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 05/10/2017
 Purpose: (HW13P02) Write a program that computes and displays some
 data about a number of products.
 */

// Import Scanner.
import java.util.Scanner;

public class HW13P02 {
	// Main method.
	public static void main(String[] args) {
		// Declare and initialize three arrays whose information is to be used below.
		int[][] numComponents = {
				{9, 13, 4, 7, 1, 14, 10},
				{8, 2, 12, 11, 6, 15, 2},
				{9, 6, 7, 10, 15, 8, 3},
				{12, 14, 8, 15, 2, 7, 8},
				{12, 10, 3, 11, 8, 3, 5},
		};
		String[] productNames = {"MP3 Player", "Smart Phone", "Digital Watch", "Tablet", "Portable Gaming System"};
		double[] componentCosts = {10.75, 15.27, 5.98, 9.67, 4.32, 12.50, 1.42};
		
		// Use methods to print the total costs of each device.
		double[] costs = computeCosts(numComponents, productNames, componentCosts);
		printCosts(productNames, costs);
		
		// Use methods to compute the highest-costing and lowest-costing products.
		String highestCostProduct = computeHighestCostProduct(costs, productNames);
		String lowestCostProduct = computeLowestCostProduct(costs, productNames);
		
		// Use method to print both the highest and lowest costing products.
		printHighestAndLowestCostProducts(highestCostProduct, lowestCostProduct);
		
		// Use methods to compute and print the average number of components for each device.
		int[] avgNumOfComponents = computeAvgNumOfComponents(numComponents);
		printAvgNumOfComponents(avgNumOfComponents, productNames);
		
		// Use methods to compute and print the devices with the least and most components.
		String deviceWithLeastComponents = getDeviceWithLeastComponents(numComponents, productNames);
		String deviceWithMostComponents = getDeviceWithMostComponents(numComponents, productNames);
		printDevicesWithLeastAndMostComponents(deviceWithLeastComponents, deviceWithMostComponents);
	}
	
	// Define methods which compute and print the total cost of each product.
	public static double[] computeCosts(int[][] numComponents, String[] productNames, double[] componentCosts) {
		double[] costs = new double[numComponents.length];
		
		for (int product = 0; product < productNames.length; product++) {
			for (int component = 0; component < numComponents[product].length; component++) {
				costs[product] += (numComponents[product][component] * componentCosts[component]);
			}
		}
		return costs;
	}
	public static void printCosts(String[] productNames, double[] costs) {
		for (int product = 0; product < 5; product++) {
			System.out.printf("%-29s$%1.2f\n", (productNames[product] + " Cost:"), costs[product]);
		}
		System.out.println();
	}
	
	// Define methods which return the lowest and highest costing products, respectively.
	public static String computeLowestCostProduct(double[] costs, String[] productNames) {
		double lowestCost = costs[0];
		String lowestCostProduct = productNames[0];
		
		for (int i = 1; i < costs.length; i++) {
			if (costs[i] < lowestCost) {
				lowestCost = costs[i];
				lowestCostProduct = productNames[i];
			}
		}
		
		return lowestCostProduct;
	}
	public static String computeHighestCostProduct(double[] costs, String[] productNames) {
		double highestCost = costs[0];
		String highestCostProduct = productNames[0];
		
		for (int i = 1; i < costs.length; i++) {
			if (costs[i] > highestCost) {
				highestCost = costs[i];
				highestCostProduct = productNames[i];
			}
		}
		
		return highestCostProduct;
	}
	
	// Define method which prints the highest and lowest costing products.
	public static void printHighestAndLowestCostProducts(String highestCostProduct, String lowestCostProduct) {
		System.out.printf("%-23s%1s\n", "Highest Cost Device:", highestCostProduct);
		System.out.printf("%-23s%1s\n", "Lowest Cost Device:", lowestCostProduct);
		System.out.println();
	}	
	
	// Define methods which compute and print the average number of components for each device, respectively.
	public static int[] computeAvgNumOfComponents(int[][] numComponents) {
		int[] avgNumOfComponents = new int[numComponents.length];
		for (int i = 0; i < numComponents.length; i++) {
			int totalNumComponents = 0;
			for (int j = 0; j < numComponents[i].length; j++) {
				totalNumComponents += numComponents[i][j];
			}
			avgNumOfComponents[i] = totalNumComponents / numComponents[i].length;
		}
		
		return avgNumOfComponents;
	}
	public static void printAvgNumOfComponents(int[] avgNumOfComponents, String[] productNames) {
		for (int i = 0; i < productNames.length; i++) {
			System.out.printf("%-63s%1d\n", ("Average Number Of Components For The " + productNames[i] + ":"), avgNumOfComponents[i]);
		}
		System.out.println();
	}
	
	// Define methods which return the device with the most components and the device with the least components, respectively.
	public static String getDeviceWithMostComponents(int[][] numComponents, String[] productNames) {
		String deviceWithMostComponents = "";
		int maxNumComponents = 0;
		
		for (int i = 0; i < numComponents.length; i++) {
			int numComponentsRow = 0;
			for (int j = 0; j < numComponents[i].length; j++) {
				numComponentsRow += numComponents[i][j];
			}
			if (numComponentsRow > maxNumComponents) {
				maxNumComponents = numComponentsRow;
				deviceWithMostComponents = productNames[i];
			}
		}
		return deviceWithMostComponents;
	}
	public static String getDeviceWithLeastComponents(int[][] numComponents, String[] productNames) {
		String deviceWithLeastComponents = "";
		int leastNumComponents = 0;
		
		for (int column = 0; column < numComponents[1].length; column++) {
			leastNumComponents += numComponents[0][column];
		}
		
		for (int i = 1; i < numComponents.length; i++) {
			int numComponentsRow = 0;
			for (int j = 0; j < numComponents[i].length; j++) {
				numComponentsRow += numComponents[i][j];
			}
			if (numComponentsRow < leastNumComponents) {
				leastNumComponents = numComponentsRow;
				deviceWithLeastComponents = productNames[i];
			}
		}
		return deviceWithLeastComponents;
	}
	
	// Define method which prints the devices with the least and most components.
	public static void printDevicesWithLeastAndMostComponents(String deviceWithLeastComponents, String deviceWithMostComponents) {
		System.out.printf("%-32s%1s\n", "Device With Least Components: ", deviceWithLeastComponents);
		System.out.printf("%-32s%1s\n", "Device With Most Components: ", deviceWithMostComponents);
	}

}