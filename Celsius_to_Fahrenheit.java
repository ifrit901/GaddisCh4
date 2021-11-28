package ch4java6thedition;

/**
 * This is #11 in the programming challenges.
 * Write a program that displays a table of the Celsius temperatures 0 - 20
 * and their Fahrenheit equivalents. The formula for converting a temperature
 * from Celsius to Fahrenheit is:
 * 
 * F = 9/5C + 32;
 * 
 * where F is the Fahrenheit temperature and C is the Celsius temperature. Your
 * program must use a loop to display the table.
 * 
 * @author craig
 */
public class Celsius_to_Fahrenheit {
	public static void main (String [] args) {
		// Variables 
		double     celsius,
			fahrenheit;

		// Display the head of the table
		System.out.println("Celsius\t\tFahrenheit");
		System.out.println("-----------------------");

		// Loop to display value
		for (int i = 0; i <= 20; i++)
		{
			System.out.println(i + "\t\t\t" + String.format("%.1f", (((9.0/5) * i) + 32)));
		}
	}
}
