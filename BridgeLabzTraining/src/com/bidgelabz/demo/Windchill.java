package com.bidgelabz.demo;
import java.util.Scanner;

public class Windchill {
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter t less than 50");
	double t = scanner.nextInt();
	System.out.println("Enter v (3 to 120)");
	double v = scanner.nextInt();
	double w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)*Math.pow(v,0.16);
	System.out.println(w);
}
}
