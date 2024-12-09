package conditionalstatements;

import loops.ForLoop;

public class IfElseExecution {

	public static void main(String[] args) {

		// if else 5 examples

		IfElse.verifyEvenNumber(25);

		IfElse obj = new IfElse();
		System.out.println(obj.verifyPalindromeNumber(1001));

		System.out.println("Final result of student is " + IfElse.studentResult(65));

		obj.chargeAccountFee(5000);

		obj.checkAge(15);

		obj.verifyLeapYear(2000);

	}
}
