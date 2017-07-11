/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 04/27/2017
 Purpose: (HW11P02) Write a program that randomly generates a sentence using five
 different arrays of strings.
*/

public class HW11P02 {
	// Main method.
	public static void main(String[] args) {
		// Declare & initialize five arrays for each of the different word types.
		String[] nouns = {"dog", "cat", "salad", "world", "information", "map", "family", 
				"government", "health", "system", "computer", "meat", "year", "music", "person", 
				"food", "bird", "power", "ability", "love", "internet", "television", "idea", 
				"temperature", "story", "oven", "movie", "event", "newspaper", "city"};
		
		String[] adjectives = {"good", "new", "first", "last", "long", "little", "old", "big",
				"next", "young", "clean", "plain", "clever", "powerful", "nice", "silly", "angry", 
				"uptight", "fierce", "mysterious", "abundant", "weak", "modern", "damaged", "cold", 
				"dangerous", "foolish", "innocent", "joyful", "poor"};
		
		String[] verbs = {"attacks", "adopts", "buys", "chases", "cooks", "explores", "draws", "feels", 
				"helps", "handles", "hugs", "transforms", "imagines", "inspects", "jumps", "kicks", "loses", 
				"functions", "breaks", "orders", "operates", "packs", "lives", "performs", "releases", 
				"removes", "rides", "lies", "threatens", "walks"};
		
		String[] prepositions = {"with", "at", "on", "into", "during", "including", "until", 
				"against", "among", "throughout", "despite", "towards", "upon", "under", 
				"about", "for", "like", "of", "to", "in"};
		
		String[] articles = {"the", "a"};
		
		// Use void method to print seven randomly-generated sentences.
		printSentences(nouns, adjectives, verbs, prepositions, articles);
	}

	// Define void method which prints seven randomly-generated sentences.
	public static void printSentences(String[] nouns, String[] adjectives, 
	String[] verbs, String[] prepositions, String[] articles) {
		for (int i = 1; i <= 7; i++) {
			// Use method to generate sentence & store in string variable.
			String sentence = generateSentence(nouns, adjectives, verbs, prepositions, articles);
			// Print single sentence.
			System.out.println(sentence);
		}
	}
	
	// Define method which returns a random sentence using the arrays stored.
	public static String generateSentence(String[] nouns, String[] adjectives, 
	String[] verbs, String[] prepositions, String[] articles) {
	
		// Declare & initialize strings for each word in final sentence.
		// Use random index values to choose random words.
		String article1 = articles[(int)(Math.random() * 2)];
		String adjective1 = adjectives[(int)(Math.random() * 30)];
		String noun1 = nouns[(int)(Math.random() * 30)];
		String verb = verbs[(int)(Math.random() * 30)];
		String preposition = prepositions[(int)(Math.random() * 20)];
		String article2 = articles[(int)(Math.random() * 2)];
		String adjective2 = adjectives[(int)(Math.random() * 30)];
		String noun2 = nouns[(int)(Math.random() * 30)];
		
		// Capitalize first letter of sentence.
		article1 = Character.toUpperCase(article1.charAt(0)) + article1.substring(1);
		
		// Concatenate sentence and store in string variable.
		String sentence = article1 + " " + adjective1 + " " + noun1 + " " + verb 
				+ " " + preposition + " " + article2 + " " + adjective2 + " " + noun2
				+ ".";
		
		return sentence;
	}
}
