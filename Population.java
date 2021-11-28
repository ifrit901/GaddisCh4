package ch4java6thedition;
import java.util.Scanner;
/**
 * This is #9 in the programming challenges.
 * Write a program that will predict the size of a population of organisms. 
 * The program should ask for the starting number of organisms, their average
 * daily population increase (as a percentage), and the number of days they 
 * will multiply. For example, a population might begin with two organisms, 
 * have an average daily increase of 50%, and will be allowed to multiply for
 * seven days. The program should use a loop to display the size of the 
 * population for each day. 
 * 
 * For input validation: Do not accept a number less than 2 for the starting size 
 * of the population. Do not accept a negative number for average daily 
 * population increase. Do not accept a number less than 1 for the number of 
 * days they will multiply.
 * 
 * @author craig
 */
public class Population {
	public static void main (String [] args) {
		// Variables
		int       daysOfMultiplying;
		
		double averageDailyIncrease,
			totalOrganisms = 0,
             		  numberOfOrganisms;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Prompt user for starting number of organisms
		System.out.println("How many organisms are there to start with?");
		numberOfOrganisms = input.nextInt();

		// Validate input
		while (numberOfOrganisms < 2)
		{
			System.out.println("There needs to be at least two to "
				+ "start with.\nPlease enter a number greater than 1:");
			numberOfOrganisms = input.nextInt();
		}

		// Prompt user for percentage of daily population increase
		System.out.println("What is the percentage of daily population increase?\n"
			+ "(For example, .05 for a 5% daily increase.");
		averageDailyIncrease = input.nextDouble();

		// Validate input
		while(averageDailyIncrease < 0)
		{
			System.out.println("The daily increase has to be positive.\n"
				+ "Please enter a percentage increase greater than 0:");
			averageDailyIncrease = input.nextDouble();
		}

		// Prompt user for number of days to multiply
		System.out.println("For how many days will they multiply?");
		daysOfMultiplying = input.nextInt();

		// Validate input
		while (daysOfMultiplying < 1)
		{
			System.out.println("There has to be at least one day of "
				+ "increase.\nPlease enter days greater than zero:");
			daysOfMultiplying = input.nextInt();
		}

		// Loop through each day of multiplication and display the results
		for (int i = 1; i <= daysOfMultiplying; i++)
		{
			totalOrganisms = numberOfOrganisms + (numberOfOrganisms * averageDailyIncrease);
			System.out.println("The increase for day " + i + " is "
				+ String.format("%.2f", totalOrganisms));
			numberOfOrganisms = totalOrganisms;
		}
	}	
}
