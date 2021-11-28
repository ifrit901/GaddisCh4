package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This program demonstrates the exists() method which is used to
 * prevent exception throws from trying to open a non-existent file
 * 
 * @author craig
 */
public class CodeListing4_21 {
	// Add the throws exception clause
	public static void main (String [] args) throws IOException {
		/*
		In this example the code will check for the presence of a 
		file before trying to open and read from it. If you have 
		completed the programs just previous to this one, you should have a 
		file called "numbers.txt" that has 10 doubles in it.
		*/

		double total = 0.0;   // The accumulator set to zero

		// Create an object of the File class and check to see if
		// the file it references exists. 
		File file = new File("numbers.txt");
		if (!file.exists())
		{
			System.out.println("The file you wanted does not exist.");
			System.exit(0);
		}
		
		// Open the file for reading
		Scanner inputFile = new Scanner(file);

		// Read all the values from the file and calculate their total
		while (inputFile.hasNext())
		{
			double number = inputFile.nextDouble();
			total += number;
		}

		// Close the file
		inputFile.close();

		System.out.println("The total of all the doubles is " + total);
		
	}
}
