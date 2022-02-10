package com.MedicalStore;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	MedicineStore medicineStore = new MedicineStore();

	public void handleUserSelection(int choice) {
		UserInterface userInterface = new UserInterface();
		
		switch (choice) {
		case 1:
			addMedicine();
			break;
		case 2:
			String userSelection = userInterface.selectMedicine();
			Medicine medicine = medicineStore.getMedicine(userSelection);
			medicineStore.remove(medicine);
			break;
		case 3:
			userInterface.print(medicineStore.getMedicineList());
			break;
		case 4:
			updateMedicine();
			break;
		case 5:
			break;
		default:

		}
		userInterface.showMainMenu();
		handleUserSelection(choice);
	}

	public void updateMedicine() {
		UserInterface userInterface = new UserInterface();
		String medicineName = userInterface.selectMedicine();

		Medicine medicineForUpdate = medicineStore.getMedicine(medicineName);
		System.out.println(medicineForUpdate);

		int updateChoice = userInterface.showUpdateMenu();

		switch (updateChoice) {
		case 1:
			System.out.println("Current Name is : " + medicineForUpdate.name + ". Enter your new name :");
			String newName = scanner.next();
			medicineForUpdate.name = newName;
			break;
		case 2:
			System.out
					.println("Current Brand Name is : " + medicineForUpdate.brandName + ". Enter your new Brandname :");
			medicineForUpdate.brandName = scanner.next();
			break;
		case 3:
			System.out.println("Current Type is : " + medicineForUpdate.type + ". Enter your new Type :");
//			medicineForUpdate.type = scanner.next();
			break;
		case 4:
			System.out.println("Current price is : " + medicineForUpdate.type + ". Enter your new price :");
			medicineForUpdate.price = scanner.nextInt();
			break;
		case 5:
			break;
		}
	}

	public void addMedicine() {
	
		Alfalfa alfalfa = new Alfalfa();
		alfalfa.price = 120;
		BTrim btrim = new BTrim();
		btrim.price = 60;
		Chawanparas chawanparas = new Chawanparas();
		chawanparas.price = 250;
		Crocin crocin = new Crocin();
		crocin.price = 600;
		Liv52 liv52 = new Liv52();
		liv52.price = 350;
		Vicks vicks = new Vicks();
		vicks.price = 240;

		medicineStore.add(alfalfa);
		medicineStore.add(btrim);
		medicineStore.add(chawanparas);
		medicineStore.add(crocin);
		medicineStore.add(liv52);
		medicineStore.add(vicks);

	}

	public static void main(String[] args) {
		/*
		 * MedicineStore medicineStore = new MedicineStore();
		 * 
		 * Alfalfa alfalfa = new Alfalfa(); alfalfa.price = 120; BTrim btrim = new
		 * BTrim(); btrim.price = 60; Chawanparas chawanparas = new Chawanparas();
		 * chawanparas.price = 250; Crocin crocin = new Crocin(); crocin.price = 600;
		 * Liv52 liv52 = new Liv52(); liv52.price = 350; Vicks vicks = new Vicks();
		 * vicks.price = 240;
		 * 
		 * medicineStore.add(alfalfa); medicineStore.add(btrim);
		 * medicineStore.add(chawanparas); medicineStore.add(crocin);
		 * medicineStore.add(liv52); medicineStore.add(vicks);
		 * 
		 * medicineStore.remove(liv52);
		 * 
		 * UserInterface userinterface = new UserInterface();
		 * userinterface.print(medicineStore.getMedicineList());
		 */

		UserInterface userInterface = new UserInterface();
		int choice = userInterface.showMainMenu();
		Main main = new Main();
		main.handleUserSelection(choice);
	}
}
