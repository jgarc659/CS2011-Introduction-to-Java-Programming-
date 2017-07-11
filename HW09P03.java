/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/13/2017
 Purpose: (HW09P03) Write a program that takes the grades from
 ten quizzes, then computes the average score after dropping the
 two lowest scores.
*/

// Import Scanner
import java.util.Scanner;

public class HW09P03 {
	// Main method.
	public static void main(String[] args) {
		// Declare Scanner object.
		Scanner input = new Scanner(System.in);
		
		// Declare and initialize ten double values each meant to store an individual score from operations below.
		double score1 = 0;
		double score2 = 0;
		double score3 = 0;
		double score4 = 0;
		double score5 = 0;
		double score6 = 0;
		double score7 = 0;
		double score8 = 0;
		double score9 = 0;
		double score10 = 0;
		
		// Use for loop to store each of the ten quiz scores in separate variables.
		// Could this be simplified with arrays?
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				score1 = readQuizScore(i, input);
				continue;
			}
			else if (i == 2) {
				score2 = readQuizScore(i, input);
				continue;
			}
			else if (i == 3) {
				score3 = readQuizScore(i, input);
				continue;
			}
			else if (i == 4) {
				score4 = readQuizScore(i, input);
				continue;
			}
			else if (i == 5) {
				score5 = readQuizScore(i, input);
				continue;
			}
			else if (i == 6) {
				score6 = readQuizScore(i, input);
				continue;
			}
			else if (i == 7) {
				score7 = readQuizScore(i, input);
				continue;
			}
			else if (i == 8) {
				score8 = readQuizScore(i, input);
				continue;
			}
			else if (i == 9) {
				score9 = readQuizScore(i, input);
				continue;
			}
			else if (i == 10) {
				score10 = readQuizScore(i, input);
			}
		}
		
		// Empty line (for aesthetic purposes).
		System.out.println();
		
		// Use methods to compute the lowest score, second lowest score, and the average.
		// Use only scores as parameters, as indicated.
		double lowestScore = getLowestScore(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
		double secondLowestScore = getSecondLowestScore(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
		double average = computeAverage(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
		
		// Print results.
		// Format so scores are rounded to two decimal places.
		System.out.printf("%1s%1.2f%1s%1.2f\n", "Two Lowest Scores: ", lowestScore, " and ", secondLowestScore);
		System.out.printf("%1s%1.2f", "Average: ", average);
	}
	
	// Define method which asks for a score (the first time), reads the score and validates it.
	public static double readQuizScore(int i, Scanner input) {
		if (i == 1) {
			System.out.print("Enter the ten scores: ");
		}
		double score = input.nextDouble();
		// Input Validation: If score is out of range, keep prompting the user for correct value.
		if (score < 0 || score > 100) {
			while (score < 0 || score > 100) {
				System.out.print("ERROR: Please enter a value on [0, 100]: ");
				score = input.nextDouble();
			}
			return score;
		}
		else {
			return score;
		}
	}
	
	// Define method which computes the lowest score.
	public static double getLowestScore(double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8, double score9, double score10) {
		// Declare and initialize double variable meant to store the lowest score.
		double lowestScore = score1;
		
		// Go through each score individually to find the lowest value.
		// Could this also be simplified with arrays?
		if (score2 < lowestScore) {
			lowestScore = score2;
		}
		if (score3 < lowestScore) {
			lowestScore = score3;
		}
		if (score4 < lowestScore) {
			lowestScore = score4;
		}
		if (score5 < lowestScore) {
			lowestScore = score5;
		}
		if (score6 < lowestScore) {
			lowestScore = score6;
		}
		if (score7 < lowestScore) {
			lowestScore = score7;
		}
		if (score8 < lowestScore) {
			lowestScore = score8;
		}
		if (score9 < lowestScore) {
			lowestScore = score9;
		}
		if (score10 < lowestScore) {
			lowestScore = score10;
		}
		return lowestScore;
	}

	
	// Define method which computes the second lowest score.
	public static double getSecondLowestScore(double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8, double score9, double score10) {
		// Declare and initialize two double variables for use in the operation below.
		double lowestScore = score1;
		
		// Note that the beginning segment of this operation is identical to code from the getLowestScore method.
		// This time, however, we're building upon our previous computations in order to find the second lowest score.
		if (score2 < lowestScore) {
			lowestScore = score2;
		}
		if (score3 < lowestScore) {
			lowestScore = score3;
		}
		if (score4 < lowestScore) {
			lowestScore = score4;
		}
		if (score5 < lowestScore) {
			lowestScore = score5;
		}
		if (score6 < lowestScore) {
			lowestScore = score6;
		}
		if (score7 < lowestScore) {
			lowestScore = score7;
		}
		if (score8 < lowestScore) {
			lowestScore = score8;
		}
		if (score9 < lowestScore) {
			lowestScore = score9;
		}
		if (score10 < lowestScore) {
			lowestScore = score10;
		}
		
		double secondLowestScore = 101;
		
		if (score1 > lowestScore && score1 < secondLowestScore) {
			secondLowestScore = score1;
		}
		if (score2 > lowestScore && score2 < secondLowestScore) {
			secondLowestScore = score2;
		}
		if (score3 > lowestScore && score3 < secondLowestScore) {
			secondLowestScore = score3;
		}
		if (score4 > lowestScore && score4 < secondLowestScore) {
			secondLowestScore = score4;
		}
		if (score5 > lowestScore && score5 < secondLowestScore) {
			secondLowestScore = score5;
		}
		if (score6 > lowestScore && score6 < secondLowestScore) {
			secondLowestScore = score6;
		}
		if (score7 > lowestScore && score7 < secondLowestScore) {
			secondLowestScore = score7;
		}
		if (score8 > lowestScore && score8 < secondLowestScore) {
			secondLowestScore = score8;
		}
		if (score9 > lowestScore && score9 < secondLowestScore) {
			secondLowestScore = score9;
		}
		if (score10 > lowestScore && score10 < secondLowestScore) {
			secondLowestScore = score10;
		}
	
		return secondLowestScore;
	}
	
	// Define method which computes average (after eliminating two scores).
	public static double computeAverage(double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8, double score9, double score10) {
		// The two lowest scores are computed yet again because our parameters are limited only to the individual scores.
		double lowestScore = score1;
		
		if (score2 < lowestScore) {
			lowestScore = score2;
		}
		if (score3 < lowestScore) {
			lowestScore = score3;
		}
		if (score4 < lowestScore) {
			lowestScore = score4;
		}
		if (score5 < lowestScore) {
			lowestScore = score5;
		}
		if (score6 < lowestScore) {
			lowestScore = score6;
		}
		if (score7 < lowestScore) {
			lowestScore = score7;
		}
		if (score8 < lowestScore) {
			lowestScore = score8;
		}
		if (score9 < lowestScore) {
			lowestScore = score9;
		}
		if (score10 < lowestScore) {
			lowestScore = score10;
		}
		
		double secondLowestScore = 101;
		
		if (score1 > lowestScore && score1 < secondLowestScore) {
			secondLowestScore = score1;
		}
		if (score2 > lowestScore && score2 < secondLowestScore) {
			secondLowestScore = score2;
		}
		if (score3 > lowestScore && score3 < secondLowestScore) {
			secondLowestScore = score3;
		}
		if (score4 > lowestScore && score4 < secondLowestScore) {
			secondLowestScore = score4;
		}
		if (score5 > lowestScore && score5 < secondLowestScore) {
			secondLowestScore = score5;
		}
		if (score6 > lowestScore && score6 < secondLowestScore) {
			secondLowestScore = score6;
		}
		if (score7 > lowestScore && score7 < secondLowestScore) {
			secondLowestScore = score7;
		}
		if (score8 > lowestScore && score8 < secondLowestScore) {
			secondLowestScore = score8;
		}
		if (score9 > lowestScore && score9 < secondLowestScore) {
			secondLowestScore = score9;
		}
		if (score10 > lowestScore && score10 < secondLowestScore) {
			secondLowestScore = score10;
		}
		
		// Compute sum of all scores.
		double sum = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
		// Remove two lowest scores from sum and compute average.
		double average =  (sum - lowestScore - secondLowestScore) / 8.0;
		return average;
	}
}