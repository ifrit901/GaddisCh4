package ch4java6thedition;
import java.util.Random;
import java.util.Scanner;
/**
 * This is number 17 from the programming challenges.
 * Write a program that generates a random number and asks the user to guess
 * what the number is. If the user's guess is higher than the number, the 
 * program should display, "Too high, try again!". If the user's guess is 
 * too low, the program should display, "Too low, try again!". The program 
 * should use a loop that repeats until the user guesses correctly. 
 * 
 * @author craig
 */
public class Random_Number_Guessing_Game {
	public static void main (String [] args) {
		// Variables
		int guess = -1, // Initialize to a number outside the range of 
			        // where the random number will be. This is to 
			        // make sure the guess is not accidentally correct
			        // on the first try. 
		    randNumber;

		// Create a Scanner object 
		Scanner input = new Scanner(System.in);

		// Create a Random object
		Random randy = new Random();

		// Use the object to create a random integer
		randNumber = randy.nextInt(10) + 1;

		// Explain to the user what's going on
		System.out.println("I'm thinking of a number, if you guess what it is,"
			+ " you win!");

		// Prompt user for guess
		System.out.println("Guess a number 1 - 10");
		guess = input.nextInt();

		// Loop through the guesses
		while(guess != randNumber)
		{
			// Compare it to the random number and display results
			if (guess > randNumber)
			{
				System.out.println("Too high! Try again:");
				guess = input.nextInt();
			}
			else
			{
				System.out.println("Too low! Try again:");
				guess = input.nextInt();
			}
		}

			System.out.println("You win!!");
			System.out.println("Thanks for playing!");
	}	
}
