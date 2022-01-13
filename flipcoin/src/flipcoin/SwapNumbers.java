package flipcoin;

import java.util.Scanner;

public class SwapNumbers {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter first number");
		int first = scanner.nextInt();
		System.out.println("Enter Second number");
		int second = scanner.nextInt();

		System.out.println("Given");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		int temporary = first;
		first = second;
		second = temporary;
		System.out.println("swapping executed. Now ");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}

}
