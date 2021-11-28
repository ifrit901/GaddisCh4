package ch4java6thedition;
import java.util.Scanner;
/**
 * Algorithm workbench problems 4 - 8.
 * Correction. 5 - 8.
 * 
 * @author craig
 */
public class AlgorithmWorkbench4thru8 {
	public static void main (String [] args) {
		/* 
		5. Write a for loop that calculates the total of the following 
		series of numbers:

		1/30 + 2/29 + 3/28 + ... 30/1

		*/
		// You need an accumulator variable to hold the running total
		// and it must be initialized to zero
		double total = 0.0;

		/*
		This is the most complicated for loop I've ever written. It
		has two initialization expressions, a test expression with 
		a logical AND operator, and an update expression with two
		elements in it. I think the code would still work if the test
		expression contained only i <= 5, but I put the condition for 
		the denominator in just to be sure.
		*/
		for (double i = 1, p = 30; i <= 30 && p >= 1; i++, p--)
		{
			total += i/p;	
		}
		// The variable 'total' is formatted to two decimal places
		System.out.println("The total of the series is " + String.format("%.2f",total));
		System.out.println("\n\n");

		/*
		6. Write a nested loop that displays 10 rows of '#' characters.
		There should be 15 '#' characters in each row. 
		*/	
		for(int i = 1; i <= 10; i++)
		{
			for(int p = 1; p <= 15; p++)
			{
				System.out.print("#");
			}
			System.out.println();
		}

			System.out.println("\n\n");

		/*
		7. Convert the while loop in the following code to a do-while loop:

		Scanner keyboard = new keyboard(System.in);
		int x = 1;
		while (x > 0) 
		{
			System.out.print("Enter a number:");
			x = keyboard.nextInt();
		}
		
		It should be noted that this can be an infinite loop. Converting it
		to a do-while loop only makes it an infinite loop that is dependent
		on the user to continue. In this situation, a message stating 
		how to exit should be communicated to the user. Specifically,
		the user has to enter a number less than 1 to end the program.
		*/
		Scanner keyboard = new Scanner(System.in);
		int x = 1;
		do
		{
			System.out.print("Enter a number. \nWhen you are ready to "
				+ " stop, enter a number less than 1.\nEnter your"
				+ " number:");
			x = keyboard.nextInt();
		}while(x > 0);
		System.out.println("\n\n");

		/*
		8. Convert the do-while loop in the following code to a while loop:

		Scanner keyboard = new Scanner(System.in);
		String input;
		char sure;

		do
		{
			System.out.println("Are you sure you want to quit?");
			input = keyboard.next();
			sure = input.charAt(0);
		} while(sure != 'Y' && sure != 'N');

		This code is kinda funny, even if you choose 'y' to quit, it 
		puts you back in the loop. If you choose 'Y' it will quit, but 
		if you choose 'N' it will quit anyway. Again, this is another
		example of a loop that does not explicitly tell you how to exit.
		Much haha's Tony Gaddis, much haha's. Let's normalize it.
		*/
		String input;
		char    sure;
		
		// At this point, 'sure' has not been initialized.
		// So we need to get the user to assign it a value.
		System.out.println("Are you sure you want to quit?");
		input = keyboard.next();
		sure = input.charAt(0);

		// Also, we can change the conditional statement so that all
		// non-yes answers put you back in the loop.  
		while(sure != 'Y' && sure != 'y')
		{
			System.out.println("Are you sure you want to quit?");
			input = keyboard.next();
			sure = input.charAt(0);
		}
	}	
}
