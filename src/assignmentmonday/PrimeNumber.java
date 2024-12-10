package assignmentmonday;

/*
 * @author Harpreet
 * Program to print all prime numbers upto num
 * prime number is a number which is more than 1 and divisible by itself and 1.
 */

public class PrimeNumber {

	// Method to check if number is prime or not, it will return boolean value
	public static boolean checkPrimeNumber(int number) {

		// edge cases or corner cases
		if (number <= 1) {
			return false; // number is below 1 , its not prime
		}

		for (int i = 2; i < number; i++) { // smallest prime number is 2 and must not be divisible by any number less
											// than the number to check

			if (number % i == 0) {
				return false; // if remainder is zero , not prime
			}

		}

		return true; // else its prime number

	}

	// Method to print all prime numbers upto a number(num)
	public static void getPrimeNumber(int num) {

		System.out.println("Prime numbers upto: " + num);

		for (int j = 2; j <= num; j++) { // smallest prime number is 2, run checkPrimeNumber(int number) method until
											// this loop exits

			if (checkPrimeNumber(j)) { // if return of checkPrimeNumber(j) is true(means number is prime) then execute
										// the loop and print the number

				System.out.print(j + " ");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(" -2 is prime number: " + checkPrimeNumber(-2)); // negative testing

		System.out.println(" 0 is prime number: " + checkPrimeNumber(0)); // negative testing

		System.out.println(" 1 is prime number: " + checkPrimeNumber(1)); // edge case testing

		System.out.println(" 2 is prime number: " + checkPrimeNumber(2)); // edge case testing

		System.out.println(" 3 is prime number: " + checkPrimeNumber(3)); // positive testing

		getPrimeNumber(50); // output will be all prime numbers from 0 to 50

	}
}
