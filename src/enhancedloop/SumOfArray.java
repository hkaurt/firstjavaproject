package enhancedloop;

public class SumOfArray {
	/*
	 * 5.Add elements of an array
	 */
	public static void main(String[] args) {

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
