package ch4java6thedition;
import java.util.Scanner;
import java.io.*;

/**
 * This program demonstrates how to read data from a pre-existing file
 * 
 * @Craig
 */
	
public class CodeListing4_18 {
	// This method passes a File object reference to 
	// a Scanner class constructor and therefore must 
	// include either a throws exception clause or deal with exceptions
	// in the code
	public static void main (String [] args) throws IOException {
		// Create an object of the File class and pass the name
		// of a file to it as an argument
		File myFile = new File("friends.txt");

		// Create an object of the Scanner class to read from file
		Scanner inputFile = new Scanner(myFile);

		// Since I already know there are 9 names in the file,
		// I'll try to use a loop to read and print the names
		for (int i = 0; i < 9; i++)
		{
			String name = inputFile.nextLine();
			System.out.println(name);
		}
		/*
		I also ran the loop with 10 loops instead of 9. It printed all
		9 of the names and then threw an exception:
		java.util.NoSuchElementException: No line found	
		It tried to read beyond the 9th element. The next example
		will address this issue with the hasNext method.
		*/

		// Close the file
		inputFile.close();

	}
}
