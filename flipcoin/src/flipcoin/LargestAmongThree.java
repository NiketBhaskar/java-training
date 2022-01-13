package flipcoin;

import java.util.Scanner;

public class LargestAmongThree {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[]args) {
		System.out.println("Enter first number");
		int num1= scanner.nextInt();
		System.out.println("Enter second number");
		int num2= scanner.nextInt();
		System.out.println("Enter thired number");
		int num3= scanner.nextInt();
	
		if (num1 == Math.max(num1, num2)) {
			if(num1 == Math.max(num1,num3) ) {
				System.out.println(num1+ " is largest");
			}
			else {
				System.out.println(num3+ " is largest");
			}
		}
		else if (num2 == Math.max(num2, num3)){
			System.out.println(num2+ " is largest");
		}
		else {
			System.out.println(num3+ " is largest");
		}
		}
	}
