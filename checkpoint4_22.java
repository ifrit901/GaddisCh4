package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This problem asks how to open a file without erasing the data already in
 * it and then allowing data to be appended to the file. 
 * This program will address those issues.
 * 
 * @author craig
 */
public class checkpoint4_22 {
	// Don't forget to add throws exception
	public static void main (String [] args) throws IOException {
		// Variables
		String fileName;
		
		int numFriends;

		// Create an instance of the Scanner Class
		Scanner input = new Scanner(System.in);

		// Prompt user for name of the file to be appended to.
		System.out.println("What is the name of the file you "
			+ " wish to add to?");
		fileName = input.nextLine();

		// Create an object of type File to check for the file's presence
		File file = new File(fileName);

		// Conditional statement checking for file
		if (file.exists())
		{
			// Create an instance of the FileWriter class
			FileWriter fwriter = new FileWriter(file);
			PrintWriter outputFile = new PrintWriter(fwriter);	

			// Prompt user for number of new friends
			System.out.println("How many friends do you "
				+ " want to add to the list?");
			numFriends = input.nextInt();

			// Loop for data entry of additional friends
			for (int i = 1; i <= numFriends; i++)
			{
				System.out.println("Enter the name of "
					+ " friend #" + i + ":");
				outputFile.println(input.next());
			}

			// Close the FileWriter and PrintWriter
			fwriter.close();
			outputFile.close();
			System.out.println("Thank you!");
			System.exit(0);
		}
		else
		{
			System.out.println("This file does not exist. Do you "
				+ "want to create it? (Y or N)");
			String answer = input.next();

			if (answer.equals("Y") || answer.equals("y"))
			{
				// Create an instance of the FileWriter class
				FileWriter fwriter = new FileWriter(file);
				PrintWriter outputFile = new PrintWriter(fwriter);	

				// Prompt user for number of new friends
				System.out.println("How many friends do you "
					+ " want to add to the list?");
				numFriends = input.nextInt();

				// Loop for data entry of additional friends
				for (int i = 1; i <= numFriends; i++)
				{
					System.out.println("Enter the name of "
						+ " friend #" + i + ":");
					outputFile.println(input.next());
				}
				
				// Close the FileWriter and PrintWriter
				fwriter.close();
				outputFile.close();
				
				System.out.println("Thank you!");
				System.exit(0);

			}
			else
			{
				System.out.println("Thank you!");
				System.exit(0);
			}
		}
	}	
}
