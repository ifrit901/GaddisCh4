package ch4java6thedition;
import java.util.Scanner;
/**
 * Algorithm workbench 9 - 12.
 * 
 * @author craig
 */
public class AlgorithmWorkbench9thru12 {
	public static void main (String [] args) {
		/*
		9. Convert the following while loop to a for loop.

		int count = 0;
		while (count < 50)
		{
			System.out.println("Count is " + count);
			count++;
		}

		I don't think there's any jokes in this one :(
		*/
		for (int count = 0; count < 50; count++)
		{
			System.out.println("Count is " + count);
		}
		System.out.println("\n\n");

		
		/*
		10. Convert the following for loop to a while loop.

		for (int x = 50; x > 0; x--)
		{
			System.out.println(x + " seconds to go");
		}
		*/
		int x = 50;

		while (x > 0)
		{
			System.out.println(x + " seconds to go.");
			x--;
		}
		System.out.println("\n\n");


		/*
		11. Write an input validation loop that asks the user to enter a 
		number in the range of 1 through 4.
		*/
		System.out.println("Enter a number within the range 1 - 4:");
		int num;

		// Create Scanner object to receive user input
		Scanner input = new Scanner(System.in);

		num = input.nextInt();

		while(num < 1 || num > 4) 
		{
			System.out.println("Hey! The number needs to be 1 - 4!\n"
				+ "Try again:");
			num = input.nextInt();
		}
		System.out.println("Thank you :)");
		System.out.println("\n\n");


		/*
		12. Write an input validation loop that asks the user to enter
		"yes" or "no".
		We will use the Scanner object from the last problem.
		Also, the last problem used that object to enter an int
		value. So there is a pesky newline character still in the 
		keyboard buffer. We will need to consume it first.
		*/
		input.nextLine();
		// Awesome. No we can get on with our lives

		String answer;

		System.out.println("Please enter \"yes\" or \"no\".");

		answer = input.nextLine();

		while(!answer.equals("yes") && !answer.equals("no"))
		{
			System.out.println("Excuse me, that's not one of the valid "
				+ "answers!\nPlease enter \"yes\" or \"no\".");
			answer = input.nextLine();
		}
		System.out.println("Thank you for following the instructions,"
			+ "\nyou're a real conformist!");
	}	
}
