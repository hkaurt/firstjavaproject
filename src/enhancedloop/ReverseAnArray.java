package enhancedloop;

public class ReverseAnArray {
	/*
	 * 4. Reverse an array
	 */
	public static void main(String[] args) {
		int[] numbers = { 3, 6, 8, 3, 6, 9 };
		int[] reversedNumbers = new int[numbers.length];

		int j = numbers.length - 1;

		// using for loop
		System.out.println("reversed array using for loop :");
		for (int i = 0; i < numbers.length; i++) {
			reversedNumbers[i] = numbers[numbers.length - 1 - i];
		}
		
		//print reversed array
		for (int m = 0; m < reversedNumbers.length; m++) {
			System.out.println(reversedNumbers[m]);
		}

		// using for each loop
		System.out.println("reversed array using for each loop :");
		for (int number : numbers) {
			reversedNumbers[j--] = number;
		}
		
		//print reversed array
		for (int reversed : reversedNumbers) {
			System.out.println(reversed);
		}

	}

}
