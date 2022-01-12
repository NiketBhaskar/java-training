package com.bidgelabz.demo;

public class LineComparisionAlternate {
	static void displayStart() {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	}

	static double cartesianSystem(double x1,double y1,double x2,double y2) {
		double lengthLine;

		lengthLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			return lengthLine;
	}
	static void equalityCheck() {
		
		Double length1 = cartesianSystem(4,2,6,4);;
		Double length2 = cartesianSystem(5,2,10,4);;
		
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
		Double length1 = cartesianSystem(4,2,6,4);;
		Double length2 = cartesianSystem(5,2,10,4);;
	  
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
		double lengthOfLine = cartesianSystem(4,2,6,4);
		System.out.println("Length of line using cartesian is : " + lengthOfLine);

		
		equalityCheck();
		lineCompare();
	}
}
