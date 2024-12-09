package assignmentmonday;

import java.util.Scanner;

public class PalindromeWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Add word to check: ");
		
		String word = scanner.nextLine();

		String rev = "";
		
		for (int i = word.length() - 1; i >= 0; i--) {
			rev = rev + word.charAt(i);
		}

		if (word.equalsIgnoreCase(rev)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
		
		scanner.close();
	}

}
