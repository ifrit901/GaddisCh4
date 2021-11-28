package ch4java6thedition;
import java.util.Scanner;
import java.io.*;

/**
 * This example appends data to a pre-existing file.
 * 
 * @Craig
 */
public class CodeListing4_17append {            
	// Methods using Print or FileWriter must include a throws exception
	// clause if the code does not address exceptions specifically
	public static void main (String [] args) throws IOException { 
		// Create an object of the FileWriter class
		FileWriter fwriter = new FileWriter("friends.txt", true);
		PrintWriter outputFile = new PrintWriter(fwriter);

		outputFile.println("Michelle");
		outputFile.println("Jason");

		// Get another name from the keyboard 
		Scanner input = new Scanner(System.in);
		String name;

		System.out.println("Add one more name to the list:");
		name = input.nextLine();

		// Write the data to the file
		outputFile.println(name);
		
		// Close the file
		outputFile.close();
	}
}
