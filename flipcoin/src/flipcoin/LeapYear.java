package flipcoin;

import java.util.Scanner;

public class LeapYear {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("ENter the year");
		int year = scanner.nextInt();
		System.out.println("Entered year is "+year);
		verifyLeapyear(year);
	}
	static void verifyLeapyear(int year) {
		boolean leap = false;

	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      else
	        leap = true;
	    }
	    else
	      leap = false;
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	}
}
