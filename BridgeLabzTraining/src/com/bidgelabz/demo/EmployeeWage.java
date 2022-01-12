package com.bidgelabz.demo;

public class EmployeeWage {

	static void displayStart() {
		System.out.println("Welcome To Employee Wage Computation Program On Master Branch");
	}

	static void attendance() {
		int IS_PRESENT = 1;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_PRESENT) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	static void dailyEmpWage() {

		double wagePerHour = 20;
		double hourFullDay = 8;
		double empWage;

		empWage = wagePerHour * hourFullDay;
		System.out.println("Daily Wage of full time Employee is: " + empWage);

	}

	static void partTimeWage() {

		double partTimeHour = 8;
		double wagePerHour = 20;
		double empWage;
		empWage = wagePerHour * partTimeHour;
		System.out.println("Part time wage is : " + empWage);

	}

	static void solvingUsingSwitchCase() {

		double empCheck = Math.floor(Math.random() * 10) % 2;
		switch ((int) empCheck) {
		case 1:
			System.out.println("Employee is Present");
			break;
		case 0:
			System.out.println("Employee is absent");
			break;
		}

		double wagePerHour = 20;
		double hourFullDay = 8;
		double partTimeHour = 8;
		double empWage;
		double timeCheck = Math.floor(Math.random() * 10) % 2;

		switch ((int) timeCheck) {
		case 1:
			System.out.println("Employee is in full time contract.");
			empWage = wagePerHour * hourFullDay;
			System.out.println("Full Time Employee Daily wage is: " + empWage);
			break;
		case 0:
			System.out.println("Employee is in Part Time contract.");
			empWage = wagePerHour * partTimeHour;
			System.out.println("Part time daily wage is : " + empWage);
		}

	}

	static void monthlyWages() {
		double wagePerHour = 20;
		double hourFullDay = 8;
		double partTimeHour = 8;
		double empWage;
		double monthlyWage;
		double workingDay = 20;
		double timeCheck = Math.floor(Math.random() * 10) % 2;

		switch ((int) timeCheck) {
		case 1:
			System.out.println("Employee is full time");
			empWage = wagePerHour * hourFullDay;
			monthlyWage = empWage * workingDay;
			System.out.println("Full Time Employee Daily wage is: " + empWage);
			System.out.println("Full time Monthly wage is : " + monthlyWage);
			break;
		case 0:
			System.out.println("Employee is in Part Time contract.");
			empWage = wagePerHour * partTimeHour;
			monthlyWage = empWage * workingDay;
			System.out.println("Part time daily wage is : " + empWage);
			System.out.println("Part time Monthly wage is : " + monthlyWage);
			break;
		}
	}
	static void conditionCalculation() {
		
	}

	public static void main(String[] args) {
		displayStart();
		attendance();
		dailyEmpWage();
		partTimeWage();
		solvingUsingSwitchCase();
		monthlyWages();
	}
}
