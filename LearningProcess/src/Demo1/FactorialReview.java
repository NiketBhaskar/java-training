package Demo1;

import java.util.Scanner;

public class FactorialReview {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter number");
		int num = scanner.nextInt();
		long factorial = 1;
		for (int i = 1; i <= num; ++i) {

			factorial = factorial * i;
		}
		System.out.printf("Factorial of %d = %d", num, factorial);
	}
}
