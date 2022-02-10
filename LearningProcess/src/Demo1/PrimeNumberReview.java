package Demo1;

import java.util.Scanner;

public class PrimeNumberReview {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter starting range : ");
		int start = scanner.nextInt();
		System.out.print("Enter ending range : ");
		int end = scanner.nextInt();
		int count;
		for (int i = start; i <= end; i++) {
		
			count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count = count + 1;
			}
			if (count == 2)
				System.out.println(i);
		}

	}

}
