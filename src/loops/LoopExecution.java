package loops;

import java.util.Scanner;

public class LoopExecution {

	public static void main(String[] args) {

		// for loop examples

		ForLoop.printNumbers(); // calling static method use class name

		System.out.println("Factorial of the number: " + ForLoop.findFactorial(5));

		ForLoop.multipleTable(7);

		ForLoop fl = new ForLoop(); // creating object of class ForLoop
		fl.printFibonaccisequence(10); // calling non-static parameterised method of ForLoop class using its object

		int total = fl.sumOfNumbers(20);
		System.out.println(total);

		// while loop examples
		System.out.println("Sum of digits of given number:" + WhileLoop.sumOfNumber(1256)); // calling static method use
																							// class name

		WhileLoop wl = new WhileLoop();
		System.out.println("reverse of the number is : " + wl.reverseNumber(1231)); // calling non-static method use
																					// class object

		wl.doubleTheValue(100);

		wl.countDown();

		wl.printMultipleOfNumber(5);

		// do while loop examples
		DoWhileLoop dw = new DoWhileLoop();

		dw.countDown(3);

		/**
		 * creating object of @class Scanner
		 * 
		 * @param scanner object of Scanner class
		 */

		Scanner scanner = new Scanner(System.in);
		DoWhileLoop.doubleTheValue();

		DoWhileLoop.fibonacciSeries(scanner);

		dw.runUntilExit(scanner);

		dw.runUntilSelection(scanner);

		dw.printEvenOnly(59);

		dw.sumOfOdd();

		scanner.close();

	}
}
