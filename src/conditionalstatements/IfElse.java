package conditionalstatements;

/*
 * @author Harpreet, 5 Examples on if_else , 2 static method examples, 2 return
 * method examples, 5 parameterised method examples
 */

public class IfElse {

	/*
	 * 1. check if given number is odd or even
	 * 
	 * @param num number
	 */
	public static void verifyEvenNumber(int num) {
		System.out.println("**if else Example 1: check if given number is odd or even**");

		if (num % 2 == 0) {
			System.out.println(num + "is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
	}

	/*
	 * 2. Check If a Number Is a Palindrome
	 * 
	 * @param number
	 * 
	 * @return result of if its palindrome or not
	 */

	public String verifyPalindromeNumber(int number) {

		System.out.println("**if else Example 2: Check If a Number Is a Palindrome**");

		int rev = 0;
		int org_num = number;
		String result;
		while (number != 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}

		if (rev == org_num) {
			result = "The number is palindrome";
		} else {
			result = "The number is not palindrome";
		}
		return result;
	}

	/*
	 * 3. Final result of student based on their score
	 * 
	 * @param score of the student
	 * 
	 * @return final result of the student based on his score
	 */

	public static String studentResult(int score) {
		System.out.println("**if else Example 3: Final result of student based on their score**");
		String result;
		if (score > 33) {
			result = "Passed";
		} else {
			result = "Failed";
		}
		return result;
	}

	/*
	 * 4. Account fee charge, monthly based on account balance <$3000 in account
	 * 
	 * @param accbal account balance to decide the charge by bank
	 */

	public void chargeAccountFee(int accbal) {
		System.out.println(
				"**if else Example 4: Account fee charge, monthly based on account balance <$3000 in account**");
		if (accbal < 3000) {
			System.out.println("Account fee charged");
		} else {
			System.out.println("account fee not charged");
		}
	}

	/*
	 * 5. if a person is above 18 adult otherwise minor
	 * 
	 * @param age age of the person
	 */
	public void checkAge(int age) {
		System.out.println("**if else Example 5:  if a person is above 18 adult otherwise minor**");
		if (age >= 18) {
			System.out.println("person is an adult");
		} else {
			System.out.println("person is minor");
		}
	}

	/*
	 * 6. Find Whether a Year is a Leap Year(Write a Java program to check whether a
	 * given year is a leap year or not. A year is a leap year if: It is divisible
	 * by 4. If divisible by 100, it should also be divisible by 400.)
	 * 
	 * @param year
	 */

	public void verifyLeapYear(int year) {
		System.out.println("**if else nested Example : Find Whether a Year is a Leap Year**");
		boolean leap = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				} else {
					leap = false;
				}
			} else {
				leap = true;
			}
		} else {
			leap = false;
		}

		if (leap) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

}
