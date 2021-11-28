package ch4java6thedition;
import java.util.Random;
/**
 * Algorithm workbench problems 13 - 16.
 * 
 * @author craig
 */
public class AlgorithmWorkbench13thru16 {
	public static void main (String [] args) {
		/*
		13. Write nested loops to draw this pattern.
		*******
		******
		*****
		****
		***
		**
		*
		
		This concept is still confusing for me. I actually had to draw 
		out a flow chart to see what the heck was happening. I need to 
		practice writing out flow charts more often, I'm really bad at
		it.
		*/
		for (int rows = 7; rows > 0; rows--)
		{
			for (int columns = 0; columns < rows; columns++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n");


		/*
		14. Write nested loops to draw this pattern:

		##
		# #
		#  #
		#   #
		#    #
		#     #

		Here we are again. Time to bust out the pen and paper for flow
		charts ugh.
		*/
		for (int rows = 1; rows <= 6; rows++)
		{
			System.out.print("#");
			for (int columns = 1; columns < rows; columns++)
			{
				System.out.print(" ");
			}
			System.out.println("#");
		}
		/* 
		Well, I lied. I didn't really write a flow chart, but I did 
		visualize the one I scribbled out for the last problem and 
		I figured this one out much faster.
		*/
		System.out.println("\n\n");


		/*
		15. Complete the following program so it displays a random integer
		in the range of 1 - 10.

		// Write the necessary import statements here
		public class ReviewQuestion15
		{
			public static void main (String [] args) 
			{
				// Write necessary code here
			}
		}
		*/
		// So, we are already inside a class and inside its main method.
		// We can just skip to the necessary code. Also, the import 
		// statement will get added to the top (Random). 

		// Create an object of the Random class
		Random randy = new Random();

		int number = randy.nextInt(10) + 1;
		System.out.println(number);

		System.out.println("\n\n");



		/*
		16. Complete the following program so it performs the following
		action 10 times:

		- Generates a random number that is either 0 or 1. 
		- Displays the word "Yes" or "No" depending on the random 
		number that was generated. 

		// Write the necessary import statements here
		public class ReviewQuestion16
		{
			public static void main (String [] args) 
			{
				// Write the necessary code here
			}
		}
		*/
		// Again, we already have a class and main method

		// We also still have a Random object named randy so
		// we can reuse that.
		for (int i = 0; i < 10; i++)
		{
			int x = randy.nextInt(2);
			if (x == 0)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
	}	
}
