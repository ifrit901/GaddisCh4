package ch4java6thedition;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * This chapter introduces loops, files, increment/decrement operators, 
 * input validation. These are solutions to some of the first checkpoint
 * questions in the chapter.
 * @author craig
 */
public class Ch4java6thEdition {
	public static void main(String[] args) {
		// Checkpoint 4.4
		// Write an input validation loop that asks the user to enter
		// a number between 10 and 24

		int number;
		
		// Create an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt user for input
		System.out.println("Enter a number between 10 - 24.");
		number = input.nextInt();

		// Create while loop to validate input
		while (number < 10 || number > 24)
		{
			System.out.println("That number is outside the required range.\n" 
			+ "Please enter a number between 10 - 24:");
			number = input.nextInt();
		}
		System.out.println("Thank you for the number in the correct range!");

		//=========================================================

		// Write an input validation loop that asks the user to enter
		// 'Y' or 'y' or 'N' or 'n'.
		char letter;
		String keyboard;
		Scanner answer = new Scanner(System.in);
		System.out.println("Please enter y or n:");

		keyboard = answer.nextLine();
		letter = keyboard.charAt(0);
		System.out.println(letter);
		while (letter != 'Y' && letter != 'y' && letter != 'N' && letter != 'n')
		{
			JOptionPane.showMessageDialog(null, 
				"You gotta choose a \"Y\" or \"N\" of some sort!\n"
					+ "Enter y or n:");
			letter = answer.next().charAt(0);
			
		}
		JOptionPane.showMessageDialog(null, "Thanks for entering a y or n!!");


	//_-----____________________________________________________
	// String input validation	
	String affermative;
	affermative = JOptionPane.showInputDialog(null, "Enter \"Yes\" or \"No\".");

	
	while (!affermative.equals("Yes") && !affermative.equals("No"))	
	{
		affermative = JOptionPane.showInputDialog(null, "Please write \"Yes\" or \"No\".");
	}
	System.out.println("Thank you for writing Yes or No!");

	//________________________________________________________
	// Do while loop
	do
	{
		affermative = JOptionPane.showInputDialog(null, "Do you want to enter Yes or No?");
	}while(affermative.equalsIgnoreCase("Yes"));
		System.exit(0);
	}

}
