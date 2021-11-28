package ch4java6thedition;
import java.util.Scanner;
/**
 * These are the answers to checkpoint 4.13 - 4.15
 * @author craig
 */
public class CheckPoint4_13 {
	public static void main (String [] args) {
		// 4.13
		// Write a for loop that repeats 7 times asking the user to 
		// enter a number. The loop should also calculate the sum 
		// of the numbers entered.
		int total = 0,
		    number;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 7; i++)
		{
			System.out.println("Enter a number:");
			number = input.nextInt();
			total += number; 
		}
		// Display the results
		System.out.println("The total after 7 numbers is: " + total);

		System.out.println("-----------------------------");

		/* 4.14
		 In the following program segment, which variable is the 
		 loop control variable (counter variable) and which is 
		 the accumulator?
			'x' is the counter variable and 'y' is the accumulator.
		*/
		System.out.println("-----------------------------");

		/* 4.15
		 Why should you be careful when choosing a sentinel value?
		 You should use a value that is difficult or impossible to 
		 be confused with input from the other variables being used.
		 For instance, negative values.
		*/

	}	
}
