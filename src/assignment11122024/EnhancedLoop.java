package assignment11122024;

import java.util.Arrays;

public class EnhancedLoop {

	public static void main(String[] args) {

		int[] numbers = { 3, 66, 88, 0, 3, 55, 3, 65, 3 };

		/*
		 * 1. Count the occurrences of a specific number in an array
		 */

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

		/*
		 * 2. Find largest number in an array
		 */

		int max1 = numbers[0]; // assume first element is maximum
		int max2 = numbers[0];

		// using for loop
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max1) {
				max1 = numbers[i];
			}
		}
		System.out.println("Largest number using for loop: " + max1);

		// Using for-each loop to find the largest element
		for (int number : numbers) {
			if (number > max2) {
				max2 = number;
			}
		}
		System.out.println("Largest number using for each loop: " + max2);

		// another way
		/*
		 * Arrays.sort(numbers); System.out.println("max :"+ numbers[numbers.length-1]);
		 */

		/*
		 * 3. double the numbers in an array
		 */

		int doubledNumbers1[] = new int[numbers.length];
		int doubledNumbers2[] = new int[numbers.length];

		// using for loop
		for (int i = 0; i < numbers.length; i++) {
			doubledNumbers1[i] = numbers[i] * 2;
		}
		// print doubledNumbers array
		System.out.println("Doubled Array using for loop: " + Arrays.toString(doubledNumbers1));

		int m=0;
		//using for each loop
		for(int number: numbers) {
			doubledNumbers2[m] = number*2;
			m++;
		}
		
		System.out.println("Doubled Array using for each loop: "+Arrays.toString(doubledNumbers2));
		/*
		 * 4. Reverse an array
		 */

		int[] reversedNumbers1 = new int[numbers.length];
		int[] reversedNumbers2 = new int[numbers.length];

		int j = numbers.length - 1;

		// using for loop
		System.out.println("reversed array using for loop :");
		for (int i = 0; i < numbers.length; i++) {
			reversedNumbers1[i] = numbers[numbers.length - 1 - i];
		}

		// print reversed array
		System.out.println(Arrays.toString(reversedNumbers1));

		// using for each loop
		System.out.println("reversed array using for each loop :");
		for (int number : numbers) {
			reversedNumbers2[j--] = number;
		}

		// print reversed array
		System.out.println(Arrays.toString(reversedNumbers2));

		/*
		 * 5.Sum of elements of an array
		 */

		int a[] = { 2, 6, 5, 8, 9 };

		int add = 0;
		int sum = 0;

		// using for loop
		for (int i = 0; i <= a.length - 1; i++) {
			add += a[i];
		}

		System.out.println("sum of numbers of an array using for loop : " + add);

		// using for each loop
		for (int number : a) {

			sum += number;

		}

		System.out.println("sum of numbers of array using for each loop: " + sum);

	}

}
