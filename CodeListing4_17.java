package ch4java6thedition;
import java.util.Scanner;
import java.io.*;

/**
 * This example demonstrates the PrintWriter class and it's implementation
 * in writing data to a file.
 * 
 * @Craig
 */

public class CodeListing4_17 {
	// For the PrintWriter class to be used, it's method must be 
	// able to throw exceptions.
	public static void main (String [] args) throws IOException {
		// Create variables for the file name, friends names and 
		// number of friends
		String  fileName,
			friendName;
		int     numberOfFriends;

		// Create and object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for number of friends
		System.out.println("How many friends do you have?");
		numberOfFriends = input.nextInt();

		// Consume the remaining newLine character
		input.nextLine();

		// Get the name of the file to be written to
		System.out.println("Enter the name of the file:");
		fileName = input.nextLine();

		// Create an object of the PrintWriter class and use it to 
		// open the file for writing by passing the reference to 
		// the filename as an argument
		PrintWriter outputFile = new PrintWriter(fileName);

		// Use a loop to prompt user for input to the list of friends
		// and write the data to the output file
		for (int i = 1; i <= numberOfFriends; i++)
		{
			System.out.println("What is the name of friend #" + i + "?");
			friendName = input.nextLine();

			outputFile.println(friendName);
		}
		outputFile.close();
		System.out.println("The names of the friends have been "
			+ " written to the file.");
	}
}