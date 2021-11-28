package ch4java6thedition;
import java.util.Scanner;
/**
 * Chapter 4 Find the Error
 * 
 * @author craig
 */
public class FindTheError {
	public static void main (String [] args) {
		/*
		This is the find the error section, I'll try to identify the 
		errors and then maybe write the code in a way that works.

		1. This problem shows code that tries to add two numbers 
		entered by the user.

		int num1, num2;
		String input;
		char again;

		Scanner keyboard = new Scanner(System.in);
		while(again == 'y' || again == 'Y')
			System.out.print("Enter a number:");
			num1 = keyboard.nextInt();
			System.out.print("Enter another number:");
			num2 = keyboard.nextInt();
			System.out.println("Their sum is " + (num1 + num2));
			System.out.println("Do you want to do this again?");
			keyboard.nextLine();  // Consume the newline character
			input = keyboard.nextLine();
			again = input.charAt(0);

		Holy crap, where to start. The variable declarations are ok. 
		Creation of Scanner object ok. The while loop is all wrong.
		It immediately uses the char variable 'again' which hasn't 
		been assigned any value yet and then starts a multiple line 
		body that is not enclosed in curly brackets. Since the code
		seems to imply that it's going to add two numbers at least 
		once, it should probably be a do-while loop. That way it 
		can test whether 'again' has been assigned 'y' or 'Y' after
		an iteration. The body of the loop seems ok.

		*/
		
		String input;
		int num1, num2;
		char again;

		Scanner keyboard = new Scanner(System.in);

		do	
		{
			System.out.print("Enter a number:");
			num1 = keyboard.nextInt();
			System.out.print("Enter another number:");
			num2 = keyboard.nextInt();
			System.out.println("Their sum is " + (num1 + num2));
			System.out.println("Do you want to do this again?");
			keyboard.nextLine();  // Consume the newline character
			input = keyboard.nextLine();
			again = input.charAt(0);
		} while (again == 'y' || again == 'Y');
		// This arrangement seems to work better
		System.out.println();

		/*
		2. Error hunt haha. This code acts like it wants to display 
		the sum of the integers 1 - 100.

		int count = 1, total;
		while(count <= 100)
		total += count;
		System.out.print("The sum of the numbers 1 - 100 is ");
		System.out.println(total);

		The main error in this code is that it uses an accumulator variable
		that is not initialized to zero. It also doesn't change the value
		of 'count' so it creates an infinite loop. count++ will fix that.
		At that point the while loop will also need curly braces around
		a body with multiple lines.
		*/
		int count = 1, 
		    total = 0;
		while(count <= 100)
		{
			total += count;
			count++;
		}
		System.out.print("The sum of the numbers 1 - 100 is ");
		System.out.println(total);

		/*
		3. eRRorS!!

		int num1, num2, choice;
		Scanner keyboard = new Scanner(System.in);
		do
		{
			System.out.print("Enter a number:");
			num1 = keyboard.nextInt();
			System.out.print("Enter another number:");
			num2 = keyboard.nextInt();
			System.out.println("Their sum is " + (num1 + num2));
			System.out.println("Do you want to do this again?");
			System.out.print("1 = yes, 0 = no");
			choice = keyboard.nextInt();
		} while(choice = 1)

		This code only seems to have two errors, all in the last line.
		The expression (choice = 1) is not a test, it assigns the value
		of 1 to the variable choice. It needs to be == . After that, 
		the while loop has to have a semicolon at the end of the test
		expression.
		Also, I am having to change the names of the variables/Scanner 
		objects slightly so the code will compile with the previous 
		problems.
		*/
		int number1, number2, choice;
		Scanner reader = new Scanner(System.in);
		do
		{
			System.out.print("Enter a number:");
			number1 = keyboard.nextInt();
			System.out.print("Enter another number:");
			number2 = keyboard.nextInt();
			System.out.println("Their sum is " + (num1 + num2));
			System.out.println("Do you want to do this again?");
			System.out.print("1 = yes, 0 = no");
			choice = keyboard.nextInt();
		} while(choice == 1);

		/*
		4. Last one...
		It just wants to print the numbers 1 - 10. 

		for(int count = 1, count <= 10, i++)
		{
			System.out.println(count);
			count++;
		}

		So close, so far away. Inside the for loop it uses commas 
		instead of semicolons. Compiler error. In the body of the 
		for loop, count(er) is incremented as well as in the update
		expression of the loop, so in effect it is incremented twice
		with each iteration. This will make it print every other number
		instead of each digit 1 - 10. count(er)++ should be taken out
		of the body of the loop.
		Also, 'counter' instead of 'count' so my corrections work.
		*/
		for(int counter = 1; counter <= 10; counter++)
		{
			System.out.println(counter);
		}
	}	
}
