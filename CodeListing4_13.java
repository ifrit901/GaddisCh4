package ch4java6thedition;
import java.util.Scanner;
/**
 * This example shows how to use nested loops. The problem uses nested loops
 * to collect grades from a student, average them, and then repeat the 
 * process for each student.
 * 
 * @author craig
 */
public class CodeListing4_13 {
	public static void main (String [] args) {
		int numStudents,      // Number of students
			numTests,     // Number of tests per student
			score,        // Test score
			total;        // Accumulator for test scores
		double average;       // Average test score

		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Get the number of students
		System.out.println("How many students are there?");
		numStudents = input.nextInt();

		// Get the number of tests per student
		System.out.println("How many tests did each student take?");
		numTests = input.nextInt();

		// Make a loop for the students
		for (int i = 1; i <= numStudents; i++)
		{
			total = 0;     // Set the accumulator to zero

			// Get the test scores for a student
			System.out.println("Student number " + i);
			System.out.println("--------------------------");

			// Nested loop inside each student
			for (int test = 1; test <= numTests; test++)
			{
				System.out.println("Enter score " + test + ":");
				score = input.nextInt();
				total += score;      // Add score to the total
			}

			// Calculate and display the averages
			average = total / numTests;

			System.out.println("The average score for student "
				+ i + " is " + average);

		}

		
	}	
}
