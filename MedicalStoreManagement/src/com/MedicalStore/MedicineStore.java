package com.MedicalStore;

import java.util.ArrayList;

public class MedicineStore {
	private ArrayList<Medicine> medicineList = new ArrayList<Medicine>();

	public void add(Medicine medicine) {
		medicineList.add(medicine);
	}

	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}

	public ArrayList<Medicine> getMedicineList() {
		return medicineList;
	}

	public Medicine getMedicine(String name) {
		for (Medicine medicine : medicineList) {
			if (name.equals(medicine.name)) {
				return medicine;
			}
		}
		return null;
	}
}
