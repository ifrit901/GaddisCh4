package ch4java6thedition;
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * This is problem number 22 in the program challenges.
 * A slot machine is a gambling device that the user enters money into and then 
 * pulls a lever (or press a button). The slot machine then displays a set of 
 * random images. If two or more of the images match, the wins an amount of 
 * money that the slot machine dispenses back to the user.
 * 
 * Create a program that simulates a slot machine. When the program runs, it 
 * should do the following:
 * 
 * - Asks the user how much he or she wants to enter into the slot machine. 
 * - Instead of displaying images, the program will randomly select a word from
 *   the following list:
 *   
 *   Cherries, Oranges, Plums, Bells, Melons, Bars
 * 
 *   To select a word, the program can generate a random number in the range of
 *   0 - 5. If the number is 0, the word is Cherries, if the number is 1, the 
 *   word is Oranges, and so forth. The program should randomly select a word 
 *   from this list three times and display all three of the words.
 * - If none of the randomly selected words match, the program will inform the 
 *   user that he or she has won $0. If two of the words match, the program 
 *   will inform the user that he or she has won two times the amount entered. 
 *   If three of the words match, the program will inform the user that they 
 *   won three times the amount entered. 
 * - The program will ask whether the user wants to play again. If so, these 
 *   steps are repeated. If not, the program displays the total amount of 
 *   money entered into the slot machine and the total amount won. 
 *
 * @author craig
 */
public class Slot_Machine_Simulation {
	public static void main (String [] args) {
		// Variables
		int     wordIndex;
		double	userAmountEntered,
			userAmountWon = 0,
			userAmountLoss = 0;
		Random  random = new Random();
		String  userStringEntered,	
			word =  "",
			outputString = "",
			word1 = "",
			word2 = "",
			word3 = "",
			choice = "";

		while(!choice.equals("no") && !choice.equals("No")){
			userStringEntered = JOptionPane.showInputDialog(null, "Insert money: ");
			userAmountEntered = Double.parseDouble(userStringEntered);
			userAmountLoss += userAmountEntered;	
			
			for(int wordCount = 1; wordCount <= 3; wordCount++){
				wordIndex = random.nextInt(6);
	
				if (wordIndex == 0) {
					word = "Cherries";
				} else if (wordIndex == 1) {
				word = "Oranges";
				} else if (wordIndex == 2) {
				word = "Plums";
				} else if (wordIndex == 3) {
				word = "Bells";
				} else if (wordIndex == 4) {
				word = "Mellons";
				} else if (wordIndex == 5) {
					word = "Bars";
				}
				
				if (wordCount == 1) {
					word1 = word;
				} else if (wordCount == 2) {
					word2 = word;
				} else if (wordCount == 3) {
					word3 = word;
				}
	
			}
			
			outputString = outputString + "|"+ word1 +"|  |" + word2 + "|  |" + word3 + "|";
	
			if (((!word1.equals(word2)) && (!word1.equals(word3)) && ((!word2.equals(word3))))) {
				outputString += "\n\nYou have won $0";
			} else if (((word1.equals(word2)) && (!word1.equals(word3))) || 
			  ((word1.equals(word3)) && (!word1.equals(word2))) || 
			  ((word2.equals(word3)) && (!word2.equals(word1)))) {
				outputString += "\n\nYou have won $" + (userAmountEntered * 2);
				userAmountWon += (userAmountEntered * 2);
			} else {
				outputString += "\n\nYou have won $" + (userAmountEntered * 3);
				userAmountWon += (userAmountEntered * 3);
			}

			JOptionPane.showMessageDialog(null, outputString);
			choice = JOptionPane.showInputDialog(null, "Do you want to play again?");
		}
		JOptionPane.showMessageDialog(null, "You lost a total of $" + userAmountLoss + 
			" and you won $" + userAmountWon);
		System.exit(0);
	}	
}
