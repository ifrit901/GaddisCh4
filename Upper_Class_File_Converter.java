package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * This is number 15 in the programming challenges.
 * Write a program that asks the user for the names of two files. The first file
 * should be opened for reading and the second should be opened for writing. 
 * The program should read the contents of the first file, change all the 
 * characters to uppercase, and store the results in the second file. The 
 * second file will be a copy of the first file, except that all the characters
 * will be uppercase. Use Notepad or something similar to test the program. 
 * I'll be using a file called 'friends.txt', which is a simple list of names.
 * 
 * @author craig
 */
public class Upper_Class_File_Converter {
	public static void main (String [] args) throws IOException {
		// Variables
		String fileName;

		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);

		// Prompt user for file name
		System.out.println("Enter the name of a file:");
		fileName = input.nextLine();

		// Create a File object and pass it the file name
		File file = new File(fileName);

		// Create a Scanner to read from file and pass it the File object
		Scanner inputFile = new Scanner(file);

		// Create a PrintWriter object
		PrintWriter pw = new PrintWriter("friendsUppercase.txt");

		// Loop through the file, reading the lines, converting them to
		// uppercase and then storing the results in the new file
		for(;inputFile.hasNext();)
		{
			// Read a line from the first file, storing it in a String
			String line = inputFile.nextLine();
			
			// Convert the line to UpperCase and store it in a new String
			String bigLine = line.toUpperCase();

			// Write the converted line to the new file
			pw.println(bigLine);
		}

		// Close both the files
		pw.close();
		inputFile.close();
	}	
}
