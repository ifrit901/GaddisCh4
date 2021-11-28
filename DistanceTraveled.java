package ch4java6thedition;
import java.util.Scanner;
/**
 * The distance a vehicle travels can be calculated as follows:
 * 
 * Distance = Speed * Time
 * 
 * For example, if a train travels 40 miles per hour for three hours, the 
 * distance traveled is 120 miles. Write a program that asks for the speed
 * of a vehicle (in MPH) and the number of hours it has traveled. It should
 * use a loop to display the distance a vehicle has traveled for each hour of
 * a time period specified by the user. For example, if a vehicle is traveling 
 * at 40 MPH for a three-hour time period, it should display a report similar 
 * to the following:
 * 
 * Hour             Distance traveled
 * ----------------------------------
 * 1                      40
 * 2                      80
 * 3                     120
 * 
 * - Input validation: Do not accept a negative number for speed and don't 
 * - accept any value less than 1 for the time traveled. 
 * 
 * @author craig
 */
public class DistanceTraveled {
	public static void main (String [] args) {
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
			System.out.println("How many hours did it travel for?");
			time = input.nextInt();

			// Validate the time
			while(time < 1)
			{
				System.out.println("The time in hours has to be "
					+ "one or greater, please enter a number\n"
					+ "greater than zero:");
				time = input.nextInt();
			}
				// Display calculations
				System.out.println("Hours\t\tDistance");
				System.out.println("---------------------------");

		// Loop for calculations display
		for (int i = 1; i <= time; i++)
		{
			System.out.println(i + "\t\t" + speed * i);
		}		
	}	
}	
		
	

