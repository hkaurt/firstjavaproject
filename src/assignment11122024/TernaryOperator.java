package assignment11122024;

public class TernaryOperator {

	// instance variable or object variables
	int number;
	String result;

	// constructor to initialize class var
	TernaryOperator(int number) {
		this.number = number;
	}

	/*
	 * 1. If a number is positive or negative
	 *
	 */
	
	public void verifyPositiveNumber() {
		System.out.println("**if else Example 1: If a number is positive or negative**");
		result = number > 0 ? " Positive" : " Negative";
		System.out.println("number is : " + result);
	}

	
	/*
	 * 2. check if given number is odd or even
	 */
	public void verifyEvenNumber() {

		System.out.println("**Example 2: check if given number is odd or even**");

		result = number % 2 == 0 ? " is Even " : " is odd ";
		System.out.println(number + result);

	}
	
	/*
	 * 3. Find largest number out of 3 numbers using ternary operator for multiple
	 * conditions
	 * 
	 * @param a,b,c
	 * 
	 * @return largest number largestNum
	 */

	public int findLargestNumber(int a, int b, int c) {
		System.out.println("**Example 3: Find largest number out of 3 numbers**");

		int largestNum = (a > b) && (a > c) ? a : b > c ? b : c;
		return largestNum;
	}


	/*
	 * 4. Check If a Number Is a Palindrome
	 * 
	 * @return boolean result
	 */

	public boolean verifyPalindromeNumber() {

		System.out.println("**Example 4: Check If a Number Is a Palindrome**");

		int orgNum = number; // local variable
		int reverseNum = 0; // local variable

		while (number != 0) {
			reverseNum = reverseNum * 10 + number % 10;
			number = number / 10;
		}

		boolean isPalindrome = reverseNum == orgNum ? true : false;
		return isPalindrome;
	}
	
	/*
	 * 5. Account fee charge, monthly based on account balance <$3000 in account
	 *
	 * @param accbal account balance to decide the charge by bank
	 */
	public void chargeAccountFee(int accbal) {
		System.out.println(
				"**if else Example 5: Account fee charge, monthly based on account balance <$3000 in account**");

		result = accbal < 3000 ? " fee Charged" : " fee not charged";
		System.out.println("account balance is: " + accbal + ":" + result);
	}

	public static void main(String[] args) {

		TernaryOperator to = new TernaryOperator(202);

		to.verifyPositiveNumber();
		to.verifyEvenNumber();
		System.out.println("largest number is : " + to.findLargestNumber(5, 8, 9));
		System.out.println(to.number + " is palindrome: " + to.verifyPalindromeNumber());
		to.chargeAccountFee(500);
		
		

	}
}
