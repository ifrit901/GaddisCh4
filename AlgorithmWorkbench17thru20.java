package ch4java6thedition;
import java.io.*;
import java.util.Scanner;
/**
 * Algorithm workbench problems 17 through 20
 * 
 * @author craig
 */
public class AlgorithmWorkbench17thru20 {
	// Since we're using the io import, must add throws exception clause
	public static void main (String [] args) throws IOException {
		/*
		Write code that does the following: opens a file named 'Numbers.txt,
		uses a loop to write the numbers 1 - 100 to the file and then 
		closes the file. 
		*/
		// First we need to go to the top of this file and add the 
		// io import.

		// Make a variable for the file name
		String fileName = "Numbers.txt";
		
		// Create an object of the PrintWriter class
		PrintWriter pw = new PrintWriter(fileName);

		// Create a loop to add the numbers to the file
		for (int i = 1; i <= 100; i++)
		{
			pw.println(i);
		}

		// Close the file
		pw.close();

		// Some output so the user knows something happened
		System.out.println("The data has been datafied");

		/*
		This program was not writing to the file and I couldn't figure out
		why, turns out I forgot to pw.close(); the file at the end. I suppose 
		all the data was stuck in a buffer somewhere not getting flushed
		or something.
		*/
		System.out.println("\n\n");


		/*
		18. Write code that does the following: Opens the 'Numbers.txt' 
		file that was created by the code in Question 17, reads all the 
		numbers in the file and displays them, and then closes the file.
		*/
		// Create an object of the File class
		File file = new File("Numbers.txt");

		// Add the util.Scanner import to the top 
		// Create a Scanner object
		Scanner inputFile = new Scanner(file);

		// Create a loop to print the numbers from the file
		while(inputFile.hasNextInt())
		{
			System.out.println(inputFile.nextInt());
		}

		// Close the file
		inputFile.close();
		System.out.println("\n\n");


		/*
		19. Modify the code you wrote in Question 18 so it adds all the 
		numbers read from the file and displays the total.
		*/
		// Create an accumulator variable initialized to zero
		int total = 0;

		// Make a different File object since this is the only way I can
		// figure out how to re-open a file I just closed.
		File file2 = new File("Numbers.txt");

		// New Scanner object since I guess I need one of those too.
		// (for the new File object)
		Scanner inputFile2 = new Scanner(file2);

		// Loop through file adding the numbers to the accumulator
		while(inputFile2.hasNextInt())
		{
			total += (inputFile2.nextInt());			
		}

		// Display the total
		System.out.println("The total is " + total);

		// Close the re-opened file
		inputFile2.close();
		System.out.println("\n\n");


		/*
		20. Write code that opens the 'Numbers.txt' file for writing but
		does not erase the contents already in it.
		*/

		// Create FileWriter object. Dont forget to add the boolean value
		// To the parameter list. (true)
		FileWriter fw = new FileWriter("Numbers.txt", true);

		// To test the code to see if it can write without erasing, 
		// make a new PrintWriter object.
		PrintWriter pw2 = new PrintWriter(fw);

		// Append a new integer to the end of the file
		pw2.println(101);

		// Close the file so it will actually write
		pw2.close();
	
		/*
		At this point you can go to the 'Numbers.txt' file to check if 
		the number 101 got added to the end of the file. 
		*/
	}	
}
