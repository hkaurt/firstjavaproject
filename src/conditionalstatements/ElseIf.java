package conditionalstatements;

/*
 * @author Harpreet,
 * 5 examples of else if
 * 5 parameterised method
 * 5 return method
 */

public class ElseIf {

	/*
	 * 1. Find the Largest of three numbers
	 * 
	 * @param num1, num2, num3, 3 numbers to find largest one
	 * 
	 * @return largest number of 3 numbers
	 */

	public int findLargestNumber(int num1, int num2, int num3) {
		System.out.println("**else if Example 1: Find the Largest of three numbers**");
		int largest;
		if (num1 > num2 && num2 > num3) {
			largest = num1;
		}

		else if (num2 > num3 && num3 > num1) {
			largest = num2;
		}

		else {
			largest = num3;
		}
		return largest;
	}

	/*
	 * 2.Grade Calculation student's score (out of 100) and prints the corresponding
	 * grade 90-100: "A" 80-89: "B" 70-79: "C" 60-69: "D" Below 60: "F"
	 * 
	 * @param studentscore
	 * 
	 * @return grade with respect to the score of the student
	 */

	public char calculateGrade(int studentscore) {
		System.out.println("**else if Example 2: Grade Calculation of student's score out of 100**");
		char grade;
		if (90 <= studentscore && studentscore <= 100) {
			grade = 'A';
		} else if (80 <= studentscore && studentscore <= 89) {
			grade = 'B';
		} else if (70 <= studentscore && studentscore <= 79) {
			grade = 'C';
		} else if (60 <= studentscore && studentscore <= 100) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

	/*
	 * 3. To print the name of the day based on a given integer (1 to 7, where 1 =
	 * Monday, 7 = Sunday).
	 * 
	 * @param daynum day number
	 * 
	 * @return respective day of the week for given day number
	 */

	public String determineDayOfTheWeek(int daynum) {
		System.out.println("**else if Example 3: To print the name of the day based on a given integer **");

		String dayOfTheWeek;
		if (daynum == 1) {
			dayOfTheWeek = "Monday";
		} else if (daynum == 2) {
			dayOfTheWeek = "Tuesday";
		} else if (daynum == 3) {
			dayOfTheWeek = "Wednesday";
		} else if (daynum == 4) {
			dayOfTheWeek = "Thursday";
		} else if (daynum == 5) {
			dayOfTheWeek = "Friday";
		} else if (daynum == 6) {
			dayOfTheWeek = "Saturday";
		} else if (daynum == 7) {
			dayOfTheWeek = "Sunday";
		} else {
			dayOfTheWeek = "invalid day number";
		}

		return dayOfTheWeek;
	}

	/*
	 * 4. Determine Whether a Number is Positive, Negative, or Zero
	 * 
	 * @param i number to determine
	 * 
	 * @return based on number returns if its positive , negative or zero
	 */
	public String determineNumber(int i) {
		System.out.println("**else if Example 4: Determine Whether a Number is Positive, Negative, or Zero **");

		String status;
		if (i > 0) {
			status = "Positive";
		} else if (i < 0) {
			status = "negative";
		} else {
			status = "0";
		}
		return status;
	}

	/*
	 * 5. Calculate Discount Based on Membership Level: "Platinum" members get a 20%
	 * discount. "Gold" members get a 15% discount. "Silver" members get a 10%
	 * discount. Other members get a 5% discount.
	 * 
	 * @param memberCard membership card of customer
	 * 
	 */

	public String calculateDiscount(String memberCard) {
		System.out.println("**else if Example 5: Calculate Discount Based on Membership Level**");

		String discount;

		if (memberCard.equals("Platinum")) {
			discount = "20% discount ";
		} else if (memberCard.equals("Gold")) {
			discount = "15% discount ";
		} else if (memberCard.equals("Silver")) {
			discount = "10% discount ";
		} else {
			discount = "5% discount ";
		}
		return discount;
	}

	public static void main(String[] args) {
		ElseIf ei = new ElseIf();
		System.out.println("Largest o these 3 numbers is " + ei.findLargestNumber(5, 15, 50));
		System.out.println("Grade of student is " + ei.calculateGrade(85));
		System.out.println("The day is " + ei.determineDayOfTheWeek(4));
		System.out.println("Number is " + ei.determineNumber(-15));
		System.out.println("This customer is eligible for : " + ei.calculateDiscount("Gold"));
	}
}
