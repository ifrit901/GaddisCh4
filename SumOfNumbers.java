package ch4java6thedition;
import java.util.Scanner;
/**
 * #1 Ch 4 Programming challenge
 * 
 * @author craig
 */
public class SumOfNumbers {
	public static void  main (String [] args) {
		// Variables
		int number,
		     total = 0;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Promt the user for the correct data 
		System.out.println("Enter a number greater than zero:");
		number = input.nextInt();

		System.out.println("Now I'll add up all the numbers you wanted"
			+ " to add to this list.");

		for (int i = 0; i < number; i++)
		{
			total += i;			
		}
		System.out.println("The total addition of values is " + total);
	}	
}
