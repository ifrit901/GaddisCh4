package ch4java6thedition;
import java.util.Scanner;
/**
 * This is number 16 from the programming challenges.
 * Write a program that asks the user to enter the amount that he or she has
 * budgeted for a month. A loop should then prompt the user to enter each of  
 * his or her expenses for the month, and keep a running total. When the loop 
 * finishes, the program should display the amount that the user is under or 
 * over budget.
 * 
 * @author craig
 */
public class Budget_Analysis {
	public static void main (String [] args) {
		// Variables
		int monthlyBudget,
			expenses,
			total = 0;   // Accumulator variable set to zero

		// Create a Scanner object 
		Scanner input = new Scanner(System.in);

		// Prompt user for monthly budget
		System.out.println("What is your monthly budget?");
		monthlyBudget = input.nextInt();

		// Prompt user for number of monthly expenses
		System.out.println("How many monthly expenses do you have?");
		expenses = input.nextInt();

		// Loop for monthly expense total
		for(int i = 1; i <= expenses; i++)
		{
			int expense;
			System.out.println("How much does expense #" + i + " cost?");
			expense = input.nextInt();
			total += expense;
		}

		if (total == monthlyBudget)
			System.out.println("You broke even!!");
		else if (total < monthlyBudget)
		{
			System.out.println("You were under budget by $" + (monthlyBudget - total)
				            + ", congratulations!");
		}
		else
			System.out.println("You overspent by $" + (total - monthlyBudget));

	}	
}
