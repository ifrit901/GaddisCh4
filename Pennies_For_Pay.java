package ch4java6thedition;
import java.util.Scanner;
import java.io.*;
/**
 * This is the #4 programming challenge.
 * Write a program that calculates the amount a person would earn over a period
 * of time if his/her salary is one penny the first day, two pennies the second
 * day, and continues to double every day. The program should display a table
 * showing the salary for each day, and then show the total pay at the end of 
 * the period. The output should be shown in a dollar amount, not in the number
 * of pennies.
 * Also, validate the input not to accept less than one day worked. 
 * @author craig
 */
public class Pennies_For_Pay {
	public static void main (String [] args) throws IOException {
		// Variables
		int daysWorked;
		double total = 1;

		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create a PrintWriter object
		PrintWriter pw = new PrintWriter("Pennies_For_Pay.txt");

		System.out.println("How many days did you work?");
		daysWorked = input.nextInt();

		// Validate the input
		while(daysWorked < 1)
		{
			System.out.println("You have to work at least one day,"
				+ "\nplease enter the number of days again:");
			daysWorked = input.nextInt();
		}

		// Output to console
		System.out.println("Days\t\tPay");
		System.out.println("---------------------");

		for(int i = 1; i <= daysWorked; i++)
		{
			// Format the decimal to eliminate super long decimals
			System.out.println(i + "\t\t\t" + String.format("%,.2f",(total * .01)));
			total *= 2;
		}

		// Write the data to a file
		pw.println("Days\t\tPay");
		pw.println("---------------------");

		for(int i = 1; i <= daysWorked; i++)
		{
			pw.println(i + "\t\t\t" + String.format("%,.2f",(total * .01)));
			total *= 2;
		}

		// Close the file
		pw.close();
	}	
}
