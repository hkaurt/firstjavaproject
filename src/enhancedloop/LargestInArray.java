package enhancedloop;

public class LargestInArray {
	/*
	 * 2. Find largest number in an array
	 */
	public static void main(String[] args) {
		int a[] = { 55, 10, 45, 60, 85 };
		int max = a[0]; // assume first element is maximum

		// using for loop
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Largest number using for loop: " + max);

		// Using for-each loop to find the largest element
		for (int number : a) {
			if (number > max) {
				max = number;
			}
		}
		System.out.println("Largest number using for each loop: " + max);
	}
}
