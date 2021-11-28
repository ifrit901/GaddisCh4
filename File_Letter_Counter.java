package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This is #6 from programming challenges
 * Write a program that asks the user to enter a file name, and then asks them
 * to enter a character. The program should count and display the number of 
 * times that the character appears in the file. Use Notepad or another text
 * editor to test the program. 
 * 
 * This problem is basically the last problem but modified to go through an 
 * entire file instead of just a string. I will use "friends.txt" to test it.
 * 
 * @author craig
 */
public class File_Letter_Counter {
	public static void main (String [] args) throws IOException {
		// Variables
		String   fileName,
		         stringCharacter;
		int      occurrences = 0;
		char     character;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get the name of a file from user
		System.out.println("Enter the name of a file:");
		fileName = input.nextLine();

		// Create a File object
		File file = new File(fileName);

		// Test to see if the file exists
		while (!file.exists())
		{
			System.out.println("This file doesn't exist!");
		}
		
		// Get a single character from user as a string 
		// and store it in a char variable
		System.out.println("Enter a single character:");
		stringCharacter = input.nextLine();
		character = stringCharacter.charAt(0);

		// Open the file for reading with a Scanner object
		Scanner inputFile = new Scanner(file);

		// Go through the file and see how many times the character 
		// occurs. 
		while(inputFile.hasNext())
		{
			String string = inputFile.nextLine();
			int stringLength = string.length();
			for (int i = 0; i < stringLength; i ++)
			{
				if(string.charAt(i) == character)
				{
					occurrences++;
				}
			}
		}

		// Don't forget to close the file
		inputFile.close();

		System.out.println("The character \"" + character + "\" occurs "
			+ occurrences + " times throughout the file.");
			
	}	
}
