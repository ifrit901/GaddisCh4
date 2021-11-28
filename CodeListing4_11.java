package ch4java6thedition;
import java.util.Scanner;
/**
 * This example shows a sentinel value ending a loop that is 
 * user controlled. It tallies the scores of a series of 
 * soccer games.
 * 
 * @author craig
 */
public class CodeListing4_11 {
	public static void main (String [] args) {
		// Variables 
		int points,
		    gameNumber = 1,          // This is to keep track of which game it is
		    totalPoints = 0;     // Always initialize an accumulator to 0

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Display the instructions for user
		System.out.println("Enter the number of points your team\n"
			+ "has earned for each game this season.\n"
			+ "Enter -1 when finished.\n\n");

		// Get the points for the first game
		System.out.println("Enter the points for game " + gameNumber + "\n"
			+ "or enter -1 to exit.");
		points = input.nextInt();

		// Accumulate the points until -1 is entered
		while (points != -1)
		{
			// Begin adding the points from the first game to the total
			totalPoints += points;

			// Change the game number to correspond to the current game
			gameNumber++;

			// Get the points for the next game
			System.out.println("Enter the points for game " + gameNumber + "\n"
				+ "or enter -1 to exit.");
			points = input.nextInt();
		}

		// Display the results to the user
		System.out.println("The total points over " + gameNumber +
			" games is " + totalPoints);
	}	
}
