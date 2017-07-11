/*
 Author: Javier Garcia
 Class: CS 2011
 Section: 05
 Professor: Keenan Knaur
 Date: 02/23/2017
 Purpose: (HW05P02) Write a program that computes the area between
 the four cities of: Atlanta, Georgia; Charlotte, North Carolina;
 Savannah, Georgia; and Orlando, Florida.
*/

public class HW05P02 {
	public static void main(String[] args) {		

		// Declare the radius of Earth as a constant value.
		final double RADIUS_OF_EARTH = 6371.01;
		
		/* Declare the latitude and longitude values of the 
		four locations as constant values. */
		final double ATLANTA_LATITUDE = 33.7489954;
		final double ATLANTA_LONGITUDE = -84.3879824;
		
		final double CHARLOTTE_LATITUDE = 35.2270869;
		final double CHARLOTTE_LONGITUDE = -80.8431267;
		
		final double SAVANNAH_LATITUDE = 32.0835407;
		final double SAVANNAH_LONGITUDE = -81.0998342;
		
		final double ORLANDO_LATITUDE = 28.5383355;
		final double ORLANDO_LONGITUDE = -81.3792365;
		
		/* Convert longitude and latitude constant values to radians to
		be used in distance formula, then save in variables. */
		double xAtlanta = Math.toRadians(ATLANTA_LATITUDE);
		double yAtlanta = Math.toRadians(ATLANTA_LONGITUDE);
		
		double xCharlotte = Math.toRadians(CHARLOTTE_LATITUDE);
		double yCharlotte = Math.toRadians(CHARLOTTE_LONGITUDE);
		
		double xSavannah = Math.toRadians(SAVANNAH_LATITUDE);
		double ySavannah = Math.toRadians(SAVANNAH_LONGITUDE);
		
		double xOrlando = Math.toRadians(ORLANDO_LATITUDE);
		double yOrlando = Math.toRadians(ORLANDO_LONGITUDE);
		
		
		// Declare five variables meant to calculate the distances between cities.
		double atlantaToCharlotte = RADIUS_OF_EARTH * Math.acos(Math.sin(xCharlotte) * Math.sin(xAtlanta) + Math.cos(xCharlotte) * Math.cos(xAtlanta) * Math.cos(yAtlanta - yCharlotte));
		double charlotteToSavannah = RADIUS_OF_EARTH * Math.acos(Math.sin(xCharlotte) * Math.sin(xSavannah) + Math.cos(xCharlotte) * Math.cos(xSavannah) * Math.cos(ySavannah - yCharlotte));
		double savannahToOrlando = RADIUS_OF_EARTH * Math.acos(Math.sin(xSavannah) * Math.sin(xOrlando) + Math.cos(xSavannah) * Math.cos(xOrlando) * Math.cos(yOrlando - ySavannah));
		double orlandoToAtlanta = RADIUS_OF_EARTH * Math.acos(Math.sin(xOrlando) * Math.sin(xAtlanta) + Math.cos(xOrlando) * Math.cos(xAtlanta) * Math.cos(yAtlanta - yOrlando));
		double atlantaToSavannah = RADIUS_OF_EARTH * Math.acos(Math.sin(xAtlanta) * Math.sin(xSavannah) + Math.cos(xAtlanta) * Math.cos(xSavannah) * Math.cos(ySavannah - yAtlanta));
				
		// Calculate the variable S (from the triangle area equation) for both triangles within the four-sided polygon.
		double s1 = (atlantaToCharlotte + charlotteToSavannah + atlantaToSavannah) / 2;
		double s2 = (atlantaToSavannah + orlandoToAtlanta + savannahToOrlando) / 2;
		
		// Calculate the area of both triangles within the four-sided polygon.
		double area1 = Math.sqrt(s1 * (s1 - atlantaToCharlotte) * (s1 - charlotteToSavannah) * (s1 - atlantaToSavannah));
		double area2 = Math.sqrt(s2 * (s2 - atlantaToSavannah) * (s2 - orlandoToAtlanta) * (s2 - savannahToOrlando));
		
		// Add the area for both triangles within the four-sided polygon to compute the total area.
		double totalArea = area1 + area2;
		// Round the output to four decimal places.
		double output = Math.round(totalArea * 10000) / 10000.0;
		
		// Print results.
		System.out.println("The area of the four cities is " + output + " kms squared.");
	}
}