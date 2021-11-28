package ch4java6thedition;
import java.util.Scanner;
/**
 * This is #10 from the programming challenges
 * Write a program with a loop that lets the user enter a series of integers.
 * The user should enter -99 to signal the end of the series. After all the 
 * numbers have been entered, the program should display the largest and 
 * smallest numbers entered.
 * 
 * @author craig
 */
public class Largest_and_Smallest {
	public static void main (String [] args) {
		// Variables
		int    userInput = 0,
			 biggest = 0,
			smallest = 0,
			sentinel = -99;
			
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for a starting number
		System.out.println("Please enter a starting number:");
		userInput = input.nextInt();

		smallest = userInput;
		biggest = userInput;

		// Loop for user input and value comparisons
		while(userInput != sentinel)
		{
			if (userInput > biggest)
			{
				biggest = userInput;
			}
			else if (userInput < biggest)	
			{
				smallest = userInput;
			}
			
			// Prompt user for decision
			System.out.println("Enter your next number or..");
			System.out.println("If you want to quit, enter -99");
			userInput = input.nextInt();
		}

		// Display results
		System.out.println("The biggest number you entered was " + biggest);
		System.out.println("The smallest number you entered was " + smallest);
		System.out.println("Thank you for participating!");
	}	
}
