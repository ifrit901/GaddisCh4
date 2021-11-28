package ch4java6thedition;
import javax.swing.JOptionPane;
/**
 * This is #12 from the programming challenges.
 * I couldn't figure out how to do this with the Scanner class, had to resort 
 * to YouTube. The reason I picked this version of the Gaddis Java book is 
 * because I saw that Kakra Detome already did a series on the programming 
 * challenges from this book. I knew I'd have a go-to resource in case I ever
 * got stuck. So big ups to Kakra for helping me out. Also, he solves the 
 * problem completely differently by using JOptionPanes which I now know are
 * much more capable than I thought they were.
 * 
 * Write a program that asks the user to enter today's sales for five stores.
 * The program should display a bar chart comparing each store's sales. Create
 * each bar in the bar chart by displaying a row of asterisks. Each asterisk 
 * should represent $100 of sales. Here is an example of the program's output:
 * 
 * Enter today's sales for store 1: "1000" [Enter]
 * Enter today's sales for store 2: "1200" [Enter]
 * Enter today's sales for store 3: "1800" [Enter]
 * Enter today's sales for store 4: " 800" [Enter]
 * Enter today's sales for store 5: "1900" [Enter]
 * 
 * SALES BAR CHART
 * Store 1: **********
 * Store 2: ************
 * Store 3: ******************
 * Store 4: ********
 * Store 5: *******************
 * 
 * @author craig
 */
public class Bar_Chart {
	public static void main (String [] args) {
		// Variables 
		String userStringInput,   // To accept user input in the boxes
		       outputString = "SALES BAR CHART\n";  // To begin concatenation of chart
		int    storeSales,
		       numberOfAsterisks,
		       numberOfStores = 5;
		
		// Explain to the user that the sales totals must be entered in
		// multiples of 100
		JOptionPane.showMessageDialog(null, "Enter the sales of five stores and "
			+ " I'll display their results in a chart.\nBe sure to enter the "
			+ " sales in multiples of 100 only (e.g. \"1200\" or \"800\").");

		for (int store = 1; store <= numberOfStores; store++)
		{
			userStringInput = JOptionPane.showInputDialog("Enter today's sales for store " + store);
			storeSales = Integer.parseInt(userStringInput);

			// Validate input
			while(storeSales < 100)
			{
				userStringInput = JOptionPane.showInputDialog(null, "It's gotta be at least 100"
						+ ". Please enter the sales as a multiple of 100:");
				storeSales = Integer.parseInt(userStringInput);

			}
			numberOfAsterisks = storeSales / 100;
			outputString += "Store " + store + ": "; // Concatenates store number before *'s

			// Inner loop for asterisk printing
			for (int printAsterisk = 1; printAsterisk <= numberOfAsterisks; printAsterisk++)
			{
				outputString += "*";	
			}
			outputString += "\n"; // Concatenates dropping a newline
		}

		JOptionPane.showMessageDialog(null, outputString);
		System.exit(0); // Needed to end the thread created by JOptionPane usage
	}	
}
