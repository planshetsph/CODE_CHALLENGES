package core.numbers;

public class Task04 {

	/***
	 * Problem: Write a program which will print all perfect numbers up to given
	 * number: 10,000.
	 * 
	 * Definition: A perfect number is a positive integer that is equal to the sum
	 * of its proper divisors. Examples (7): 6, 28, 496, 8_128, 33_550_336,
	 * 8_589_869_056, 137_438_691_328
	 */

	public static void main(String[] args) {

		printPerfectNumbers(10000);
	}

	private static void printPerfectNumbers(int number) {
		System.out.println("Perfect numbers are: ");
		for (int i = 2; i < number; i++) {
			int sum = 1;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					sum += k;
				}
			}

			if (sum == i) {
				System.out.print(i + ", ");
			}

		}
	}

}
