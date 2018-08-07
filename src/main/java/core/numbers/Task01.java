package core.numbers;

public class Task01 {

	/***
	 * Problem: Write a program which will print all even numbers up to given
	 * number.
	 * 
	 * Definition: Even number is an integer (including 0), which is divisible by 2.
	 ***/

	public static void main(String[] args) {
		printEvenNumbers(10);
	}

	private static void printEvenNumbers(int number) {
		System.out.print("Even numbers are: ");
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
