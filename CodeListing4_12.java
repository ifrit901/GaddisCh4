package ch4java6thedition;

/**
 * This is a clock simulator demonstrating nested for loops.
 * @author craig
 */
public class CodeListing4_12 {
	public static void main (String [] args) {
		for (int hours = 1; hours <= 12; hours++)
		{
			for (int minutes = 1; minutes <= 59; minutes++)
			{
				for (int seconds = 1; seconds <= 59; seconds++)
				{
					System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
				}
			}
		}

	}	
}
