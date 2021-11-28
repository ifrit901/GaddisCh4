package ch4java6thedition;
import java.util.Scanner;
/**
 * This is number 7 in the programming challenges.
 * A hotel's occupancy rate is calculated as follows:
 * 
 * Occupancy rate = Number of rooms occupied / Total number of rooms
 * 
 * Write a program that calculates the occupancy rate for each floor of a hotel. 
 * The program should start by asking for the number of floors in the hotel. A
 * loop should then iterate once for each floor. During each iteration, the loop 
 * should ask the user for the number of rooms on the floor and the number of 
 * rooms that are occupied. After all the iterations, the program should display 
 * the number of rooms the hotel has, the number of them that are occupied, the
 * number of them that are vacant, and the occupancy rate for the hotel. 
 * 
 * @author craig
 */
public class Hotel_Occupancy {
	public static void main (String [] args) {
		// Variables
		int    numberOfRooms,
		              floors,
			    occupied,
			      vacant,
		       	   roomTotal = 0,
			 vacantTotal = 0;
		double occupiedTotal = 0,   // This is to prevent integer division
			occupancyRate;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Get number of floors from the user
		System.out.println("How many floors are in the hotel?");
		floors = input.nextInt();

		// Validate input
		while (floors < 1)
		{
			System.out.println("Please enter a number greater than zero:");
			floors = input.nextInt();
		}

		// Create loop to extract info from floors
		for (int i = 1; i <= floors; i++)
		{
			// Prompt user for floor info
			System.out.println("How many rooms are on floor number " 
				+ i + "?");
			numberOfRooms = input.nextInt();

			// Validate room number
			while (numberOfRooms < 10)
			{
				System.out.println("There has to be at least "
					+ "ten rooms on a floor.\nPlease enter"
					+ " a number 10 or greater:");
				numberOfRooms = input.nextInt();
			}

			System.out.println("How many of those are occupied?");
			occupied = input.nextInt();

			// The vacant rooms can be inferred
			vacant = numberOfRooms - occupied;

			// Update accumulator variables
			roomTotal += numberOfRooms;
			occupiedTotal += occupied;
			vacantTotal += vacant;
		}

		// Calculate occupancy rate and display totals.
		// The String.format() method is used to clean up 
		// the decimal presentation. 
		occupancyRate = occupiedTotal / roomTotal;
		System.out.println("The total number of rooms in the hotel is " 
			+ roomTotal);
		System.out.println("The number of rooms that are occupied is "
			+ String.format("%.0f",occupiedTotal));
		System.out.println("The number of vacant rooms is " + vacantTotal);
		System.out.println("The occupancy rate for the hotel is " 
			+ String.format("%.0f", (occupancyRate * 100)) + "%.");

	}	
}
