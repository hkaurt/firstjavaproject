package loops;

import java.util.Scanner;

/*@author Harpreet, 
 * 7 examples of do while loop, 
 * 2 examples of static method, 
 * 3 example of break
 * 1 example of continue,
 * 2 parameterised method
 * 5 examples of non parameterised method
 * 
 */

public class DoWhileLoop {

	/*
	 * 1. Count Down from 10 to 1
	 * 
	 * @param count parameter number to start countdown from
	 */
	public void countDown(int count) {
		System.out.println("**do while loop Example 1: Count down from count to 1 **");

		do {
			System.out.println(count);
			count--;
		} while (count > 0);
		System.out.println("Count down finished");
	}

	// 2. Keep Doubling a Value Until It Exceeds a Limit

	public static void doubleTheValue() {
		System.out.println("**do while loop Example 2: Keep doubling a value until it exceeds a limit or reach 64**");
		int i = 1;
		do {
			System.out.println(i);
			i *= 2; // i=i*2;
			if (i == 64) {
				break;
			}
		} while (i < 100);
	}

	// 3. Fibonacci Sequence Until Nth Term using do-while loop

	public static void fibonacciSeries(Scanner scanner) {
		System.out.println("**do while loop Example 3: Print Fibonacci series until Nth Term **");
		System.out.println("Please enter the number of terms: ");
		int n = scanner.nextInt();

		int a = 0, b = 1;
		int count = 1;

		do {
			System.out.println(a);
			int next = a + b;
			a = b;
			b = next;
			count++;
		} while (count <= n);

	}

	// 4. keep running the program until the user chooses to exit using do while

	public void runUntilExit(Scanner scanner) {
		System.out.println("**do while loop Example 4: Keep running the program until user chooses to exit or close**");
		String userInput;

		do {
			System.out.println("Do you want to continue? (yes/exit): ");

			userInput = scanner.next();
			if (userInput.equals("close")) {
				break;
			}

		} while (!userInput.equals("exit"));
		System.out.println("Program exited");
	}

	// 5. Menu System (Ask for input until valid selection is made)

	public void runUntilSelection(Scanner scanner) {
		System.out.println(
				"**do while loop Example 5: Menu System (ask for inout valid selection is made) - using do while loop and if else**");

		int choice;
		do {
			System.out.println("Menu");
			System.out.println("1. View Profile");
			System.out.println("2. Edit Profile");
			System.out.println("3. Exit");
			System.out.println("Make your selection (1 to 3): ");
			choice = scanner.nextInt();
			if (choice < 1 || choice > 3) {
				System.out.println("invalid selection- please select one of the following : ");
			}
		} while (choice > 3 || choice < 1);

		if (choice == 1) {
			System.out.println("Viewing Profile....");
		} else if (choice == 2) {
			System.out.println("Editing Profile....");
		} else {
			System.out.println("Exiting ....");
		}

	}

	// 6. print even number only skip odd from 1 to n or 30

	public void printEvenOnly(int n) {
		System.out.println("**do while loop Example 6: print even number only skip odd from 1 to n or until 30**");
		int i = 1;
		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			if (i > 30) {
				break;
			}
			i++;
		} while (i <= n);

	}

	// 7. sum of odd numbers between 1 to 10 except 3
	public void sumOfOdd() {
		System.out.println("**do while loop Example 7: print sum of odd numbers between 1 to 10 **");
		int i = 1;
		int sum = 0;
		do {
		
			if (i % 2 == 0) {
				i++;
				continue;
			}
			
			sum += i;
			i++;

		} while (i <= 10);
		System.out.println("sum of odd numbers between 1 to 10 is " + sum);
	}

}