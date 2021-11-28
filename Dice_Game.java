package ch4java6thedition;
import java.util.Random;
import java.util.Scanner;
/**
 * This is problem number 21 from the programming challenges.
 * Write a program that plays a simple dice game between the computer and the 
 * user. When the program runs, a loop should repeat 10 times. Each iteration of 
 * the loop should do the following:
 * 
 * - Generate a random number in the range 1 - 6. This is the value of the 
 *   computer's die.
 * - Generate another random number in the range 1-6. This is the value of the
 *   user's die.
 * - The die with the highest value wins. (In the case of a tie, there is no 
 *   particular winner for that roll of the dice.)
 * 
 * As the loop iterates, the program should keep count of the number of times 
 * the computer wins, and the number of times the user wins. After the loop 
 * performs all of its iterations, the program should display who was the grand
 * winner, the computer or the user.
 * 
 * @author craig
 */
public class Dice_Game {
	public static void main (String [] args) {
		// Variable
		String answer;
		int     userRoll,
			computerRoll,
			userTotal = 0,
			computerTotal = 0,
			tieTotal = 0;
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Create a Random object
		Random randy = new Random();

		// Explain to the user what's going on and ask if they wanna play
		System.out.println("This is a dice game. The computer will roll the dice\n"
			+ "for both you and itself 10 times. Whoever gets the\n"
			+ "higher roll more often wins!\n"
			+ "Wanna play? Yes or No?");
		answer = input.nextLine();

		if(answer.equals("Yes") || answer.equals("yes"))
		{
			for (int i = 1; i <= 10; i++)
			{
				computerRoll = randy.nextInt(6);
				userRoll = randy.nextInt(6);

				if (computerRoll > userRoll)
				{
					System.out.println("Computer wins this roll");
					computerTotal += 1;
				}
				else if (computerRoll < userRoll)
				{
					System.out.println("User wins this roll");
					userTotal += 1;
				}
				else
				{
					System.out.println("Tie");
					tieTotal += 1;
				}
					
			}

			if (userTotal > computerTotal)
			{
				System.out.println("\n\nYou won " + userTotal + " rolls "
					+ " vs the computer's " + computerTotal + " and "
					+ tieTotal + " tie(s),");
				System.out.println("You beat the computer!");
				System.exit(0);
			}
			else if (computerTotal > userTotal)
			{
				System.out.println("\n\nThe computer won " + computerTotal + " rolls"
					+ " vs your " + userTotal + " and " + tieTotal + " tie(s).");
				System.out.println("The computer won this time, "
					+ "but I'm sure you'll be back for more!");
				System.exit(0);
			}
			else
			{
				System.out.println("\n\nCan you believe it??? a tie!");
				System.exit(0);
			}
		}
		else
		{
			System.out.println("Aww, you're no fun :(");
		}
	}	
}
