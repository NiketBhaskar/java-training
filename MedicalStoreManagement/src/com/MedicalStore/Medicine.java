package com.MedicalStore;

public abstract class Medicine {
	enum MedicineType{
		AYURVEDIC, ALLOPATHY, HOMEOPATHY;
	}
	String name;
	String brandName;
	MedicineType type;
	double price;

	@Override
	public String toString() {
		return "Medicine [brandName=" + brandName + ", type=" + type + ", price=" + price + "]";
	}

}
