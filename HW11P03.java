/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/27/2017
 Purpose: (HW11P03) Write a program that reads in a number of student scores
 from a file, finds the best score, and then assigns a grade to each.
*/

// Import Scanner class.
import java.util.Scanner;
// Import File class.
import java.io.File;
// Import JFileChooser.
import javax.swing.JFileChooser;
// Import FileNotFoundException class.
import java.io.FileNotFoundException;

public class HW11P03 {
	// Declare Scanner object.
	static Scanner input = null;
	// Main method.
	public static void main(String[] args) {
		// Declare JFlieChooser object.
		JFileChooser jfc = new JFileChooser();
				
		// Declare and initialize File variable to be properly in the if statement below.
		File inputFile = null;
		
		// Assign actions to carry out depending on user's actions in JFC dialog box.
		int jfcUserOption = jfc.showOpenDialog(null);
		if (jfcUserOption == JFileChooser.APPROVE_OPTION) {
			inputFile = jfc.getSelectedFile();
		}
		else if(jfcUserOption == JFileChooser.CANCEL_OPTION) {
			System.out.println("Program was cancelled.");
			System.exit(0);
		}
		else if (jfcUserOption == JFileChooser.ERROR_OPTION) {
			System.out.println("An unknown error has occured. Program terminated.");
			System.exit(1);
		}
			
		// Use try/catch to make Scanner read values from user-defined input file.
		try {
			input = new Scanner(inputFile);
		} catch (FileNotFoundException e2) {
			// If the file name doesn't exist, exit program.
			System.out.println("\nERROR: File not found. Program will now exit.");
			System.exit(1);
		}
			
		// Store first integer in file as the number of scores.
		int numScores = input.nextInt();
		
		// Create an array for all scores using a method.
		double[] scores = getScores(numScores);
		
		// Use void method to print grades.
		printGrades(numScores, scores);
	}
	
	// Define method which returns a complete array of all scores.
	public static double[] getScores(int numScores) {
		double[] scores = new double[numScores];
		int n = 0;
		while (input.hasNext()) {
			scores[n] = input.nextDouble();
			n++;
		}
		return scores;
	}
	
	// Define method which returns the best (highest) score in an array.
	public static double getBest(int numScores, double[] scores) {
		double best = 0;
		for (int i = 0; i < numScores; i++) {
			double currentScore = scores[i];	
			if (currentScore > best) {
				best = currentScore;
			}
		}
		return best;
	}
	
	// Define void method which prints a line indicating the current student's score and grade.
	public static void printGrades(int numScores, double[] scores) {
		double best = getBest(numScores, scores);
		int currentStudent = 1;
		for (int i = 0; i < numScores; i++) {
			double currentScore = scores[i];
			char grade = getGrade(currentScore, best);
			
			System.out.println("Student " + currentStudent + " score is " + currentScore + " and grade is " + grade);
			currentStudent++;
		}
	}
	
	/* Define method which returns a letter grade (in char form) depending on 
	   relationship between the best and current scores. */
	public static char getGrade(double score, double best) {
		if (score >= best - 15) {
			return 'A';
		}
		else if (score >= best - 25) {
			return 'B';
		}
		else if (score >= best - 35) {
			return 'C';
		}
		else if (score >= best - 45) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
}