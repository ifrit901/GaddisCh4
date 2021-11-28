package ch4java6thedition;
import javax.swing.JOptionPane;
/**
 * This Code Listing calculates a company's total sales over a period of time
 * by taking daily sales figures as input and calculating a running total of 
 * them as they are gathered.
 * 
 * @author craig
 */
public class CodeListing4_10 {
	public static void main (String [] args) {
		int     days;              // The number of days
		double  sales,              // The sales from one day
			totalSales = 0.0;   // The accumulator. It needs to be initialized to 0
		String  input;              // To hold user input

		// Get the number of days
		input = JOptionPane.showInputDialog(null, "How many days will you"
			+ " accumulate sales for?");
		days = Integer.parseInt(input);

		// Get the sales figures and calculate a running total
		for (int i = 1; i <= days; i++)
		{
			input = JOptionPane.showInputDialog(null,
				"What were the sales totals on day " + i + "?");
			sales = Double.parseDouble(input);
			totalSales += sales;
		}
		JOptionPane.showMessageDialog(null, "The total sales after " 
		+ days + " days of sales is $" + String.format("%,.2f", totalSales));

		System.exit(0);
	}

} 