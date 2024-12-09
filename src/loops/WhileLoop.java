package loops;

/*@author Harpreet, 
 * 5 examples of while loop, 
 * 2 examples of return method,
 * 1 example of continue,
 * 1 example of break,
 * 1 example of static method, 
 * 5 examples of non parameterised method
 */

public class WhileLoop {

	/*
	 * 1.Sum of digits of a number without using array
	 * 
	 * @param n number
	 * 
	 * @return sum of the digits of the number
	 */
	public static int sumOfNumber(int n) {
		System.out.println("**while loop Example 1:  Sum of digits of a number without using array **");
		int sum = 0;
		while (n != 0) {
			sum = sum + (n % 10);
			n = n / 10;
		}
		return sum;
	}

	/*
	 * 2. reverse a number
	 * 
	 * @param num number to be reverse
	 * 
	 * @return reverse of the number num
	 */

	public int reverseNumber(int num) {
		System.out.println("**while loop Example 2: Reverse a number**");
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}

	/*
	 * 3. Keep Doubling a Value Until It Exceeds a Limit
	 * 
	 * @param limit
	 */
	public void doubleTheValue(int limit) {
		System.out.println("**while loop Example 3:  Doubling a value until it exceeds a limit or reach 50**");
		int i = 1;
		while (i < limit) {
			if (i > 50) {
				break;
			}
			System.out.println(i);
			i *= 2; // 1*2=2, 2*2=4, 4
		}

	}

	/*
	 * 4. Count Down from 10 to 1
	 * 
	 */
	public void countDown() {
		System.out.println("**while loop Example 4:  Count Down from 10 to 1**");
		int count = 10;
		System.out.println("count down begins using while loop: ");
		while (count > 0) {

			System.out.println(count);

			count--;

		}
	}

	/*
	 * 5. Print Multiples of a number Between 1 and 20
	 * 
	 * @param num number of which multiple needs to find out
	 */
	public void printMultipleOfNumber(int num) {
		System.out.println("**while loop Example 5: Print multiples of a number between 1 to 20 except 10**");
		int i = 0;
		while (i <= 20) {
			i++;
			if (i % num == 0) {
				if (i == 10) {
					continue;
				}

				System.out.println(i);
			}
		}
	}

}
