package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * This is #14 of the programming challenges.
 * Write a program that asks the user for the name of a file. The program 
 * should display the contents of the file with each line preceeded by 
 * a line number and a colon. The line numbering should start at 1. 
 * 
 * @author craig
 */
public class Line_Numbers {
	public static void main (String [] args) throws IOException {
		// Variables 
		String fileName;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for file name
		System.out.println("Enter the name of a file:");
		fileName = input.nextLine();

		// Create a File object and pass it the file name
		File file = new File(fileName);

		// Create a Scanner to read and print to the file
		Scanner inputFile = new Scanner(file);

		// Loop through the file adding line numbers to the output
		for (int i = 1; inputFile.hasNext(); i++)
		{
			System.out.println(i + ": " + inputFile.nextLine());
		}

		// Close the file
		inputFile.close();
	}	
}
