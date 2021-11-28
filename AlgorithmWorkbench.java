package ch4java6thedition;
import java.util.Scanner;
/**
 * This is the first four questions in the Algorithm Workbench for chapter 4.
 * I didn't realize there were 20 questions in total so I will divide them 
 * up into sections of 4 for simplicity.
 * 
 * @author craig
 */
public class AlgorithmWorkbench {
	public static void main (String [] args) {
		/*
		1. Write a while loop that lets the user enter a number. The number
		should be multiplied by 10, and the result should be stored in 
		the variable 'product'. The loop should iterate as long as
		'product' contains a value less than 100.
		*/
		// Variables
		int number,
		    product;	

		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Question 1. "
				+ "Enter a number. The number will be"
				+ "multiplied by ten.\nThis will continue "
				+ "until the product of the numbers exceeds 100.\n"
				+ "Enter a number:");
		number = input.nextInt();
		product = number * 10;

		while (product < 100)
		{
			System.out.println("Enter a number. The number will be "
				+ "multiplied by ten.\n This will continue"
				+ "until the product of the numbers exceeds 100.\n"
				+ "Enter a number:");
			product = number * 10;
		}
		// And to test that the conditional statement is no longer true..
		System.out.println(product + " is now greater than 100.\n\n");
		
		/*
		2. Write a do-while loop that asks the user to enter two numbers.
		The numbers should be added and the sum displayed. The loop should
		ask the user whether he or she wishes to perform the operation 
		again. If so, the loop should repeat; otherwise it should terminate.
		*/
		// Variables for loop
		int numeral1,
		    numeral2,
		         sum;
		String onceAgain;

		// Separate Scanner object for this question
		Scanner keyboard = new Scanner(System.in);

		do
		{
			System.out.println("Question 2.\nPlease enter two numbers.\n"
				+ "Enter the first number:");
			numeral1 = keyboard.nextInt();
			System.out.println("Enter the second number:");
			numeral2 = keyboard.nextInt();
			sum = numeral1 + numeral2;
			System.out.println("The sum of the two numbers is " + sum);
			System.out.println("Would you like to do this again?\n"
				+ "y = yes, n = no.");

			// At this point there is a newLine character in the buffer
			// so we should add a line to consume it.
			keyboard.nextLine();

			onceAgain = keyboard.nextLine();
		} while(onceAgain.equalsIgnoreCase("y"));
		System.out.println("\n\n");


		/*
		3. Write a for loop that displays the following set of numbers:
		0, 10, 20, 30, 40, 50, ......1000.
		*/
		System.out.println("Question number 3.\nHere is a loop that will"
			+ " display the numbers zero\nthrough one thousand in "
			+ "multiples of ten.");

		for (int i = 0; i <= 1000; i += 10)
		{
			System.out.println(i);
		}
		System.out.println("\n\n");


		/*
		4. Write a loop that asks the user to enter a number. The loop
		should iterate 10 times and keep a running total of the numbers
		entered. 
		*/
		// Accumulator variable
		int total = 0,
		    userInput;	

		System.out.println("Question number 4.\nEnter 10 numbers and I'll"
			+ "keep a running total of\nthem, displaying the total"
			+ " on each turn.");

		for (int i = 1; i <= 10; i++)
		{
			System.out.println("Enter #" + i);
			userInput = input.nextInt();
			total += userInput;
			System.out.println("\nSo far, the total is " + total);
		}
	}	
}
