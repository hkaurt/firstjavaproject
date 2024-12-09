package loops;

/*@author Harpreet, 
 * 5 examples of for loop, 
 * 3 examples of static method, 
 * 2 examples of return method, 
 * 2 examples of continue,
 * 1 example of break,
 * 3 examples of parameterised method 
 * 2 examples of non parameterised method
 * 
 */

public class ForLoop {

	/*
	 * 1. Print Numbers from 1 to 10 using for loop except number 8
	 */

	// static method with for loop
	public static void printNumbers() {
		System.out.println("**for loop Example 1: Print numbers from 1 to 10 except number 8**");

		for (int i = 1; i <= 10; i++) {

			if (i == 8) {
				continue;
			}
			System.out.println(i);
		}
	}

	/*
	 * 2. find factorial of a number
	 * 
	 * @param number
	 * 
	 * @return factorial of the number
	 */

	public static int findFactorial(int number) {
		System.out.println("**for loop Example 2: find factorial of a number**");
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i; // factorial=factorial*i;
		}
		return factorial;
	}

	/*
	 * 3. print multiple table of a except for 5
	 * 
	 * @param number
	 */

	public static void multipleTable(int number) {
		System.out.println("**for loop Example 3: Print multiple table of a number except for 5**");
		int multiple;

		for (int i = 1; i <= 10; i++) {
			multiple = number * i;
			if (i == 5) {
				continue;
			}
			System.out.println(number + " * " + i + " = " + multiple);
		}

	}

	/*
	 * 4. print the first n numbers of the Fibonacci sequence using a for loop
	 * 
	 * @param n to print first n numbers of fibonacci series
	 */

	public void printFibonaccisequence(int n) {
		System.out.println("**for loop Example 4: Print the first n numbers of the fibonacci series**");
		int a = 0, b = 1, next;
		for (int i = 0; i < n; i++) {
			System.out.println(a);
			next = a + b;
			a = b;
			b = next;
		}
	}

	/*
	 * 5. Sum of numbers 1 to n
	 * 
	 * @param n number limit
	 * 
	 * @return sum of the numbers
	 */

	public int sumOfNumbers(int n) {
		System.out.println("**for loop Example 5: sum of numbers from 1 to n");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
			if (i == 7) {
				break;
			}
		}
		return sum;
	}

}
