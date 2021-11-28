package ch4java6thedition;
import java.util.Scanner;
/**
 * Use nested loops to display a vertical rectangle of stars
 * like this:
 * 
 * *****
 * *****
 * *****
 * *****
 * *****
 * *****
 * 
 * @author craig
 */
public class Ch4InTheSpotlight {
	public static void main (String [] args){ // Just start out with the loops
		for (int column = 1; column <= 6; column++)
		{
			for (int row = 1; row <= 5; row++)
			{
				System.out.print("*");
			}

			System.out.println();   // To break the lines. 
						// Otherwise it would just 
						// make one long line
		}

		// Now again only asking for input to create a user defined pattern
		Scanner input = new Scanner(System.in);

		final int COLUMN,
			     ROW;

		// Get input from user
		System.out.println("How many columns do you want?");
		COLUMN = input.nextInt();

		System.out.println("How many rows do you want?");
		ROW = input.nextInt();

		// Create the loops
		for (int C = 1; C <= COLUMN; C++)
		{
			for (int R = 1; R <= ROW; R++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		In another example, try to make a pattern that looks like this:
		*
		**
		***
		****
		*****
		******
		*******
		********
		*/
		System.out.println("-------------------------------------------");
		final int BASE = 8;

		for (int r = 0; r < BASE; r++)
		{
			for (int c = 0; c < (r + 1); c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		// Another example that ends up looking like this:
		/*
		#
		 #
		  #
		   #
		    #
		     #
		*/
		final int SIX = 6;

		for (int r = 1; r < SIX; r++)
		{
			for (int c= 1; c < r; c++)
			{
				System.out.print(" ");
			}
			System.out.println("#");
		}

	}	
}
