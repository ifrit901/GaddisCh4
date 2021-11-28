package ch4java6thedition;
import java.util.Scanner;

/**
 * This program calculates and displays a conversion table from MPH to KPH.
 * @author craig
 */
public class Ch4CodeListing4_9 {
	public static void main (String [] args) {
		// Variables 
		final double conversionFactor = 0.6214;

		// Create a header and fill out the table with for loop
		System.out.println("KPH\t\tMPH\n"
			+ "--------------------------");
		for (int num = 60; num <= 130; num += 10) // KPH starts at 60
		{
			System.out.println(num + "\t\t" + 
				String.format("%,.2f", (num * conversionFactor)));
		}
	
			
	
	
	}	
}
