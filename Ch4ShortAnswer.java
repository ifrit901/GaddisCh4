package ch4java6thedition;

/**
 * Chapter 4 Short Answer
 * 
 * @author craig
 */
public class Ch4ShortAnswer {
	public static void main (String [] args) {
		/*
		1. Describe the difference between prefix/postfix modes in the 
		increment/decrement operators.

		In prefix mode, the incrementing/decrementing takes place before
		the value is used in the statement. In postfix mode, the 
		incrementing/decrementing takes place after the statement in which
		it occurs is completed.

		2. Why should you indent the statements in the body of a loop?

		These statements should be indented to make them more readable
		and to accentuate that they are only executed as part of the loop.

		3. Describe the difference between pretest and posttest loops.

		A pretest loop evaluates a condition first before performing any 
		iterations. A posttest loop iterates at least once before testing
		a conditional statement to see if it will repeat.

		4. Why are the statements in the body of a loop called conditionally
		executed statements?

		They are called conditionally executed statements because they 
		will not be executed unless a boolean condition evaluates to true.

		5. Describe the difference between a while loop and a do-while
		loop.

		The only difference between these loops is their pre and post test
		loop status. The while loop tests a condition before iterating
		and a do-while loop iterates first and then tests a condition before
		iterating again. 

		6. Which loop should you use in situations where you want the loop
		to repeat until the boolean expression is false, and the loop 
		should not execute if the test expression is false to begin with?

		A while loop.

		7. Which loop should you use if you want the loop to repeat until
		the boolean expression is false, but the loop should execute at 
		least once?

		a do-while loop.

		8. Which loop should you use when you know the number of 
		required iterations?

		A for loop. 

		9. Why is it critical that accumulator variables be properly 
		initialized??

		Computer memory does not guarantee that blank space is truly blank.
		You need to initialize an accumulator variable to zero before it 
		is used. If you don't, it may have junk data in it waiting to be
		written to after the fact. You have to initialize it before it is
		used or it may have a random starting value that is stupid wrong.
		Initialize accumulator variables to zero.
		
		10. What is an infinite loop? Write the code for an infinite loop.

		int x = 1;
		while(x > 0)
		{
			System.out.println("I am an infinite loop!");
		}

		11. Describe a programming problem that would require the use of 
		an accumulator. 

		Any process that needs to record a running total - scores over 
		multiple games, adding up prices, counting how many times you 
		fart in an hour... All these need accumulator variables and all
		accumulator variables need to be initialized to ZERO.

		12. What does it mean to let a user control a loop?

		A user controlled loop usually stops between iterations, waiting 
		for the user to enter something that is tested as a boolean value
		or that lets the user state how many iterations they want the loop
		to repeat. 

		13. What is the advantage of using a sentinel?

		A sentinel is useful in user controlled loops where the iterations
		are not necessarily known beforehand. The user can enter the sentinel
		value whenever they are done entering data. The loop will then end
		when the useful data is gone. A sentinel value must be distinct 
		from the type of data being entered, lest it be confused for 
		another entry of useful data.

		14. Why must the value chosen for use as a sentinel value be 
		carefully chosen?

		A sentinel value must not be confused with data being entered in
		any other way. For example, if all the values being entered are
		positive integers, then a sentinel value could be a negative value,
		thereby never being confused as legitimate data. If you are entering
		ages, they will all be positive integers. A negative number can 
		never be confused as the age of a person and is therefore a good 
		candidate as a sentinel value.

		15. Describe a programming problem requiring the use of nested loops.

		If you need to count the number of somethings in a row, and there
		are more than one row, you can use nested loops to efficiently 
		do this.

		16. How does a buffer file increase a program's performance?

		A buffer file increases a program's performance because the 
		computer's processor is too fast to be left idle waiting for 
		user input or some other tremendously slow process. If the 
		buffer can be filled with data until it can all be processed at
		once, then the processor's capabilities will be more efficiently
		implemented. 

		17. Why should a program close a file when it is finished using
		it?

		I believe this is related to the buffer file considerations.
		Closing a file lets the computer know it can flush all the data
		in the buffer file to the desired file. Otherwise it may not be
		written to the file at all. 

		18. What is a file's read position? Where is the read position
		when a file is first opened for reading?

		A file's read position is the spot where it has last read data
		from the file, the beginning if it hasn't read anything yet. 
		Once it reads something from a file, the read position advances
		to the end of the next delimiter(usually whitespace).

		19. When writing data to a file, what is the difference between
		the 'print' and 'println' methods?

		Print does not advance the write position to the next line. 
		Println prints the data and advances the print position to 
		the next line. 

		20. What does the Scanner class's hasNext method return when the
		end of the file has been reached?

		A value of false? Or zero? Guess I've got to test it..

		21. What is a potential error that can occur when a file is 
		opened for reading?

		If the file is opened inappropriately, to be written to, 
		it can be erased. It has to be opened to be appended to. 

		22. What does it mean to append data to a file?

		To not erase data pre-existing in a file but to add to the end
		of it. 

		23. How do you open a file so that new data will be written to 
		the end of the file's exising data?

		You need to implement the FileWriter class. Pass an object of the 
		FileWriter class to the PrintWriter class. Then you can write to
		the end of the file without deleting anything. 
		*/
	}	
}
