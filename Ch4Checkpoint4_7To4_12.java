package ch4java6thedition;
import java.util.Scanner;
/**
 * These are answers to checkpoint 4_7
 * through 4_12.
 * @author craig
 */
public class Ch4Checkpoint4_7To4_12 {
	public static void main (String [] args) {
		// 4_7	
		/*
		 The names for the parts of a for loop are:
		 The initialization exepression, the test expression,
		 and the update expression.
		*/
		 
		// 4.8
		/*
		a) You will use 'int count = 1;' for an initialization statement
		b) count <= 50 will be the test expression
		c) count++ will be the update expression
		d) see below
		*/
		for (int count = 1; count <= 50; count++)
		{
			System.out.println(count + ". I love to program.");
		}
		System.out.println("---------------------------------");
		/* 4_9
		 The following program segments will display the following:
		a) 0
		   2
		   4
		   6
		   8
		  10
		b) -4
		   -3
		   -2
		   -1
		    0
		    1
		    2
		    3
		    4
		c) 5
		   5
		   8
		   8
		  11
		  11
		  14
		  14
		*/
		// 4.10
		// Write a for loop that displays your name 10 times
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Craig");
		}
		System.out.println("---------------------------------");
		// 4.11
		// Write a for loop that displays all of the odd numbers 1 - 49
		for (int i = 1; i <= 49; i += 2)
		{
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		// 4.12
		// Write a for loop that displays every 5th number 0 - 100
		for (int i = 0; i <= 100; i += 5)
		{
			System.out.println(i);
		}
	}	
}
