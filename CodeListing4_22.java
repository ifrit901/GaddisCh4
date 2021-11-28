package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * This program checks to see if  a file exists. If it does, the program
 * will not let you write to the file since that would erase all the 
 * previous data in it. After the file has been determined not to exist,
 * the program opens the new file and writes data to it.
 * 
 * @author craig
 */
public class CodeListing4_22 {
	public static void main (String [] args) throws IOException {
		// Variables
		String  fileName,
			friendName;
		int     numFriends = 0;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for number of friends
		System.out.println("How many friends do you have?");
		numFriends += input.nextInt();

		// Consume the nextLine on the keyboard buffer
		input.nextLine();

		// Get the filename
		System.out.println("Enter the filename:");
		fileName = input.nextLine();

		// Make sure the file does not exist
		File file = new File(fileName);

		if (file.exists())
		{
			System.out.println("This file already exists and you may not"
				+ " overwrite it.");
			System.exit(0);
		}

		// Open the file
		PrintWriter outputFile = new PrintWriter(file);

		// Get data and write it to the file
		for(int i = 1; i <= numFriends; i++)
		{
			// Get the name of a friend
			System.out.println("What is the name of friend #" + i +"?");
			friendName = input.nextLine();

			// Write the name to the file
			outputFile.println(friendName);
		}

		// Close the file
		outputFile.close();
		System.out.println("The data has been written to the file.");
	} 	
}
