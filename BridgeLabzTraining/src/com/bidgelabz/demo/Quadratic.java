package com.bidgelabz.demo;

import java.util.Scanner;

public class Quadratic {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a");
		double a = scanner.nextDouble();
		System.out.println("Enter b");
		double b = scanner.nextDouble();
		System.out.println("Enter c");
		double c = scanner.nextDouble();
		double delta = b * b - 4 * a * c;
		System.out.println (delta);
		double rootDelta = Math.sqrt(delta);
		if (delta > 0) {
			System.out.println(rootDelta);
			double root1 = (-b + rootDelta) / (2 * a);
			double root2 = (-b - rootDelta) / (2 * a);
			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("error");
		}
	}
}
