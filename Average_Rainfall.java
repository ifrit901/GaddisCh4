package ch4java6thedition;
import java.util.Scanner;
/**
 * This is problem #8 from the programming challenges.
 * Write a program that uses nested loops to collect data and calculate the 
 * average rainfall over a period of years. First the program should ask for
 * the number of years. The outer loop will iterate once for each year. The 
 * inner loop will iterate 12 times, once for each month. Each iteration of  
 * the inner loop will ask the user for the inches of rainfall for that month.
 * After all the iterations, the program should display the number of months, 
 * the total inches of rainfall, and the average rainfall per month for the 
 * entire period.
 * 
 * @author craig
 */
public class Average_Rainfall {
	public static void main (String [] args) {
		// Variables
		int             years,
		               months;

		double         inches,
			averageInches,
			  totalInches = 0;

		// Create a Scanner object
		Scanner input = new Scanner(System.in); 
		System.out.println("How many years do you want to calculate "
			+ " rainfall for?");
		years = input.nextInt();

		// Validate years input
		while(years < 1)
		{
			System.out.println("There has to be at least one year.\n"
				+ "Please enter the number of years:");
			years = input.nextInt();
		}

		// Nested loops for years and months
		for (int y = 1; y <= years; y++)
		{
			for (int m = 1; m <= 12; m++)
			{
				System.out.println("How many inches of rainfall were there"
					+ " in month " + m + "?");
				inches = input.nextDouble();

				// Validate inches
				while (inches < 0)
				{
					System.out.println("You can't have negative"
						+ " inches. Enter a positive number:");
					inches = input.nextDouble();
				}
				
			totalInches += inches;
			}
		}

		// Calculate and display the results
		months = years * 12;
		averageInches = totalInches / months;
		System.out.println("The total inches of rainfall are " + totalInches
			+ ", which fell over " + months + " months. \nThe average "
			+ "rainfall per month is " + averageInches);
		
	}	
}
