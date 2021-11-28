package ch4java6thedition;
import java.util.Scanner;
/**
 * This is number 20 in the programming challenges.
 * Write a program that asks the user for a positive integer no greater than 15.
 * The program should then display a square on the screen using the character 'X'.
 * The number entered by the user will be the length of each side of the square. 
 * For example, if the user enters 5, the program should display the following:
 * 
 * XXXXX
 * XXXXX
 * XXXXX
 * XXXXX
 * XXXXX
 * XXXXX
 * 
 * If the user enters 8, it should display this:
 * 
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * XXXXXXXX
 * 
 * and so on.
 * 
 * @author craig
 */
public class Square_Display {
	public static void main (String [] args) {
		// Variable
		int userInput;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for input
		System.out.println("Enter a number between 1 - 15 and I'll display "
			+ "a square with those dimensions.\nEnter your choice:");
		userInput = input.nextInt();

		// Validate user input
		while(userInput < 1 || userInput > 15)
		{
			System.out.println("Please enter a number between 1 - 15:");
			userInput = input.nextInt();
		}

		// Loop to display square
		for (int r = 1; r <= userInput; r++)
		{
			for (int c = 1; c <= userInput; c++)
			{
				System.out.print("X");
			}
			System.out.println();
		}
	}	
}
