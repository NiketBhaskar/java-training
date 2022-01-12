package com.bidgelabz.demo;

public class LineComparision {
	static void displayStart() {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	}

	static void cartesianSystem() {
		double x1 = 2;
		double y1 = 2;
		double x2 = 4;
		double y2 = 4;
		double lengthLine;

		lengthLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line using cartesian is : " + lengthLine);

	}
	static void equalityCheck() {
		Double length1 = Math.random();
		Double length2 = Math.random();
		
		System.out.println("Length1 = " +length1+ "   Length2 = " +length2);
		boolean equality = length1.equals(length2);
		if(equality) {
			System.out.println("Two lines are equal");
		}
		else {
			System.out.println("Lines are not equal");
		}
		
	}
	static void lineCompare() {
		Double length1 = Math.random();
		Double length2 = Math.random();
	    
		System.out.println("Length1 = " +length1+ "   Length2 = " +length2);
		if(length1 == length2) {
			System.out.println("Both Lines are  of equal length.");
		}
		else {
			if(length1 > length2){
				System.out.println("Line 1 is larger than Line 2");
				
			}
			else {
				System.out.println("Line 2 is larger than Line 1");
			}
		}
	}

	public static void main(String[] args) {
		displayStart();
		cartesianSystem();
		equalityCheck();
		lineCompare();
	}
}
