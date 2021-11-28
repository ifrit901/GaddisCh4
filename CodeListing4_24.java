package ch4java6thedition;
import java.util.Random;
import java.util.Scanner;
/**
 * This is the example from "In the Spotlight"
 * Dr. Kimura wants a dice rolling program for his statistics class
 * that continues to roll dice until the user wants to quit.
 * 
 * @author craig
 */
public class CodeListing4_24 {
	public static void main (String [] args) {
		// Variable for dice rolls
		int die1,
		    die2;

		String answer = "y";   // To control the loop 

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Create an object of the Random class
		Random randNum = new Random();

		// Greet the user and explain whats going on
		System.out.println("Hello! I'm going to roll some dice for you...\n\n");
		// Simulate the rolling of the dice
		while (answer.equalsIgnoreCase("y"))	
		{
			die1 = randNum.nextInt(6) + 1;
			die2 = randNum.nextInt(6) + 1;
			System.out.println("...After bouncing around a bit the dice "
				+ " landed on\n" + die1 + " and " + die2);

			// Prompt user for more rolls
			System.out.println("Wanna roll some more?\nEnter \"y\" or \"n\".");
			answer = input.next();
		}

		System.out.println("Thanks, bye!");
	}
}
