// Import Scanner.
import java.util.Scanner;

public class CapitolGuessingGame {
	// Declare global scanner object.
	static Scanner input = new Scanner(System.in);
	
	// Main method.
	public static void main(String[] args) {
		// Use method to initialize 2D array of states and their corresponding capitols.
		final String[][] CAPITOLS = setCapitols();
		
		// Run game using method.
		runGame(CAPITOLS);
	}

	// Define method which returns 2D array of constant string values (states and their capitols).
	public static String[][] setCapitols() {
		final String[][] CAPITOLS = new String[50][2];
		
		// Initialize string values for first column (state names).
		CAPITOLS[0][0] = "Alabama";
		CAPITOLS[1][0] = "Alaska";
		CAPITOLS[2][0] = "Arizona";
		CAPITOLS[3][0] = "Arkansas";
		CAPITOLS[4][0] = "California";
		CAPITOLS[5][0] = "Colorado";
		CAPITOLS[6][0] = "Conneticut";
		CAPITOLS[7][0] = "Delaware";
		CAPITOLS[8][0] = "Florida";
		CAPITOLS[9][0] = "Georgia";
		CAPITOLS[10][0] = "Hawaii";
		CAPITOLS[11][0] = "Idaho";
		CAPITOLS[12][0] = "Illinois";
		CAPITOLS[13][0] = "Indiana";
		CAPITOLS[14][0] = "Iowa";
		CAPITOLS[15][0] = "Kansas";
		CAPITOLS[16][0] = "Kentucky";
		CAPITOLS[17][0] = "Louisiana";
		CAPITOLS[18][0] = "Maine";
		CAPITOLS[19][0] = "Maryland";
		CAPITOLS[20][0] = "Massachusetts";
		CAPITOLS[21][0] = "Michigan";
		CAPITOLS[22][0] = "Minnesota";
		CAPITOLS[23][0] = "Mississippi";
		CAPITOLS[24][0] = "Missouri";
		CAPITOLS[25][0] = "Montana";
		CAPITOLS[26][0] = "Nebraska";
		CAPITOLS[27][0] = "Nevada";
		CAPITOLS[28][0] = "New Hampshire";
		CAPITOLS[29][0] = "New Jersey";
		CAPITOLS[30][0] = "New Mexico";
		CAPITOLS[31][0] = "New York";
		CAPITOLS[32][0] = "North Carolina";
		CAPITOLS[33][0] = "North Dakota";
		CAPITOLS[34][0] = "Ohio";
		CAPITOLS[35][0] = "Oklahoma";
		CAPITOLS[36][0] = "Oregon";
		CAPITOLS[37][0] = "Pennsylvania";
		CAPITOLS[38][0] = "Rhode Island";
		CAPITOLS[39][0] = "South Carolina";
		CAPITOLS[40][0] = "South Dakota";
		CAPITOLS[41][0] = "Tennessee";
		CAPITOLS[42][0] = "Texas";
		CAPITOLS[43][0] = "Utah";
		CAPITOLS[44][0] = "Vermont";
		CAPITOLS[45][0] = "Virginia";
		CAPITOLS[46][0] = "Washington";
		CAPITOLS[47][0] = "West Virginia";
		CAPITOLS[48][0] = "Wisconsin";
		CAPITOLS[49][0] = "Wyoming";
		
		// Initialize string values for second column (state capitol names).
		CAPITOLS[0][1] = "Montgomery";
		CAPITOLS[1][1] = "Juneau";
		CAPITOLS[2][1] = "Phoenix";
		CAPITOLS[3][1] = "Little Rock";
		CAPITOLS[4][1] = "Sacramento";
		CAPITOLS[5][1] = "Denver";
		CAPITOLS[6][1] = "Hartford";
		CAPITOLS[7][1] = "Dover";
		CAPITOLS[8][1] = "Tallahassee";
		CAPITOLS[9][1] = "Atlanta";
		CAPITOLS[10][1] = "Honolulu";
		CAPITOLS[11][1] = "Boise";
		CAPITOLS[12][1] = "Springfield";
		CAPITOLS[13][1] = "Indianapolis";
		CAPITOLS[14][1] = "Des Moines";
		CAPITOLS[15][1] = "Topeka";
		CAPITOLS[16][1] = "Frankfort";
		CAPITOLS[17][1] = "Baton Rouge";
		CAPITOLS[18][1] = "Augusta";
		CAPITOLS[19][1] = "Annapolis";
		CAPITOLS[20][1] = "Boston";
		CAPITOLS[21][1] = "Lansing";
		CAPITOLS[22][1] = "Saint Paul";
		CAPITOLS[23][1] = "Jackson";
		CAPITOLS[24][1] = "Jefferson City";
		CAPITOLS[25][1] = "Helena";
		CAPITOLS[26][1] = "Lincoln";
		CAPITOLS[27][1] = "Carson City";
		CAPITOLS[28][1] = "Concord";
		CAPITOLS[29][1] = "Trenton";
		CAPITOLS[30][1] = "Santa Fe";
		CAPITOLS[31][1] = "Albany";
		CAPITOLS[32][1] = "Raleigh";
		CAPITOLS[33][1] = "Bismarck";
		CAPITOLS[34][1] = "Columbus";
		CAPITOLS[35][1] = "Oklahoma City";
		CAPITOLS[36][1] = "Salem";
		CAPITOLS[37][1] = "Harrisburg";
		CAPITOLS[38][1] = "Providence";
		CAPITOLS[39][1] = "Columbia";
		CAPITOLS[40][1] = "Pierre";
		CAPITOLS[41][1] = "Nashville";
		CAPITOLS[42][1] = "Austin";
		CAPITOLS[43][1] = "Salt Lake City";
		CAPITOLS[44][1] = "Montpelier";
		CAPITOLS[45][1] = "Richmond";
		CAPITOLS[46][1] = "Olympia";
		CAPITOLS[47][1] = "Charleston";
		CAPITOLS[48][1] = "Madison";
		CAPITOLS[49][1] = "Cheyenne";
		
		return CAPITOLS;
	}
	
	// Define method which runs the game.
	public static void runGame(String[][] CAPITOLS) {
		// Get the number of correct answers using method.
		int correctCount = getNumCorrect(CAPITOLS);
		
		// Print the number of correct answers using method.
		printNumCorrect(correctCount);
	}
	
	// Define method which returns the number of correct answers.
	public static int getNumCorrect(String[][] CAPITOLS) {
		int correctCount = 0; 
		
		for (int stateNum = 0; stateNum < CAPITOLS.length; stateNum++) {
			System.out.print("What is the capitol of " + CAPITOLS[stateNum][0] + "? ");
			String response = input.nextLine();
			
			if (response.equalsIgnoreCase(CAPITOLS[stateNum][1])) {
				correctCount++;
				System.out.println("Your answer is correct.\n");
			}
			else {
				System.out.println("The correct answer should be " + CAPITOLS[stateNum][1] + ".\n");
			}
		}
		
		return correctCount;
	}
	
	// Define method which prints the number of correct answers.
	public static void printNumCorrect(int correctCount) {
		System.out.println("The correct count is " + correctCount + ".\nThanks for playing!");
	}
}
