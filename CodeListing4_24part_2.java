package ch4java6thedition;
import java.util.Random;
/**
 * Dr Kimura is back and is so happy with the dice rolling program that 
 * he wants you to write another that will flip a coin ten times and 
 * display whether they land on heads or tails.
 * 
 * @author craig
 */
public class CodeListing4_24part_2 {
	public static void main (String [] args) {
		// Instantiate a Random class object
		Random flip = new Random();

		// He wants the coin flipped 10 times so use a for loop
		for (int i = 0; i < 10; i++)
		{
			// 0 is tails and 1 is heads
			if (flip.nextInt(2) == 0)
				System.out.println("Tails");
			else
				System.out.println("Heads");
		}
		
	}
}
