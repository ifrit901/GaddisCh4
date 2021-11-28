package ch4java6thedition;
import java.util.Scanner;
import java.util.Random;
/**
 * This is number 18 from the programming challenges.
 * Enhance the program you wrote for programming challenge 17 so that it keeps
 * a count of the guesses the user makes. When the user correctly guesses the 
 * random number, the program should display the number of guesses.
 * 
 * @author craig
 */
public class Random_Number_Guessing_Game_Enhancement {
	public static void main (String [] args) {
		// Variables
		int     guess,
			total = 1, // Accumulator set to 1 since there is always one try
			randomNumber;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create a random object
		Random randy = new Random();

		// Create a variable with the random object between 1 - 10
		randomNumber = randy.nextInt(10) + 1;

		// Prompt the user for a guess
		System.out.println("I'm thinking of a number between 1 - 10"
			+ "\nTry to guess it! Enter a number:");
		guess = input.nextInt();

		// Loop to compare guess to random number
		while(guess != randomNumber)
		{
			if (guess > randomNumber)
			{
				System.out.println("Too high! Try again:");
				guess = input.nextInt();
				total++;
			}
			else
			{
				System.out.println("Too low! Try again:");
				guess = input.nextInt();
				total++;
			}
		}

		System.out.println("You win! It only took you " + total + " tries!\n"
			+ "Thanks for playing!");
	}	
}
