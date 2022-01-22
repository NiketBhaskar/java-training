package com.MedicalStore;

import java.util.Scanner;

public class Main {
	public void handleUserSelection(int choice) {
		UserInterface userInterface = new UserInterface();
		MedicineStore medicineStore = new MedicineStore();
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
			break;
		case 4:
			break;
		case 5:
			break;
		default:

		}
	}

	public void addMedicine() {
		MedicineStore medicineStore = new MedicineStore();

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

		UserInterface userinterface = new UserInterface();
		int choice = userinterface.showMainMenu();
		Main main = new Main();
		main.handleUserSelection(choice);
	}
}
