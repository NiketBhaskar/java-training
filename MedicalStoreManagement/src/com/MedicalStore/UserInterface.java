package com.MedicalStore;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	Scanner scanner = new Scanner(System.in);

	public void print(ArrayList medicineList) {
		for (Object medicine : medicineList) {
			System.out.println(medicine);
		}
	}

	public int showMainMenu() {
		System.out.println("Select");
		System.out
				.println("1. Add Medicine \n2. Remove Medicine\n" + "3. Print Medicine\n4. Update Medicine\n5. Exit  ");
		int choice = scanner.nextInt();
		return choice;
	}

	public String selectMedicine() {
		System.out.println("Enter the name of medicine to delete : ");
		String userSelection = scanner.next();
		return userSelection;
	}
}
