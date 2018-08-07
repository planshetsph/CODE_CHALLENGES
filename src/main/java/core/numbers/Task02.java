package core.numbers;

import java.util.Scanner;

public class Task02 {

	/***
	 * Problem: Write a program which will print all odd numbers up to given number.
	 * 
	 * Definition: An odd number is an integer, which is not divisible by 2.
	 ***/

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		printOddNumbers(number);
	}

	private static void printOddNumbers(int number) {
		System.out.print("Odd numbers are: ");
		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
