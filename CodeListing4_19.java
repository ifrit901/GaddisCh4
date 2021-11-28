package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This example addresses the issue that a program can't tell how many 
 * elements of data are in a file before reading from it. The hasNext() 
 * method stops the program from throwing a No Such Element Exception
 * when it reaches the end of the data.
 * 
 * @author craig
 */
public class CodeListing4_19 {
	/* Add the throws exception clause to the main method since it 
	passes reference to a File object as an argument to the Scanner
	class's constructor.
	*/	
	public static void main (String [] args) throws IOException {
		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Get the file name from user
		System.out.println("What is the name of the file?");

		// String variable for file name
		String fileName;
		fileName = input.nextLine();

		// Create an object of the File class
		File myFile = new File("friends.txt");

		// Create a second Scanner object to pass the File object to
		Scanner inputFile = new Scanner(myFile);

		// Use a while loop to test the condition of whether there 
		// is another line in the file to read. (hasNext() method.)
		while (inputFile.hasNext())
		{
			// String variable for names
			String name = inputFile.nextLine();

			// Print the name
			System.out.println(name);
		}

		// Close the file
		inputFile.close();
	}
}
