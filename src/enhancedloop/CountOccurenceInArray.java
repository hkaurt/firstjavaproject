package enhancedloop;

public class CountOccurenceInArray {
	/*
	 * 1. Count the occurrences of a specific number in an array
	 */
	public static void main(String[] args) {
		int[] numbers = { 3, 66, 88, 0, 3, 55, 3, 65, 3 };
		int targetNumber = 3;
		int count1 = 0;
		int count2 = 0;

		// using for loop
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == targetNumber) {
				count1++;
			}
		}

		System.out.println("Count the occurrences of number 3 in this array using for loop: " + count1);

		// using for each loop
		for (int number : numbers) {
			if (number == targetNumber) {
				count2++;
			}
		}

		System.out.println("Count the occurrences of number 3 in this array using for each loop: " + count2);

	}

}
