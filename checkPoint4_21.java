package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * Open a text file and read/print the first element in the file.
 * @author craig
 */
public class checkPoint4_21 {
	// Remember to add the 'throws exception' clause due to the Scanner
	// class opening a file in this method
	public static void main (String [] args) throws IOException {
		// Variable 
		String fileName;

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Get filename of text from user
		System.out.println("What is the name of the file you'd like to open?");
		fileName = input.nextLine();

		// Create an object of class File
		File file = new File(fileName);

		// Create another Scanner object to read from the file
		Scanner readFile = new Scanner(file);

		System.out.println(readFile.nextLine());

	}	
}
