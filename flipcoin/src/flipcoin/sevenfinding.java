package flipcoin;

import java.util.Scanner;

public class sevenfinding {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int counter = 0;
		for (int i = 0; i <= 100; i++) {
			int n = i % 10;
			int m = (i % 100) / 10;
			if (n == 7 && m != 7) {
				counter++;
			} else if (n != 7 && m == 7) {
				counter++;
			} else if (n == 7 && m == 7) {
				counter = counter + 2;
			}

		}
		System.out.println(counter);

	}

}
