package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * This is number 13 in the programming challenges.
 * Write a program that asks the user for the name of a file. The program 
 * should display only the first five lines of the file's contents. If the 
 * file contains fewer than five lines, it should display the entire file's
 * contents. 
 * 
 * @author craig
 */
public class File_Head_Display {
	// This will use the File and Scanner classes so it needs to be able to 
	// throw IO exceptions
	public static void main (String [] args) throws IOException {
		// Variables
		String fileName;

		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Enter a file name:");
		fileName = input.nextLine();

		// Create a File object and pass it the file name
		File file = new File(fileName);

		// Create a Scanner object to read from the file
		Scanner inputFile = new Scanner(file);

		// Loop through the file to print the first five lines or less
		for (int i = 0; i < 5; i++)
		{
			System.out.println(inputFile.nextLine());
		}

		// Close the file
		inputFile.close();
	}
}
