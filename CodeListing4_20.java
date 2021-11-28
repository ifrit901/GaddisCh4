package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This program demonstrates reading from a file that has 
 * data in the form of floating point numbers 
 * 
 * @author craig
 */
public class CodeListing4_20 {
	// Include the throws exception clause 
	public static void main (String [] args) throws IOException {
		/*
		Since I do not have a pre-existing file with double 
		numbers to read from, I'll attempt to make the first
		part of the program create one.
		*/
		// Create an object of the PrintWriter class
		PrintWriter myFile = new PrintWriter("numbers.txt");
		// I believe this action creates the "numbers.txt" file, not sure

		// Create an object of the Scanner class for user input
		Scanner input = new Scanner(System.in);

		// Use for loop to enter 10 doubles from user and add them to 
		// "numbers.txt".
		for (int i = 1; i <= 10; i++)
		{
			// Variable to hold user input
			double number;

			// Get user defined data
			System.out.println("Enter floating-point decimal #" + i);
			number = input.nextDouble();

			// Add entry to "numbers.txt"
			myFile.println(number);
		}

		// Close the file
		myFile.close();

		// I think this creates a file of doubles but when I look at the 
		// file it's blank (no text). Not sure what that means, but Ima
		// try to read from it anyway
		/*
		Edit: The reason "numbers.txt" was empty was because I had 
		initially forgotten to close the file. myFile.close(); was 
		added at line 41 and now it works fine.
		*/
		File file = new File("numbers.txt");
		Scanner inputFile = new Scanner(file);

		// Loop through the file, read and print the numbers
		while (inputFile.hasNext())
		{
			// Create variable to hold double
			double number = inputFile.nextDouble();

			// Print the number
			System.out.println(number);
		}
	}
}
