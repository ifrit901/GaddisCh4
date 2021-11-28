package ch4java6thedition;
import java.util.Scanner;
/**
 * This is programming challenge #5. Write a program that asks the user to 
 * enter a string, and then asks the user to enter a character. The program
 * should count and display the number of times that the specified character
 * appears in the string.
 * 
 * @author craig
 */
public class Letter_Counter {
	public static void main (String [] args) {
		// Variables 
		String  string,
			string2;
		char character;
		int stringLength,
			total = 0;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Please enter a string:");
		string = input.nextLine();

		// Get the length of the string
		stringLength = string.length();

		// Get a one character string and store it in a char variable
		System.out.println("Please enter a single character:");
		string2 = input.nextLine();
		character = string2.charAt(0);

		// Loop through the string comparing its elements to the character
		// and use the length of the string as the number of iterations.
		for (int i = 0; i < stringLength; i++)
		{
			if(string.charAt(i) == character)
			{
				total++;
			}
		}
		System.out.println(character + " occurs " + total + " times in " + string);
	}	
}
