package ch4java6thedition;
import java.util.Scanner;
import java.util.Random;
/**
 * Demonstrations of methods from the Random class.
 * 
 * @author craig
 */
public class CodeListing4_23 {
	public static void main (String [] args) {
		// Variables for ints and user input
		int num1,
		    num2,
		    sum,
		    userAnswer;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Create an object of the Random class
		Random randomNum = new Random();

		// Assign two random numbers 0 - 99 into the two number variables
		num1 = randomNum.nextInt(100);
		num2 = randomNum.nextInt(100);

		// Display an addition problem using the randomly generated numbers
		System.out.println("Calculate the sum of " + num1 + " + " + num2);
		System.out.println("Enter your answer:");

		// Calculate the actual answer
		sum = num1 + num2;

		// Assign the user's answer to userAnswer
		userAnswer = input.nextInt();

		// Display the results
		if (userAnswer == sum)
		{
			System.out.println(userAnswer + " is correct!");
		}
		else
		{
			System.out.println(userAnswer + " is " + (userAnswer - sum) +
				" off from the actual answer which is: " + sum);
		}
	}	
}
