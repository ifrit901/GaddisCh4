package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This is a modification of the Distance Traveled #2 programming 
 * challenge.
 * 
 * @author craig
 */
public class Distance_File {
	// This method now uses file operations and should include a 
	// throws IOException clause
	public static void main (String [] args) throws IOException {
		// Variables
		int      time,
		        speed;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt the user for velocity
		System.out.println("How fast (in MPH) was the vehicle traveling?");
      		speed = input.nextInt();

		// Validate the velocity
		while(speed < 0)
		{
			System.out.println("You cannot have a negative velocity, "
				+ "please enter a positive value:");
			speed = input.nextInt();
		}
		
			// Prompt user for time traveled
			System.out.println("How long did it travel for?");
			time = input.nextInt();

			// Validate the time
			while(time < 1)
			{
				System.out.println("The time in hours has to be "
					+ "one or greater, please enter a number\n"
					+ "greater than zero:");
				time = input.nextInt();
			}

		// We are creating a new file called Distance_File so we need a 
		// PrintWriter object.
		PrintWriter pw = new PrintWriter("Distance_File.txt");

		// Write everything to the file
		pw.println("Hours\t\tDistance");
		pw.println("---------------------------");

		// Loop for calculations display
		for (int i = 1; i <= time; i++)
		{
			pw.println(i + "\t\t\t" + speed * i);
		}
		// When finished running, check to see if the file was created
		// and written to properly. Also, don't forget to close the file
		// like I just did or you will create a blank file.
		pw.close();
	}
}
