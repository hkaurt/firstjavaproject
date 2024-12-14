package enhancedloop;

//5 Examples of enhanced loop(for each) and for loop

/*
 * 3. Print Numbers from 1 to 5
 */
public class PrintNumbers {

	int number; // instance variable

	// initialising var using constructor
	PrintNumbers(int number) {
		this.number = number;
	}

	public void displayNumbers() {
		System.out.println(number); // printing array of objects of class
	}

	public static void main(String[] args) {

		PrintNumbers[] numbers = { new PrintNumbers(1), new PrintNumbers(2), new PrintNumbers(3), new PrintNumbers(4),
				new PrintNumbers(5) };

		// for loop
		for (int i = 0; i < numbers.length; i++) {
			numbers[i].displayNumbers();
		}

		// for each loop
		for (PrintNumbers num : numbers) {
			num.displayNumbers();
		}
	}

}
