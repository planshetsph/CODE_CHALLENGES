package core.numbers;

import java.util.Scanner;

public class Task03 {

	/***
	 * Problem: Write a program which will print all prime numbers up to given
	 * number.
	 * 
	 * Definition: A prime number is a number which only divisible by 1 and itself.
	 ***/

	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		printPrimeNumbers(number);
	}

	private static void printPrimeNumbers(int number) {
		System.out.print("Prime numbers are: ");
		for (int i = 2; i <= number; i++) {
			boolean isPrimeNumber = true;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				System.out.print(i + ", ");
			}
		}

	}

}
